package HW;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
				System.out.println("What's your age?");
				
				int age=num.nextInt();
				if (age>=18) {
					System.out.println("You are eligiable to get a license");
				} 
				
					else {
				
					System.out.println(" What about to get a learners permit first?");
				}

	}
}

