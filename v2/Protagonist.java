/** Protagonist class.
 */
public class Protagonist extends Character {

	
	/** Initialize non-static fields
	 */
	private String name;
	protected String pClass;
	// private int life;
	// private int strength;
	// private int defense;
	// private double attackRating;

	protected int normDefense;
	protected int normStrength;
	//^ important for versatile "normalization"
	protected boolean isSpecialized;
	//^ Helpful later on, prevents abuse of specialization

	/** Constructor. Initialized values subject to change
	 */
	public Protagonist(String pName) {
		name = pName;

		life = 100;
		strength = normStrength = 50;
		defense = normDefense = 15;
		attackRating = 0.5;
	}

	/** Getters for various fields
	 */
	// public int getDefense(){
	// 	return defense;
	// }
	public String getName(){
		return name;
	}

	/** is it alive tho
	 */
	// public boolean isAlive(){
	// 	return (life > 0);
	// }

	/** Attack action
	 */
	// public int attack(Monster target) {
	// 	int damage; //final output of method
	// 	damage = (int)(strength * attackRating) - target.getDefense();
	// 	target.lowerHP(damage);
	// 	return damage;
	// 	//^ I guess for display purposes?
	// }

	/**
	 */
	// public void lowerHP(int damage) {
	// 	life -= damage;
	// }

	/** 
	 * Onion Knight: Lose health to increase your stats significantly.
	 * Rockman: Steady yourself for an attack, at the cost of damage.
	 * Gambler: Flip a coin. Hope it lands on the right one.
	 */
	public void specialize(){
		if (!isSpecialized) {
			normDefense = defense;
			normStrength = strength;
		}
		if (pClass == "Onion Knight") {
			life -= 20;
			defense += 5;
			strength = strength * 5 / 4;
			isSpecialized = true;
			System.out.println (name + " enrages. They take 20 damage as backlash!");
		}
		else if (pClass == "Rockman") {
			defense += 10;
			strength -= 5;
			isSpecialized = true;
			System.out.println (name + " hardens their armor!");
		}
		else if (pClass == "Gambler") {
			if (Math.random() < .5) {
				strength = strength * 2;
				System.out.println ("Lady Luck is smiling. Your strength increases massively!");
			}
			else 
				defense -=2;
				System.out.println ("Bad Luck. Get ready to take some pain.");
			isSpecialized = true;
		}
	}

	/** normalize resets the tradeoffs
	 */
	public void normalize(){
		defense = normDefense;
		strength = normStrength;
		isSpecialized = false;
	} 
	
	public String toString () {
		return "Name: " +
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
}
