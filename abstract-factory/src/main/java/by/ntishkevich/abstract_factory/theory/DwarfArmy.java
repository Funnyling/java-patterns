package by.ntishkevich.abstract_factory.theory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class DwarfArmy extends Army {
    static final String DESCRIPTION = "This is the Dwarf Army!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
