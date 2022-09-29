package HW;

import java.util.Scanner;

public class HwDoLoopCoffee {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask the user to pay for a
		 * coffee. Keep asking to pay for coffee until the user enters the EXACT amount
		 * . If the user gives more than coffee price --> ask them to give less, if the
		 * user gives less money then ask to give more. Once user give EXACT amount
		 * print “Please enjoy your coffee
		 */

		double price = 5.35;

		Scanner aaa = new Scanner(System.in);

		System.out.println("Please enter the exact amount to pay the coffe.");
		double pay = aaa.nextDouble();

		while (pay != price) {
			do {
				System.out.println("You should pay less!");
				pay = aaa.nextDouble();
			} while (pay > price);

			do {
				System.out.println("You should pay more!");
				pay = aaa.nextDouble();
			} while (pay < price);
			do {
				System.out.println("Enjoy!");
				pay = aaa.nextDouble();
			} while (pay == price);
		}
		
		}
	}


