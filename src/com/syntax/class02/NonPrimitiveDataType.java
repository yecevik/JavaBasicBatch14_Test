package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is just one examples of non primitive data type
		
		String name="Asma";
		
		String Address="123 Adress street";
		
		String phone="123 456 7890";
		
		int Age=17;
		
		//Anything inside "" must be STRING int age="17"; wont work String Age="17";
		
		
		String Character="A";
		
		
		System.out.println(name);
		System.out.println(Address);
		System.out.println(phone);
		System.out.println(Age);
		//"My MName is" Asma
		
		System.out.println("My Name is "+name);
		
		//Asma is 17
		System.out.println(name +" is "+ Age);
		
		String Fruit="Apple";
		double Price=1.99;
		System.out.println("The price of the "+ Fruit+ " is " +Price);
		Fruit="mango";
		Price=5.99;
		
		System.out.println("The price of the "+ Fruit+ " is " +Price);
		
		//to attach any value to a string use + next to string acts as Concatenation
		
		
	}

}
