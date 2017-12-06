/**
 * Protagonist Jack of all trades. Not too specialized, relatively strong.
 */

public class OnionKnight extends Protagonist {
	
	public OnionKnight (String name) {
		super (name);
		pClass = "Onion Knight";
		life += 5;
		strength = normStrength += 0;
		defense = normDefense += 0;
	}

	public void specialize(){
		if (!isSpecialized) {
			normDefense = defense;
			normStrength = strength;
		}
			life -= 20;
			defense += 0;
			strength = strength * 5 / 4;
			isSpecialized = true;
			System.out.println (name + " enrages. They take 20 damage as backlash!");
		}
}