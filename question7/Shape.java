package day1_practiceExercise.question7;

public abstract class Shape {
	
	abstract double calculateArea(); 

}

class Circle extends Shape {
	
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
 
	@Override
	double calculateArea() {
		
		return Math.PI * Math.pow(radius, 2); 
	} 
	
}

class Rectanglee extends Shape { 
	
	double length;
	double breath;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double width) {
		this.breath = width;
	}

	@Override
	double calculateArea() {
		
		return length*breath; 
	}

}

class Triangle extends Shape {
	
	double base;
	double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	double calculateArea() {
		
		return 0.5 * (base*height); 
	}
	
	
	
}
