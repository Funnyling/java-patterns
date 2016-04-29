package by.ntishkevich.builder.practice;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

/**
 * @author ntishkevich
 */
public class YamlArticleBuilder extends ArticleBuilder {

    private final Yaml yaml = new Yaml(new ArticlePresenter() , new DumperOptions());

    @Override
    public void build() {
        Article article = new Article(title, authors, content);
        String yamlObject = yaml.dump(article);
        System.out.println(yamlObject);
    }
}
