package by.ntishkevich.builder.practice;

import java.util.List;
import java.util.Objects;

/**
 * @author ntishkevich
 */
public class Article {

    private String title;

    private List<String> authors;

    private String content;

    private String hash;

    public Article(String title, List<String> authors, String content) {
        this.title = title;
        this.authors = authors;
        this.content = content;
        this.hash = Integer.toString(this.content.hashCode());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(getTitle(), article.getTitle()) &&
                Objects.equals(getAuthors(), article.getAuthors()) &&
                Objects.equals(getContent(), article.getContent()) &&
                Objects.equals(getHash(), article.getHash());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthors(), getContent(), getHash());
    }
}
