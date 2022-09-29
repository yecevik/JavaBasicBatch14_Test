package Study;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner aaa = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = aaa.nextInt();

		if (num >= 1 && num <= 10) {
			System.out.println("Number is small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("Number is medium");

		} else if (num >= 101 && num <= 1000) {
			System.out.println("Number is large");

		}

	}
}
