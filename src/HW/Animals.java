package HW;

public class Animals {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */

		String[] animal = { "Cat", "Dog", "Lion", "Snake", "Alligator" };

		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i]);

		}
		System.out.println("-------------------");

		for (String names : animal) {
			System.out.println(names);
		}
	}

}
