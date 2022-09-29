package Study;

import java.util.Scanner;

public class ShortHandIf {

	public static void main(String[] args) {
		
		Scanner aaa=new Scanner (System.in);
		
		System.out.println("Enter a day number");
		int day=aaa.nextInt();
			  
			    
			    String bbb= (day<=5)? "small" :"large";
			    System.out.println(bbb);
			  }
			



	}

