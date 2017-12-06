public class AngryPaper extends Monster{

	public AngryPaper (String name) {
		super (name);
		pClass = "Angry Sheet of Paper";
		life -= 20;
		strength = normStrength += 20;
		defense = normDefense -= 10;
	}

}