package by.ntishkevich.abstract_factory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class UndeadKing extends King {
    static final String DESCRIPTION = "This is the Undead King!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
