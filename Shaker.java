public class Shaker extends Employee {
	public Shaker(){
		super();
	}
	
	public void work() {
		shake();
	}
	
	public void shake() {
		setEffectivenessMultiplier(getEffectivenessMultiplier() + .02);
	}
}