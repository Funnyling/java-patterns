package by.ntishkevich.abstract_factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void king() {
        King king = app.getKing(dwarfFactory);
        assertTrue(king instanceof DwarfKing);
        assertEquals(DwarfKing.DESCRIPTION, king.getDescription());
        king = app.getKing(goblinFactory);
        assertTrue(king instanceof GoblinKing);
        assertEquals(GoblinKing.DESCRIPTION, king.getDescription());
        king = app.getKing(undeadFactory);
        assertTrue(king instanceof UndeadKing);
        assertEquals(UndeadKing.DESCRIPTION, king.getDescription());
    }

    @Test
    public void castle() {
        Castle castle = app.getCastle(dwarfFactory);
        assertTrue(castle instanceof DwarfCastle);
        assertEquals(DwarfCastle.DESCRIPTION, castle.getDescription());
        castle = app.getCastle(goblinFactory);
        assertTrue(castle instanceof GoblinCastle);
        assertEquals(GoblinCastle.DESCRIPTION, castle.getDescription());
        castle = app.getCastle(undeadFactory);
        assertTrue(castle instanceof UndeadCastle);
        assertEquals(UndeadCastle.DESCRIPTION, castle.getDescription());
    }

    @Test
    public void army() {
        Army army = app.getArmy(dwarfFactory);
        assertTrue(army instanceof DwarfArmy);
        assertEquals(DwarfArmy.DESCRIPTION, army.getDescription());
        army = app.getArmy(goblinFactory);
        assertTrue(army instanceof GoblinArmy);
        assertEquals(GoblinArmy.DESCRIPTION, army.getDescription());
        army = app.getArmy(undeadFactory);
        assertTrue(army instanceof UndeadArmy);
        assertEquals(UndeadArmy.DESCRIPTION, army.getDescription());
    }

    @Test
    public void undeadKingdom() {
        app.createKingdom(undeadFactory);
        Army army = app.getArmy();
        King king = app.getKing();
        Castle castle = app.getCastle();
        assertTrue(army instanceof UndeadArmy);
        assertEquals(UndeadArmy.DESCRIPTION, army.getDescription());
        assertTrue(castle instanceof UndeadCastle);
        assertEquals(UndeadCastle.DESCRIPTION, castle.getDescription());
        assertTrue(king instanceof UndeadKing);
        assertEquals(UndeadKing.DESCRIPTION, king.getDescription());
    }

    @Test
    public void goblinKingdom() {
        app.createKingdom(goblinFactory);
        Army army = app.getArmy();
        King king = app.getKing();
        Castle castle = app.getCastle();
        assertTrue(army instanceof GoblinArmy);
        assertEquals(GoblinArmy.DESCRIPTION, army.getDescription());
        assertTrue(castle instanceof GoblinCastle);
        assertEquals(GoblinCastle.DESCRIPTION, castle.getDescription());
        assertTrue(king instanceof GoblinKing);
        assertEquals(GoblinKing.DESCRIPTION, king.getDescription());
    }

    @Test
    public void dwarfKingdom() {
        app.createKingdom(dwarfFactory);
        Army army = app.getArmy();
        King king = app.getKing();
        Castle castle = app.getCastle();
        assertTrue(army instanceof DwarfArmy);
        assertEquals(DwarfArmy.DESCRIPTION, army.getDescription());
        assertTrue(castle instanceof DwarfCastle);
        assertEquals(DwarfCastle.DESCRIPTION, castle.getDescription());
        assertTrue(king instanceof DwarfKing);
        assertEquals(DwarfKing.DESCRIPTION, king.getDescription());
    }




}