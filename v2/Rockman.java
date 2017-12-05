public class Rockman extends Protagonist {

    public Rockman(String name) {
	super(name);
	life += 20;
	strength = normStrength -= 10;
	defense = normDefense += 10;
    }

}
