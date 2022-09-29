package Study;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the age: ");
		int age=scanner.nextInt();
		System.out.println("entered Age is: "+age);
		if (age<18)  {
			System.out.println("You should study");
		} else {
			System.out.println("You should work");
		}
		
		
		

	}

}
