/**
 * Protagonist character that has high risk high reward. Can quickly take out monsters but
 * is very weak defensively as a result. Relies on specializing to abuse his high strength.
 */

public class Gambler extends Protagonist {
	
	public Gambler (String name) {
		super (name);
		life += 7;
		strength = normStrength += 17;
		defense = normDefense -= 7;
	}
}