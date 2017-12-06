/**
 * Protagonist Jack of all trades. Not too specialized, relatively strong.
 */

public class OnionKnight extends Protagonist {
	
	public OnionKnight (String name) {
		super (name);
		pClass = "Onion Knight";
		life += 5;
		strength = normStrength += 5;
		defense = normDefense += 5;
	}
}