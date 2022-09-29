package Study;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);

		System.out.println("Enter the score for Quiz?");
		int quiz = aaa.nextInt();

		System.out.println("Enter the score for Mid Term?");
		int mid = aaa.nextInt();

		System.out.println("Enter the score for Final?");
		int fin = aaa.nextInt();

		
		int avr = (quiz + mid + fin) / 3;
		String grade="null";
		
		if (avr >= 90) {

			grade = "Grade A";
		}

		else if (avr >= 70 && avr < 90) {

			grade = "Grade B";
		} else if (avr >= 50 && avr < 70) {

			grade = "Grade C";
		} else if (avr < 50) {

			grade = "Grade F";
		
		}
	}
}
