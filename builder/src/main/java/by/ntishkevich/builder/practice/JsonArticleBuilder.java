package by.ntishkevich.builder.practice;

import com.google.gson.Gson;

/**
 * @author ntishkevich
 */
public class JsonArticleBuilder extends ArticleBuilder {

    private final Gson gson = new Gson();

    @Override
    public void build() {
        Article article = new Article(title, authors, content);
        String json = gson.toJson(article);
        System.out.println(json);
    }
}
