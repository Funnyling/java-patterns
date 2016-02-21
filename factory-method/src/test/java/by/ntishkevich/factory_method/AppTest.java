package by.ntishkevich.factory_method;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ntishkevich
 * @version 20.02.2016
 */
public class AppTest {

    private Armorsmith elfArmorsmith;
    private Armorsmith dwarfArmorsmith;
    private Armorsmith humanArmorsmith;

    @Before
    public void setUp() {
        elfArmorsmith = new ElfArmorsmith();
        dwarfArmorsmith = new DwarfArmorsmith();
        humanArmorsmith = new HumanArmorsmith();
    }
    
    @Test
    public void testMain() {
        Armor chainArmor = humanArmorsmith.createArmor();
        assertTrue(chainArmor instanceof ChainArmor);
        assertNotNull(chainArmor);
        
        Armor plateArmor = dwarfArmorsmith.createArmor();
        assertTrue(plateArmor instanceof PlateArmor);
        assertNotNull(plateArmor);
        
        Armor leatherArmor = elfArmorsmith.createArmor();
        assertTrue(leatherArmor instanceof LeatherArmor);
        assertNotNull(leatherArmor);
        
    }

}