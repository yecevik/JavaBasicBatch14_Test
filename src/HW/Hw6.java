package HW;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		System.out.println("Do you have a credit card? (true/false)");
		Scanner aaa=new Scanner(System.in);
		boolean hasCard=aaa.nextBoolean();
		
		if (hasCard) {
			System.out.println("What is the balance on the card?");
			Scanner num=new Scanner(System.in);
			int balance=num.nextInt();
			if(balance>1000) {
				System.out.println("pay off the balance please immeadiately!!!");
			}
			else {
				System.out.println("You can keep spending!");
			} 
		} else
		{System.out.println("why don't you get a credit card?");
		}
		}

	}



