package by.ntishkevich.builder.practice;

import org.yaml.snakeyaml.Yaml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ntishkevich
 */
public class YamlArticleBuilder implements ArticleBuilder {

    private String title;
    private String content;
    private List<String> authors;
    private final Yaml yaml = new Yaml();

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
        String yamlObject = yaml.dump(article);
        System.out.println(yamlObject);
    }
}
