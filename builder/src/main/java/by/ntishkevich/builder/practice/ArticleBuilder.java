package by.ntishkevich.builder.practice;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Arrays;
import java.util.List;

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

    abstract void build() throws JsonProcessingException;
}
