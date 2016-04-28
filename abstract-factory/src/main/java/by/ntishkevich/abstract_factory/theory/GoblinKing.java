package by.ntishkevich.abstract_factory.theory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class GoblinKing extends King {
    static final String DESCRIPTION = "This is the Goblin King!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
