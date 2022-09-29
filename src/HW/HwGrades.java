package HW;

import java.util.Scanner;

public class HwGrades {

	public static void main(String[] args) {
		Scanner aaa=new Scanner(System.in);
		
		System.out.println("Enter a Grade:");
		char grade=aaa.next().charAt(0);
		
		String derece;
		
		switch (grade) {
			
		case 'A':
			derece="Excellent!";
			break;
			
		case'B':
			derece="Good";
			break;
			
		case'C':
			derece="Average";
			break;
			
		case'D':
			derece="Bad";
			break;
			
		default:
			derece="Not Acceptable";
			break;
			
			
			
		
		}
		System.out.println("Your Grade is: "+ derece);
		

	}

}
