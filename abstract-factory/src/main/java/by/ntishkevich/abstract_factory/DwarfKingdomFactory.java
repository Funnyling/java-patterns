package by.ntishkevich.abstract_factory;

/**
 * DwarfKingdomFactory concrete factory.
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public class DwarfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new DwarfCastle();
    }

    @Override
    public Army createArmy() {
        return new DwarfArmy();
    }

    @Override
    public King createKing() {
        return new DwarfKing();
    }
}
