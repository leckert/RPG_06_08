/**
 * Specialized Protagonist tank that deals less damage but has increased defenses.
 */
public class Rockman extends Protagonist {

    public Rockman(String name) {
		super(name);
		pClass = "Rockman";
		life += 25;
		strength = normStrength -= 6;
		defense = normDefense += 5;
    }

    public void specialize(){
		if (!isSpecialized) {
			normDefense = defense;
			normStrength = strength;
		}
		defense += 10;
		strength -= 5;
		isSpecialized = true;
		System.out.println (name + " hardens their armor!");
	}

	public String toString() {
		return "Class: " + pClass + " " + super.toString();
	}
}
