package by.ntishkevich.abstract_factory.theory;

/**
 *
 * The essence of the Abstract Factory pattern is a factory interface
 * ({@link KingdomFactory}) and its implementations ({@link UndeadKingdomFactory},
 * {@link GoblinKingdomFactory}, {@link DwarfKingdomFactory}).
 * <p>
 * The example uses both concrete implementations to create a king, a castle and
 * an army.
 * @author ntishkevich
 * @version 20.02.2016
 */
public class App {

    private King king;
    private Castle castle;
    private Army army;

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    DwarfKingdomFactory getDwarfKingdomFactory() {
        return new DwarfKingdomFactory();
    }

    GoblinKingdomFactory getGoblinKingdomFactory() {
        return new GoblinKingdomFactory();
    }

    UndeadKingdomFactory getUndeadKingdomFactory() {
        return new UndeadKingdomFactory();
    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public King getKing() {
        return king;
    }

    private void setKing(final King king) {
        this.king = king;
    }

    public Castle getCastle() {
        return castle;
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }
}
