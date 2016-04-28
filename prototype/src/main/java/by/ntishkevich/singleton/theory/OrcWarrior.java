package by.ntishkevich.singleton.theory;

/**
 * 
 * OrcWarrior
 *
 */
public class OrcWarrior extends Warrior {

	public OrcWarrior() {
	}

	public OrcWarrior(OrcWarrior warlord) {
	}

	@Override
	public Warrior clone() throws CloneNotSupportedException {
		return new OrcWarrior(this);
	}

	@Override
	public String toString() {
		return "Orcish warrior";
	}

}
