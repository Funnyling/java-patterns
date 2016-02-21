package by.ntishkevich.abstract_factory;

import org.junit.Before;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */
public class AppTest {
    private App app = new App();
    private KingdomFactory dwarfFactory;
    private KingdomFactory goblinFactory;
    private KingdomFactory undeadFactory;

    @Before
    public void setUp() {
        dwarfFactory = app.getDwarfKingdomFactory();
        goblinFactory = app.getGoblinKingdomFactory();
        undeadFactory = app.getUndeadKingdomFactory();
    }


}