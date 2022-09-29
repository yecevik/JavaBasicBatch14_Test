package Study;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		System.out.println("Enter a day number: ");

		int num = aaa.nextInt();

		if (num >= 1 && num <= 5) {
			System.out.println("It's a weekday");
		} else if (num == 6 || num == 7) {
			System.out.println("It's weekend");
		} else {
			System.out.println("Invalid Day");
		}
	}
}
