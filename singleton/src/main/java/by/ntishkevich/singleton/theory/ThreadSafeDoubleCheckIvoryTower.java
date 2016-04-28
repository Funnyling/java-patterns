package by.ntishkevich.singleton.theory;

/**
 * Double check locking
 * <p>
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * <p>
 * Broken under Java 1.4.
 *
 * @author mortezaadi@gmail.com
 * @version 20.02.2016
 */
public class ThreadSafeDoubleCheckIvoryTower {

    private static volatile ThreadSafeDoubleCheckIvoryTower INSTANCE;

    private ThreadSafeDoubleCheckIvoryTower() {}

    public static ThreadSafeDoubleCheckIvoryTower getInstance() {
        //local variable increases performance by 25 percent
        //Joshua Bloch "Effective Java, Second Edition", p. 283-284
        ThreadSafeDoubleCheckIvoryTower result = INSTANCE;
        if (result == null) {
            synchronized (ThreadSafeDoubleCheckIvoryTower.class) {
                result = INSTANCE;
                if (result == null) {
                    INSTANCE = result = new ThreadSafeDoubleCheckIvoryTower();
                }
            }
        }
        return result;
    }
}
