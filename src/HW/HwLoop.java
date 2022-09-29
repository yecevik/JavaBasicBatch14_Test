package HW;

import java.util.Scanner;

public class HwLoop {

	public static void main(String[] args) {
// Prompt the user to ask the name 3 times and print "Good afternoon +name...

		for (int i = 1; i <= 3; i++) {
			System.out.println("What's your name?");
			Scanner aaa = new Scanner(System.in);
			String name = aaa.nextLine();
			System.out.println("Good afternoon " + name);
		}

	}

}
