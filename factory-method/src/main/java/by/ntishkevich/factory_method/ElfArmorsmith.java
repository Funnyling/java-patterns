package by.ntishkevich.factory_method;

/**
 * Concrete subclass for creating new objects.
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public class ElfArmorsmith implements Armorsmith {

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
