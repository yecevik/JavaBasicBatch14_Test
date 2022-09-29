package Study;

import java.util.Scanner;

public class LoopTask2secretNumber {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);

		int i = 7;
		int num;

		do {
			System.out.println("enter a number");
			num = aaa.nextInt();
			{
				if (i == num) {
					System.out.println("You won!");
				}

			}
		} while (num != i);

	}

}
