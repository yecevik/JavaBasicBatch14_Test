package Study;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner aaa = new Scanner(System.in);
		System.out.println("What time is it now? (24h)");
		int time = aaa.nextInt();

		if (time >= 1 && time <= 11) {
			System.out.println("It's morning");

		} else if (time >= 12 && time <= 15) {
			System.out.println("It's afternoon");

		} else if (time >= 16 && time <= 20) {
			System.out.println("It's evening");

		} else if (time >= 21 && time <= 24) {
			System.out.println("It's night");

		}
	}

}
