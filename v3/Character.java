public class Character {
	protected int life;
	protected int strength;
	protected int defense;
	protected double attackRating;

	protected int normDefense;
	protected int normStrength;


	/** Getters for various fields
	 */
	public int getDefense(){
		return defense;
	}

	/** is it alive tho
	 */
	public boolean isAlive(){
		return (life > 0);
	}

	/**
	 */
	public void lowerHP(int damage) {
		life -= damage;
	}
	/** Attack action
	 */
	public int attack(Character target) {
		int damage; //final output of method
		damage = (int)(strength * attackRating) - target.getDefense();
		if (damage < 0) 
			damage = 0;
		target.lowerHP(damage);
		return damage;
		//^ I guess for display purposes?
	}
}