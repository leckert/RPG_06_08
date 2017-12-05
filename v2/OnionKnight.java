public class OnionKnight extends Protagonist {
	/**
	 * Jack of all trades. Not too specialized, relatively strong.
	 */
	public OnionKnight (String name) {
		super (name);
		life += 5;
		strength = normStrength += 5;
		defense = normDefense += 5;
	}
}