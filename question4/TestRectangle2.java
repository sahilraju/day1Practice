package day1_practiceExercise.question4;

import java.util.Scanner;

public class TestRectangle2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length (Note: number should be between 0.0 and 20.0): ");
		int length = input.nextInt();
		
		System.out.print("Enter breath (Note: number should be between 0.0 and 20.0): ");
		int breath = input.nextInt();
		

		Rectangle2 rec = new Rectangle2(length, breath);
		
		rec.displayTheInformation();
		

	}
 
}
