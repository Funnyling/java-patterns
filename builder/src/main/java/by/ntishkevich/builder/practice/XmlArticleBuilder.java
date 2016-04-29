package by.ntishkevich.builder.practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author ntishkevich
 */
public class XmlArticleBuilder extends ArticleBuilder {

    private final ObjectMapper xmlMapper = new XmlMapper();

    @Override
    public void build() throws JsonProcessingException {
        Article article = new Article(title, authors, content);
        String xml = xmlMapper.writeValueAsString(article);
        System.out.println(xml);
    }
}
