package by.ntishkevich.singleton;

/**
 * The Initialize-on-demand-holder idiom and lazy initialization is a secure way of creating singleton object.
 * By Bill Pugh
 *
 * @author ntishkevich
 * @version 19.02.2016
 */
public class LazyInitIvoryTowerHolder {

    private LazyInitIvoryTowerHolder() {}

    private static class SingletonHolder {
        private final static LazyInitIvoryTowerHolder INSTANCE = new LazyInitIvoryTowerHolder();
    }

    public static LazyInitIvoryTowerHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
