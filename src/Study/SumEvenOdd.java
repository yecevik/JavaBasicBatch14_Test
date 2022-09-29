package Study;

public class SumEvenOdd {

	public static void main(String[] args) {

		int even=0;
		int odd=0;
		
		for (int i = 1; i <= +50; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}

		}
		
		
		System.out.println(" even sum is "+ even); 
		System.out.println("odd sum is "+ odd); 
	}

}
