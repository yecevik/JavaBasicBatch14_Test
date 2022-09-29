package HW;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
		System.out.println("What is the loan amount?");
		
		double amount=loan.nextDouble();
		
				if (amount<=200000) {
					System.out.println("Congrats! I will lend you the loan!");
				} else { 
					System.out.println("You are not eligiable to get a loan, Sorry");
				}

	}

}
