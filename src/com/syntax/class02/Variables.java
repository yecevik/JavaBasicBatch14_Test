package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="John";
		String lastname="Wick";
				String grade="14";
		String city="New York";
		String State="NY";
		String phone="=+1 999 555 5555";
		
		System.out.println("May name is "+name+" and my last name is "+ lastname);
		System.out.println("I am a " + grade+ "th grade Student");
		System.out.println("I live in " +city+ " city in "+State);
		System.out.println("My Phone Number is "+ phone);
		name="Indiana";
		 lastname="Johnes";
				 grade="5";
	 city="Los Angeles,";
		 State=" CA";
		 phone=" +1 999 111 1111";
		System.out.println("May name is "+name+" and I moved to   "+ city + State);
	
		System.out.println("My new Phone Number is "+ phone);
		
		//Rules for identifiers=names (variables,methods)
		//1. Can not use keywords as identifiers
		// String new='hello'; error
		//cannot have space in identifiers
		//String last name="john"; error space
		//identifiers cannot start with numbers int 1number=123; error started w number but can be anywhere after letters
		//identifiers cannot use any special characters like: boolean hello!=true except for $ and _
		double $price=9.99;
		float _price=5.66f;
		
		
		//naming Conventions
		//Class should start with Upper case and follow camel casing
		//variables should start with lower case and follow camel case
		String Weather="hot"; //not preferred
		String myWeather="cold";
		
		
		
		
		
		
		
	}

}
