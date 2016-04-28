package by.ntishkevich.factory_method.theory;

/**
 *  In Factory Method we have an interface ({@link Armorsmith}) with a method for
 * creating objects ({@link Armorsmith#createArmor()}). The concrete subclasses
 * ({@link DwarfArmorsmith}, {@link HumanArmorsmith}, {@link ElfArmorsmith}) then override the method to produce
 * objects of their liking.
 *
 * @author ntishkevich
 * @version 20.02.2016
 */
public class App {

    public static void main(String[] args) {
        Armorsmith elfArmorsmith = new ElfArmorsmith();
        Armorsmith dwarfArmorsmith = new DwarfArmorsmith();
        Armorsmith humanArmorsmith = new HumanArmorsmith();

        Armor armor = humanArmorsmith.createArmor();
        System.out.println(armor);

        armor = dwarfArmorsmith.createArmor();
        System.out.println(armor);

        armor = elfArmorsmith.createArmor();
        System.out.println(armor);
    }
}
