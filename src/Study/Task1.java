package Study;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		System.out.println("What's your height? (inch)");
		Scanner qqq = new Scanner(System.in);
		int height = qqq.nextInt();

		if (height < 60) {
			System.out.println("You are short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("You are medium");

		} else
			System.out.println("You are tall");

	}

}
