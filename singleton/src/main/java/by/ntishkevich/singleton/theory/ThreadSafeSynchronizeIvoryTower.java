package by.ntishkevich.singleton.theory;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */
public class ThreadSafeSynchronizeIvoryTower {

    private static ThreadSafeSynchronizeIvoryTower instance = null;

    private ThreadSafeSynchronizeIvoryTower() {}

    public synchronized static ThreadSafeSynchronizeIvoryTower getInstance() {
        /*
		 * The instance gets created only when it is called for first time.
		 * Lazy-loading
		 */
        if (instance == null) {
            instance = new ThreadSafeSynchronizeIvoryTower();
        }
        return instance;
    }
}
