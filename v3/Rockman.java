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
		defense += 7;
		strength -= 3;
		isSpecialized = true;
		System.out.println (name + " hardens their armor!");
	}

	public String toString() {
		return "Class: " + pClass + " " + 
				"Name: " +
				name + 
			   " Current Life: " +
				life +
			   " Strength: " +
			   strength +
			   " Defense: " +
			   defense +
			   " Attack: " +
			   attackRating;
	}
	//^ When removed:
	// Rockman.java:4: error: Rockman is not abstract and does not override abstract method toString() in Protagonist
}
