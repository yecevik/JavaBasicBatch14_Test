package Study;

public class NestedLoops {

	public static void main(String[] args) {
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					System.out.println(a + " " + b + " " + c);
				}
			}
		}

		System.out.println("----------------------------");
//multiplication table

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + "=" + i * j);
			}
		}
		System.out.println("----------------------------");

		 
			for (int q = 0; q <= 23; q++) {
				for (int w = 0; w <= 59; w++) {
				

					System.out.println("it's " + q + ":" + w + " o'clock");
				}
			}
		}
	}


