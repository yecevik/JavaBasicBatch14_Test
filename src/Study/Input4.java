package Study;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		
				Scanner scanner=new Scanner(System.in);
				System.out.println("Name: ");
				System.out.println("age: ");
				String name=scanner.nextLine();
				int age=scanner.nextInt();
				if(age<18) {
					System.out.println("You should study"+name+"you are only "+age);
				}else {
					System.out.println("you should go to work "+name+" you are "+age);
				}
				
	}

}
