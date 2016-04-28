package by.ntishkevich.abstract_factory.theory;

/**
 * KingdomFactory factory interface.
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public interface KingdomFactory {

    Castle createCastle();

    Army createArmy();

    King createKing();
}
