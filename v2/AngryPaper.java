public class AngryPaper extends Monster{

	public AngryPaper () {
		super();
		pType = "Angry Sheet of Paper";
		life -= 20;
		strength = normStrength += 20;
		defense = normDefense -= 10;
	}

	public String toString() {
		return "Type: " + pType + " " + super.toString();
	}

}