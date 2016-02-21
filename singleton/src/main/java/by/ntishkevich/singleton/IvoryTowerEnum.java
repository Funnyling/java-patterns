package by.ntishkevich.singleton;

/**
 * Enum Singleton class.
 *
 * @author ntishkevich
 * @version 18.02.2016
 */
public enum IvoryTowerEnum {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
