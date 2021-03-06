/** Protagonist class.
 */
//When not declared as abstract:
//Protagonist.java:3: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
public abstract class Protagonist extends Character {

	/** Used to test instantiation error:
	 */
	// public static void main(String args[]) {
	// 	Protagonist error = new Protagonist();
	// 	//Error:
	// 	//Protagonist.java:10: error: Protagonist is abstract; cannot be instantiated
	// }


	/** Initialize non-static fields
	 */
	protected String name;
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
     *
     *  *** MOVED TO SUBCLASSES
	 */
	public abstract void specialize();

	/** normalize resets the tradeoffs
	 */
	public void normalize(){
		defense = normDefense;
		strength = normStrength;
		isSpecialized = false;
	} 
	
	public abstract String toString(); //{
		// return "Name: " +
		// 		name + 
		// 	   " Current Life: " +
		// 		life +
		// 	   " Strength: " +
		// 	   strength +
		// 	   " Defense: " +
		// 	   defense +
		// 	   " Attack: " +
		// 	   attackRating;
	//}
}
