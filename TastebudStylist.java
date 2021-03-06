import java.util.Random;

public class TastebudStylist extends Employee {
	public TastebudStylist() {
		super();
	}
	
	public void work() {
		makeShake();
	}
	
	public void makeShake() {
		boolean didSample = calculateChances(20);
		if (didSample == true) {
			setEffectivenessMultiplier(1.0);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier() + .1);
		}
	}
	// @BC: Great opportunity here to move this up into the superclass to avoid duplication -- even though Shakers won't use this method
	private boolean calculateChances(int chance){
		Random r = new Random() ;
		int randomNumber = r.nextInt(100);
		return (randomNumber < chance);
	}
}