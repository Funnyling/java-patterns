package by.ntishkevich.builder.practice;

import java.util.List;

/**
 * @author ntishkevich
 */
public interface ArticleBuilder {

    ArticleBuilder withTitle(String title);

    ArticleBuilder withContent(String content);

    ArticleBuilder withAuthors(String... authors);

    ArticleBuilder withAuthors(List<String> authors);

    void build() throws NoSuchMethodException;
}
