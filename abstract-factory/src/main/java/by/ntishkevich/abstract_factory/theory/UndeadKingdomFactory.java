package by.ntishkevich.abstract_factory.theory;

/**
 * UndeadKingdomFactory concrete factory.
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public class UndeadKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new UndeadCastle();
    }

    @Override
    public Army createArmy() {
        return new UndeadArmy();
    }

    @Override
    public King createKing() {
        return new UndeadKing();
    }
}
