package by.ntishkevich.builder.practice;

import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

/**
 * @author ntishkevich
 */
public class ArticlePresenter extends Representer {

    public ArticlePresenter() {
        addClassTag(Article.class, new Tag("!!article"));
    }
}
