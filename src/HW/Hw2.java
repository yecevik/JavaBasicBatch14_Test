package HW;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		
			
			Scanner mort=new Scanner(System.in);
			System.out.println("What is the mortgage rate?");
			double rate=mort.nextDouble();
			if (rate>4.5) {
				System.out.println("User will not buy a house");
			} else {
				System.out.println("user will buy a house");
				System.out.println("What is the price of the house?");
				Scanner value=new Scanner(System.in);
				int price=value.nextInt();
				
				if (price>200000) {
					System.out.println("User will take loan");
				}else {
					System.out.println("User will pay cash");
				}
				
			}
		

		}

	

	}


