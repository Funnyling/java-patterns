package by.ntishkevich.singleton;

/**
 * Singleton pattern ensures that the class ({@link IvoryTower}) can have only one
 * existing instance per Java classloader instance and provides global access to it. *
 *
 * @author ntishkevich
 * @version 19.02.2016
 */
public class App {

    /**
     * Program entry point
     * @param args command line args
     */
    public static void main(String[] args) {
        IvoryTower firstInstance = IvoryTower.getInstance();
        IvoryTower secondInstance = IvoryTower.getInstance();
        System.out.println("Ivory tower #1: " + firstInstance);
        System.out.println("Ivory tower #2: " + secondInstance);

        IvoryTowerEnum firstEnumInstance = IvoryTowerEnum.INSTANCE;
        IvoryTowerEnum secondEnumInstance = IvoryTowerEnum.INSTANCE;
        System.out.println("Enum ivory tower #1: " + firstEnumInstance);
        System.out.println("Enum ivory tower #2: " + secondEnumInstance);

        LazyInitIvoryTowerHolder firstLazyIvoryInstance = LazyInitIvoryTowerHolder.getInstance();
        LazyInitIvoryTowerHolder secondLazyIvoryInstance = LazyInitIvoryTowerHolder.getInstance();
        System.out.println("Lazy singleton ivory tower #1" + firstLazyIvoryInstance);
        System.out.println("Lazy singleton ivory tower #2" + secondLazyIvoryInstance);
    }
}
