/**
 * Specialized Protagonist tank that deals less damage but has increased defenses.
 */
public class Rockman extends Protagonist {

    public Rockman(String name) {
	super(name);
	life += 25;
	strength = normStrength -= 3;
	defense = normDefense += 13;
    }

}
