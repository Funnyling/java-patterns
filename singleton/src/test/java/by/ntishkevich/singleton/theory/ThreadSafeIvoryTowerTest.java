package by.ntishkevich.singleton.theory;

import org.junit.Test;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */

public class ThreadSafeIvoryTowerTest {

    private static final int NUM_THREADS = 5;

    @Test
    public void threadSafeLockSingleton() {
        ThreadSafeLockSingleton runnable = new ThreadSafeLockSingleton();
        for (int j = 0; j < NUM_THREADS; j++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static class ThreadSafeLockSingleton implements Runnable {
        @Override
        public void run() {
            ThreadSafeLockIvoryTower instance = ThreadSafeLockIvoryTower.getInstance();
            System.out.println("Thread=" + Thread.currentThread().getName() + " got instance=" + instance);
        }
    }

    @Test
    public void threadSafeSynchronizeSingleton() {
        ThreadSafeSynchronizeSingleton runnable = new ThreadSafeSynchronizeSingleton();
        for (int j = 0; j < NUM_THREADS; j++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static class ThreadSafeSynchronizeSingleton implements Runnable {
        @Override
        public void run() {
            ThreadSafeSynchronizeIvoryTower instance = ThreadSafeSynchronizeIvoryTower.getInstance();
            System.out.println("Thread=" + Thread.currentThread().getName() + " got instance=" + instance);
        }
    }

    @Test
    public void threadSafeVolatileSingleton() {
        ThreadSafeVolatileSingleton runnable = new ThreadSafeVolatileSingleton();
        for (int j = 0; j < NUM_THREADS; j++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static class ThreadSafeVolatileSingleton implements Runnable {
        @Override
        public void run() {
            ThreadSafeVolatileIvoryTower instance = ThreadSafeVolatileIvoryTower.getInstance();
            System.out.println("Thread=" + Thread.currentThread().getName() + " got instance=" + instance);
        }
    }

    @Test
    public void threadSafeDoubleCheckSingleton() {
        ThreadSafeDoubleCheckSingleton runnable = new ThreadSafeDoubleCheckSingleton();
        for (int j = 0; j < NUM_THREADS; j++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static class ThreadSafeDoubleCheckSingleton implements Runnable {
        @Override
        public void run() {
            ThreadSafeDoubleCheckIvoryTower instance = ThreadSafeDoubleCheckIvoryTower.getInstance();
            System.out.println("Thread=" + Thread.currentThread().getName() + " got instance=" + instance);
        }
    }

    @Test
    public void semaphoreSingleton() {
        for (int j = 0; j < NUM_THREADS; j++) {
            SemaphoreSingleton runnable = new SemaphoreSingleton(j);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static class SemaphoreSingleton implements Runnable {
        private int index;

        public SemaphoreSingleton(int index) {
            super();
            this.index = index;
        }

        @Override
        public void run() {
            SemaphoreIvoryTower instance = SemaphoreIvoryTower.getInstance(this.index);
            System.out.println("Thread=" + Thread.currentThread().getName() + " got instance=" + instance);
        }
    }
}