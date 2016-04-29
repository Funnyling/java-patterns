package by.ntishkevich.builder.practice;

import java.util.List;

/**
 * @author ntishkevich
 */
public class XmlArticleBuilder implements ArticleBuilder {
    @Override
    public ArticleBuilder withTitle(String title) {
        return this;
    }

    @Override
    public ArticleBuilder withContent(String content) {
        return this;
    }

    @Override
    public ArticleBuilder withAuthors(String... authors) {
        return this;
    }

    @Override
    public ArticleBuilder withAuthors(List<String> authors) {
        return this;
    }

    @Override
    public void build() throws NoSuchMethodException {
        throw new NoSuchMethodException("Not implemented yet");
    }
}
