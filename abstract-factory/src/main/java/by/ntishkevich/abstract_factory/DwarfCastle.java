package by.ntishkevich.abstract_factory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class DwarfCastle extends Castle {
    static final String DESCRIPTION = "This is the Dwarf Castle!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
