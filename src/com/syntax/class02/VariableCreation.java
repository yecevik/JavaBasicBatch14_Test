package com.syntax.class02;

public class VariableCreation {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way to create variable
		byte b=10;
		
		//second way to create variable
		int i;   //crate a variable
		i=100; //assign the value or initialize a variable
		
		// we need to create a variable only once
		//then we can use it as many times we need/want during 
		
		//third way
		//create a variable=declare a variable (space)
		int num1, num2, num3;
		num1=100;
		num2=200;
		num3=300;
		
        // duplicate error int num1=100
		System.out.println(num2);
		
		//can i cahange the value of a variable? //200
		
		num2=2000; //reassign the value
		System.out.println(num2); //2000 we can change the values
		
		//1 variable can only hold 1 value at a time/ per line
		
		boolean boo=true;
				boo=false;
				System.out.println(boo);
				
		
		
		
	}

}
