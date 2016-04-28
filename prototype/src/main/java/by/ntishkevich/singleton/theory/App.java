package by.ntishkevich.singleton.theory;

/**
 * In Prototype we have a factory class ({@link HeroFactoryImpl}) producing objects by
 * cloning the existing ones. In this example the factory's prototype objects are
 * given as constructor parameters.
 *
 * @author ntishkevich
 * @version 20.02.2016
 */
public class App {

    public static void main(String[] args) {
        HeroFactory factory;
        Mage mage;
        Warrior warrior;

        factory = new HeroFactoryImpl(new ElfMage(), new ElfWarrior());
        mage = factory.createMage();
        warrior = factory.createWarrior();
        System.out.println(mage);
        System.out.println(warrior);

        factory = new HeroFactoryImpl(new OrcMage(), new OrcWarrior());
        mage = factory.createMage();
        warrior = factory.createWarrior();
        System.out.println(mage);
        System.out.println(warrior);

    }
}
