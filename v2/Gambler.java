/**
 * Protagonist character that has high risk high reward. Can quickly take out monsters but
 * is very weak defensively as a result. Relies on specializing to abuse his high strength.
 */

public class Gambler extends Protagonist {
	
	public Gambler (String name) {
		super (name);
		pClass = "Gambler";
		life += 7;
		strength = normStrength += 17;
		defense = normDefense -= 7;
	}

	public void specialize(){
		if (!isSpecialized) {
			normDefense = defense;
			normStrength = strength;
		}
		if (Math.random() < .5) {
				strength = strength * 2;
				System.out.println ("Lady Luck is smiling. Your strength increases massively!");
			}

			else {
				defense -=10;
				System.out.println ("Bad Luck. Get ready to take some pain.");
			}
		isSpecialized = true;
	}

	public String toString() {
		return "Class: " + pClass + " " + super.toString();
	}
}