package by.ntishkevich.abstract_factory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class UndeadCastle extends Castle {
    static final String DESCRIPTION = "This is the Undead Castle!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
