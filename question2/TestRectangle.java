package day1_practiceExercise.question2;

import java.util.Scanner;
//1.2
public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length: "); 
		int length = input.nextInt();
		
		System.out.println("Enter breath: ");
		int breath = input.nextInt();
		
		Rectangle rectangle = new Rectangle(length, breath);
		
		rectangle.calculateArea();
		rectangle.displayTheInformation();

	}
 
}
