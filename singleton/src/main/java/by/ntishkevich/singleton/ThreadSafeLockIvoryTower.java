package by.ntishkevich.singleton;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */
public class ThreadSafeLockIvoryTower {

    private static ThreadSafeLockIvoryTower instance = null;
    private static ReentrantLock lock = new ReentrantLock();

    private ThreadSafeLockIvoryTower() {}

    public static ThreadSafeLockIvoryTower getInstance() {
        lock.lock();
        try {
            if (instance == null) {
                instance = new ThreadSafeLockIvoryTower();
            }
        } finally {
            lock.unlock();
        }
        return instance;
    }
}
