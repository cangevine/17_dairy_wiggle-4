public abstract class Employee {
	private double effectivenessMultiplier; 
	private int baseWeeklySalary; //0 to int
	private int totalPaymentToDate; //0 to int

	public Employee() {
		effectivenessMultiplier = 1.0; 
		baseWeeklySalary = 0;
		totalPaymentToDate = 0;
	}
	
	public abstract void work();
	
	public void earnPaycheck(){
		totalPaymentToDate += effectivenessMultiplier * baseWeeklySalary;
	}
	
	public void earnBonus(int amount){
		totalPaymentToDate += amount;
	}
	
	public double getEffectivenessMultiplier(){
		return effectivenessMultiplier;
	}
	
	public int getBaseWeeklySalary(){
		return baseWeeklySalary;
	}
	
	public int getTotalPaymentToDate(){
		return totalPaymentToDate;
	}

	public void setEffectivenessMultiplier(double e){
		effectivenessMultiplier = e;
	}
	
	public void setBaseWeeklySalary(int b){
		baseWeeklySalary = b;
	}
	
	public void setTotalPaymentToDate(int p){
		totalPaymentToDate = p;
	}
	
	public String toString(){
		return "Effectiveness Multiplier: ("+getEffectivenessMultiplier()+") Baseweek Salary: ("+getBaseWeeklySalary()+") Total Payment to Date: ("+getTotalPaymentToDate()+")";
	}
}