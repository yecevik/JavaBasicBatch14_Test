package HW;

public class cars {
	public static void main(String[] args) {
		/* 1. Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */

		
		String [] cars= { "Chevrolet", "Mercedes","Audi","Ford","Tesla","Cadillac"};
		
		for (String names:cars ) {System.out.println(names);}
		
		
		System.out.println("-----------------------");
		
		
		for (int i=0; i<cars.length; i++) {System.out.println(cars[i]);
			
		}
		
	}

}



