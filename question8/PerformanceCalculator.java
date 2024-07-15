package day1_practiceExercise.question8;

public class PerformanceCalculator {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("sahil");
		employee1.setPoint(78);
		
		Employee employee2 = new Employee();
		employee2.setName("rahul");
		employee2.setPoint(88);
		
		Employee employee3 = new Employee(); 
		employee3.setName("ram");
		employee3.setPoint(49);
		
		Employee[] employeesInVastMindz = {employee1, employee2, employee3};
		
		System.out.println("Total employees: "+employeesInVastMindz.length+" and their ratings \n");
		
		for(Employee employee: employeesInVastMindz) {
			PerformingRating.checkPerformance(employee.getName(), employee.getPoint());   
		}

	}

}
