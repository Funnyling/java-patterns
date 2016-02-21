package by.ntishkevich.abstract_factory;

/**
 * GoblinKingdomFactory concrete factory.
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public class GoblinKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new GoblinCastle();
    }

    @Override
    public Army createArmy() {
        return new GoblinArmy();
    }

    @Override
    public King createKing() {
        return new GoblinKing();
    }
}
