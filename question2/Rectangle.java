package day1_practiceExercise.question2;
//1.2
public class Rectangle {

	double length;
	double breath;

	public Rectangle(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}
	
	public double calculateArea() {
		return length*breath;
	}

	public void displayTheInformation() {
		System.out.println("the area of"+length+" and "+breath+" is "+calculateArea());
	}
	
}
