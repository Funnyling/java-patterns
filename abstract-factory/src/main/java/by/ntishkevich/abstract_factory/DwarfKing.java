package by.ntishkevich.abstract_factory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class DwarfKing extends King {
    static final String DESCRIPTION = "This is the Dwarf King!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
