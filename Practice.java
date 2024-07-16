package day1_practiceExercise;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0)
				System.out.println(i);

		}

	}

}
