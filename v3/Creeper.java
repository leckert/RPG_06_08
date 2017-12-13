public class Creeper extends Monster{

	public Creeper () {
		super();
		pType = "Creeper";
		life += 11;
		strength = normStrength += 13;
		defense = normDefense -= 8;
	}


	public String toString() {
		return "Type: " + pType + " " + super.toString();
	}

}