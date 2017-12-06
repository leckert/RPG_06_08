public class Creeper extends Monster{

	public Creeper (String name) {
		super (name);
		pClass = "Creeper";
		life += 11;
		strength = normStrength += 13;
		defense = normDefense -= 8;
	}

}