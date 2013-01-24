import java.util.Random;

public class Moover extends Employee {
	public Moover() {
		super();
	}
	
	public void work() {
		takeOrder(); 
		deliverShake();
	}
	
	public void takeOrder() {
		boolean didForgetOrder = calculateChances(20);
		if (didForgetOrder == true) {
			setEffectivenessMultiplier(getEffectivenessMultiplier() - .1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier() + .05);
		}
	}
	
	public void deliverShake() {
		boolean didForgetOrder = calculateChances(20);
		if (didForgetOrder == true) {
			setEffectivenessMultiplier(getEffectivenessMultiplier() - .1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier() + .05);
		}
	}
	
	private boolean calculateChances(int chance){
		Random r = new Random() ;
		int randomNumber = r.nextInt(100);
		return (randomNumber < chance);
	}
}