package Study;

import java.util.Scanner;

public class EnterMoney {

	public static void main(String[] args) {
//??Write a program to ask a user to enter item they want to buy and the price of that item. 
		// Every time user enters money, accumulate the amount and tell the user how
		// much is left to pay off.
		// If user give more money program should return a change.
		// Whenever user done with payments program should say "Thank you for shopping!"

		Scanner aaa = new Scanner(System.in);

		System.out.println("What would you like to buy?");
		String item = aaa.nextLine();
		System.out.println("How much is the item?");
		double price = aaa.nextDouble();
		System.out.println("Enter the amount");
		double amount = aaa.nextDouble();

		if (amount < price) {
			System.out.println("you have to pay " + (price - amount) + " more");

		} else if (amount > price) {
			System.out.println("you paid " + (amount - price) + " more");

		} else
			System.out.println("Thank you for shopping");

	}
}