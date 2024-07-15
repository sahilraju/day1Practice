package day1_practiceExercise.question8;

public class Employee {
	
	String name;
	int point;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

} 

class PerformingRating {
	
	final static int outstanding = 5;
	final static int good = 4;
	final static int average = 3;
	final static int poor = 2; 
	
	static void checkPerformance(String empName, int point) {  
		
		if(point >= 80 && point <= 100) {
			System.out.println(empName+" has performed with a Rating "+outstanding+"\n"); 
		}else if(point >=60 && point <= 79)
		    System.out.println(empName+" has performed with a Rating "+good+"\n");
		else if(point >= 50 && point <= 59)
			System.out.println(empName+" has performed with a Rating "+average+"\n");
		else
			System.out.println(empName+" has performed with a Rating "+poor+"\n");
		
	}
	
	
}
