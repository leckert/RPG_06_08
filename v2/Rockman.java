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
}
