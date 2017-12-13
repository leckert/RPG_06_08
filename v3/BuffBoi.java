public class BuffBoi extends Monster{

	public BuffBoi () {
		super();
		pType = "BuffBoi";
		life += 20;
		strength = normStrength -= 20;
		defense = normDefense += 10;
	}

	public String toString() {
		return "Type: " + pType + " " + super.toString();
	}

}