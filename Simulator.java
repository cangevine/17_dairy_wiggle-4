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
		// @BC: Some of these numbers make sense (4, 5), but 6 is a magic number when you could be using the length of the array.
		//		Always beware magic numbers!
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < 4; j++){
				for (int x = 0; x < 5; x++){
					for (Employee employee: employees){
						employee.work();
					}
				}
			for (Employee employee: employees){
				employee.earnPaycheck();
				// @BC: At what point is the EM reset? It should happen weekly/ after every paycheck
				System.out.println(employee);
			}
			}
		// @BC: This isn't represented anywhere in your printout of the simulation. Would be great to see how this is affecting the simulation
		dancingCompetition();
		}
	}
	
	public void dancingCompetition(){
		// @BC: You can get away with one Random object, calling nextInt (with different arguments) twice
		Random r = new Random() ;
		Random q = new Random() ;
		int randomEmployee = r.nextInt(6);
		// @BC: This works, but so you know: it's the same thing as saying nextInt(100). The range is shifted by the + 100 afterwards
		int randomSalary = q.nextInt(200-100) + 100;
		employees[randomEmployee].earnBonus(randomSalary);
	}
	
}