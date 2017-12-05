/** Protagonist class.
 */
public class Protagonist extends Character {

	
	/** Initialize non-static fields
	 */
	private String name;
	// private int life;
	// private int strength;
	// private int defense;
	// private double attackRating;

	private int normDefense;
	private int normStrength;
	//^ important for versatile "normalization"
	private boolean isSpecialized;
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

	/** fancy rpg mechanic 1:
	 * Trade half defense for 1.5x damage
	 */
	public void specialize(){
		if (!isSpecialized) {
			normDefense = defense;
			normStrength = strength;
		}
		defense = defense / 2;
		strength = strength * 5 / 4;
		isSpecialized = true;
	}

	/** normalize resets the tradeoffs
	 */
	public void normalize(){
		defense = normDefense;
		strength = normStrength;
		isSpecialized = false;
	} 

}