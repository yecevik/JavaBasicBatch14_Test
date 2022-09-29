package HwCalculator;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner aaa = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1 = aaa.nextInt();
		System.out.println("Enter 2nd Number");
		double num2 = aaa.nextInt();
		System.out.println("Enter the operator");
		String oper=aaa.nextLine();
		char op = aaa.next().charAt(0);
		double result=0 ;

		if (op == '+') {
			System.out.println("The result is: " + (num1 + num2));
		} else if (op == '-') {
			System.out.println("The result is: " + (num1 - num2));
		} else if (op == '*') {
			System.out.println("The result is: " + (num1 * num2));
		} else if (op == '/') {
			System.out.println("The result is: " + (num1 / num2));
		} else {
			System.out.println("enter valid operator");
		}
		System.out.println("--------------------");

		switch (op) {

		case '+':
			result = (num1 + num2);
			break;
		case '-':
			result = (num1 - num2);
			break;
		case '*':
			result = (num1 * num2);
			break;
		case '/':
			result = (num1 / num2);
			break;

		default:
			
			break;
			
		}
		if((op=='/') || (op=='*') ||(op=='+') ||(op=='-')) {
			System.out.println("The Result is: "+result);
		}
		else
		System.out.println("Enter valid operator");
		
	}

}
