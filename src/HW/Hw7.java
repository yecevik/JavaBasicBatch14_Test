package HW;

import java.util.Scanner;

public class Hw7 {

	public static void main(String[] args) {
		System.out.println("Worked years?: ");
		System.out.println("Annual sallary?: ");
		System.out.println("Enter letter ");
		Scanner num1=new Scanner(System.in);
		Scanner num2=new Scanner(System.in);
		
		int year=num1.nextInt();
		int sal=num2.nextInt();
		
		
		if (year<5) {System.out.println("you are not eligibale for bonus");
		}
		
		if(year>=5&&sal>=50000) {
			System.out.println("You are eligiable for the bonus! Your bonus is 5000");
		}
		
		if (year>=5&&sal<50000)
		{System.out.println("You are eligiable for the bonus! Your bonus is 3000");}
		{
			
			
		 }
		
			}
		
	}



