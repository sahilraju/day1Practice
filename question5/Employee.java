package day1_practiceExercise.question5;

public class Employee {
	
	int employeeId;
	String employeeName;
	//user defined Date class
	Date joiningDate; 

	public Employee(int employeeId, String employeeName, Date joiningDate) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}

	
	public void displayTheInformationOfEmployee() {
		System.out.println("Employee ID: "+this.employeeId);
		System.out.println("Employee Name: "+this.employeeName);
		System.out.println("Employee Joining Date: "+this.joiningDate.toString()+"\n");  
	}


	public static void main(String[] args) {
		 
		Date date1 = new Date(10, 06, 2023);
		Date date2 = new Date(12, 05, 2023);
		Date date3 = new Date(06, 01, 2024);
		
		Employee emp1 = new Employee(101, "sahil", date1);
		Employee emp2 = new Employee(102, "shalini", date2);
		Employee emp3 = new Employee(103, "dhanush", date3); 
		
		emp1.displayTheInformationOfEmployee();
		emp2.displayTheInformationOfEmployee();
		emp3.displayTheInformationOfEmployee();
		
	}

}
