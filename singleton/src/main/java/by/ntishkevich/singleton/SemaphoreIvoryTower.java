package by.ntishkevich.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */
public class SemaphoreIvoryTower {

    private static final int MAX_AVAILABLE = 10; // лимит экземпляров списка
    private static Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);
    private static List<SemaphoreIvoryTower> instances = new ArrayList<>(MAX_AVAILABLE);

    private SemaphoreIvoryTower() {}

    public static SemaphoreIvoryTower getInstance(int index) {
        if (index >= 0 && index < instances.size()) { // доступ к элементу списка
            return instances.get(index);
        }
        if (semaphore.tryAcquire()) { // уменьшение значение семафора на 1
            SemaphoreIvoryTower semaphoreIvoryTower = new SemaphoreIvoryTower();
            instances.add(semaphoreIvoryTower);
            return semaphoreIvoryTower;
        }
        return null;
    }
}
