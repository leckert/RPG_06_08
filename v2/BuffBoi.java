public class BuffBoi extends Monster{

	public BuffBoi (String name) {
		super (name);
		pClass = "Buff Boi";
		life += 20;
		strength = normStrength -= 20;
		defense = normDefense += 10;
	}

}