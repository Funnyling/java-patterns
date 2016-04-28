package by.ntishkevich.singleton.theory;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */
public class ThreadSafeVolatileIvoryTower {

    private static ThreadSafeVolatileIvoryTower instance = null;
    private volatile static boolean instanceCreated = false;

    private ThreadSafeVolatileIvoryTower() {}

    public static ThreadSafeVolatileIvoryTower getInstance() {
        if (!instanceCreated) {
            synchronized (ThreadSafeVolatileIvoryTower.class) {
                try {
                    if (!instanceCreated) {
                        instance = new ThreadSafeVolatileIvoryTower();
                        instanceCreated = true;
                    }
                } catch (Exception ignored) {
                    // Catch exceptions and operate them
                }
            }
        }
        return instance;
    }
}
