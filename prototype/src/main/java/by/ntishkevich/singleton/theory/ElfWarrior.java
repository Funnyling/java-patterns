package by.ntishkevich.singleton.theory;

/**
 * 
 * ElfWarrior
 *
 */
public class ElfWarrior extends Warrior {

	public ElfWarrior() {
	}

	public ElfWarrior(ElfWarrior warlord) {
	}

	@Override
	public Warrior clone() throws CloneNotSupportedException {
		return new ElfWarrior(this);
	}

	@Override
	public String toString() {
		return "Elven warrior";
	}

}
