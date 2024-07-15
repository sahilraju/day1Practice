package day1_practiceExercise.question7;

public class TestShape {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Circle c = (Circle) circle;
		c.setRadius(10.0);
		System.out.println("Area of a circle: "+circle.calculateArea()+"\n");
		
		Shape rectangle = new Rectanglee();
		Rectanglee r = (Rectanglee) rectangle;
		r.setBreath(10.0);
		r.setLength(20.0);
		System.out.println("Area of a Rectangle: "+rectangle.calculateArea()+"\n");
		
		Shape triangle = new Triangle();
		Triangle t = (Triangle) triangle;
		t.setBase(10.0);
		t.setHeight(12.0);
		System.out.println("Area of Triangle: "+triangle.calculateArea());

	}

}
