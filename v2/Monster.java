/** Monster class.
 */
public class Monster extends Character {

	/** Old stuff factored out into Character.java
	 */
		/** Initialize non-static fields
		 */
		// private int life;
		// private int strength;
		// private int defense;
		// private double attackRating;

		// private int normDefense;
		// private int normStrength;
		//^ important for versatile "normalization"
		/** Getters for various fields
	 	*/
		// public int getDefense(){
		// 	return defense;
		// }

	/** Constructor. Initialized values subject to change
	 */
	public Monster() {

		life = 75;
		strength = normStrength = 40 + (int)(Math.random() * 20);
		defense = normDefense = 5 + (int)(Math.random() * 20);
		attackRating = 0.5;

	}

	
	
	// /** is it alive tho
	//  */
	// public boolean isAlive(){
	// 	return (life > 0);
	// }

	// /** Attack action
	//  */
	// public int attack(Protagonist target) {
	// 	int damage; //final output of method
	// 	damage = (int)(strength * attackRating) - target.getDefense();
	// 	target.lowerHP(damage);
	// 	return damage;
	// 	//^ I guess for display purposes?
	// }

	// /**
	//  */
	// public void lowerHP(int damage) {
	// 	life -= damage;
	

}