package by.ntishkevich.builder.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ntishkevich
 */
public abstract class ArticleBuilder {

    protected String title;
    protected String content;
    protected List<String> authors;

    ArticleBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    ArticleBuilder withContent(String content) {
        this.content = content;
        return this;
    }

    ArticleBuilder withAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
        return this;
    }

    ArticleBuilder withAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    abstract void build() throws NoSuchMethodException;
}
