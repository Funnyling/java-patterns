package by.ntishkevich.abstract_factory.theory;

/**
 * @author ntishkevich
 * @version 21.02.2016
 */
public class UndeadArmy extends Army {
    static final String DESCRIPTION = "This is the Undead Army!";

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
