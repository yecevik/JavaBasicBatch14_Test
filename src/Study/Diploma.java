package Study;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma? true/false?");
		boolean hasDiploma=scanner.nextBoolean();
		
		if (hasDiploma) {
			System.out.println("Congrats!!!");
			System.out.println("What is your GPA Score?");
		} 
		double gpa=scanner.nextDouble();
		System.out.println();
		if (gpa>=3.5) {
			System.out.println("You are eligiable for scholarship");}
			else {
				System.out.println("You should have stuied harder");
			} 
		if(hasDiploma==false);
		System.out.println("Go back to school");
		
			}
		
		
	
	
	}


