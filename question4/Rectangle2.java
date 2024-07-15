package day1_practiceExercise.question4;

public class Rectangle2 {

	double length;
	double breath;

	// default constructor set to values as 1
	public Rectangle2() {
		this.length = 1;
		this.breath = 1;
	}

	public Rectangle2(int len, int br) {
		setLength(len);
		setBreath(br);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {

		if (length >= 0.0 && length <= 20.0)
			this.length = length;
		else
			System.out.println("value of length must be in between 0.0 nd 20.0");

	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {

		if (breath >= 0.0 && breath <= 20.0)
			this.breath = breath;
		else
			System.out.println("value of breath must be in between 0.0 nd 20.0");
	} 

	public double calculateArea() {
		return length * breath;
	}

	public double calculatePerimeter() {
		return 2 * (length + breath);
	}

	public void displayTheInformation() {
		System.out.println("area of rectangle is " + calculateArea());
		System.out.println("perimeter of rectangle is " + calculatePerimeter());
	}

}
