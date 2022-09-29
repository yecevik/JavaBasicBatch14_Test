package HW;

public class LargestNumber {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int []num= {23, 56,138,71, 879};
		int a=num[0];
		for (int i=0; i<num.length; i++) {if (num[i]>a) a=num[i];
		}
			System.out.println(a);
		

	}

}
