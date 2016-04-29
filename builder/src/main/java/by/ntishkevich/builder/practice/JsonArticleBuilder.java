package by.ntishkevich.builder.practice;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ntishkevich
 */
public class JsonArticleBuilder implements ArticleBuilder {

    private String title;
    private String content;
    private List<String> authors;
    private final Gson gson = new Gson();

    @Override
    public ArticleBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public ArticleBuilder withContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public ArticleBuilder withAuthors(String... authors) {
        this.authors = Arrays.stream(authors).collect(Collectors.toList());
        return this;
    }

    @Override
    public ArticleBuilder withAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    @Override
    public void build() {
        Article article = new Article(title, authors, content);
        String json = gson.toJson(article);
        System.out.println(json);
    }
}
