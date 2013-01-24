import java.util.Random;

public class Simulator {
	Employee[] employees;

	public static void main(String[] args) {
		Simulator s = new Simulator();
		s.run();
	}
	
	public Simulator(){
		employees = new Employee[6];
		for (int i=0; i<2; i++){
			employees[i] = new TastebudStylist();
			employees[i].setBaseWeeklySalary(650);
		}
		for (int i=2; i<4; i++){
			employees[i] = new Moover();
			employees[i].setBaseWeeklySalary(520);
		}
		for (int i=4; i<6; i++){
			employees[i] = new Shaker();
			employees[i].setBaseWeeklySalary(440);
		}
	}
	
	public void run(){
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < 4; j++){
				for (int x = 0; x < 5; x++){
					for (Employee employee: employees){
						employee.work();
					}
				}
			for (Employee employee: employees){
				employee.earnPaycheck();
				System.out.println(employee);
			}
			}
		dancingCompetition();
		}
	}
	
	public void dancingCompetition(){
		Random r = new Random() ;
		Random q = new Random() ;
		int randomEmployee = r.nextInt(6);
		int randomSalary = q.nextInt(200-100) + 100;
		employees[randomEmployee].earnBonus(randomSalary);
	}
	
}