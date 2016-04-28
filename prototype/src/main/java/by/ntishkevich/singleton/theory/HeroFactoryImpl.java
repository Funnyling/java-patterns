package by.ntishkevich.singleton.theory;

/**
 * 
 * Concrete factory class.
 * 
 */
public class HeroFactoryImpl implements HeroFactory {

	private Mage mage;
	private Warrior warrior;

	public HeroFactoryImpl(Mage mage, Warrior warrior) {
		this.mage = mage;
		this.warrior = warrior;
	}

	public Mage createMage() {
		try {
			return mage.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Warrior createWarrior() {
		try {
			return warrior.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
