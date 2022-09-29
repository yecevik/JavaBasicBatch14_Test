package HW;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
	
System.out.println("Enter the city name:");
Scanner aaa=new Scanner(System.in);
String city=aaa.nextLine();
System.out.println("Enter the temperature in F: ");

float F=aaa.nextFloat();
int  cel=(int)(F-32)*5/9;


System.out.println("The temperature in the city of "+city+" is "+cel+"C");

	}

}
