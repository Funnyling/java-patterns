package by.ntishkevich.abstract_factory.theory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class GoblinCastle extends Castle {
    static final String DESCRIPTION = "This is the Goblin Castle!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
