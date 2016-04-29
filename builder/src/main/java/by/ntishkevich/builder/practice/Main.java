package by.ntishkevich.builder.practice;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Arrays;

/**
 * @author ntishkevich
 */
public class Main {
    private final static String CONTENT = "Столбец Отправитель формируется следующим образом\n" +
            "1. При наличии заполненного поля document.person_id (исполнитель)\n" +
            "1.1. При совпадении департамента исполнителя и текущего юзера\n" +
            "При отсутствии подписи типа sign c персоной из департамента текущего юзера - person.name исполнителя, а при её наличии person.name подписавшего последним\n" +
            "1.2. При несовпадении департамента исполнителя и текущего юзера\n" +
            "Для организации исполнителя типа 1 - person.department, для типа 4 - сначала ставится person.name и в скобках COALESCE(organization.short_name, organization.name, ''), иначе COALESCE(organization.short_name, organization.name, '').\n" +
            "2. При пустом поле document.person_id\n" +
            "Для организации типа 1 берётся person.department \n" +
            "Для типов организаций 2, 3, 5 берётся первая подпись документа и от её персоны берётся COALESCE(organization.short_name, organization.name, '')\n" +
            "Для типа 4 - сначала ставится person.name и в скобках COALESCE(organization.short_name, organization.name, '').\n" +
            "Порядок подписей определяется по их id.";

    private final static String STANISLAV_YANKOVICH = "Stanislav Yankovich";
    private final static String DMITRIY_BARANOVSKIY = "Dmitriy Baranovskiy";
    private final static String TITLE = "Правило формирования столбца отправитель";


    public static void main(String[] args) throws JsonProcessingException {
        ArticleBuilder articleBuilder = new YamlArticleBuilder();
        articleBuilder.withTitle(TITLE);
        articleBuilder.withContent(CONTENT);
        articleBuilder.withAuthors(STANISLAV_YANKOVICH);
        articleBuilder.build();

        articleBuilder = new JsonArticleBuilder();
        articleBuilder.withTitle(TITLE);
        articleBuilder.withContent(CONTENT);
        articleBuilder.withAuthors(Arrays.asList(STANISLAV_YANKOVICH, DMITRIY_BARANOVSKIY));
        articleBuilder.build();

        articleBuilder = new XmlArticleBuilder();
        articleBuilder.withTitle(TITLE);
        articleBuilder.withContent(CONTENT);
        articleBuilder.withAuthors(STANISLAV_YANKOVICH, DMITRIY_BARANOVSKIY);
        articleBuilder.build();
    }
}
