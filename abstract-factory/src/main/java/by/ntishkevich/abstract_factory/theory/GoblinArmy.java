package by.ntishkevich.abstract_factory.theory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class GoblinArmy extends Army {
    static final String DESCRIPTION = "This is the Goblin Army!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
