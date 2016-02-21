package by.ntishkevich.singleton;

/**
 * Singleton class
 * Eagerly initialized static instance guarantees thread
 * safety.
 *
 * @author ntishkevich
 * @version 18.02.2016
 */
public class IvoryTower {

    private static IvoryTower instance = new IvoryTower();

    private IvoryTower() {}

    public static IvoryTower getInstance() {
        return instance;
    }
}
