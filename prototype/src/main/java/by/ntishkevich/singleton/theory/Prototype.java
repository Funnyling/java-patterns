package by.ntishkevich.singleton.theory;

/**
 * Prototype
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public abstract class Prototype implements Cloneable {

    @Override
    protected abstract Object clone() throws CloneNotSupportedException;
}
