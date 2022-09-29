package Study;

public class LoopTaskevenOddsum1111 {

	public static void main(String[] args) {
		int sum1=0;
		
		
		for ( int i=0; i<=50; sum1=sum1+(i+=2) ) {System.out.println(sum1);
		}
		
		System.out.println("------------------");
		
		
		for ( int i=1; i<=50; sum1=sum1+(i+=2) ) {System.out.println(sum1);}
		
		System.out.println("------------------");
		
		int sum=0;
        for(int i=1 ; i<=50 ; i++) {
            if(i%2==0) {
                sum= sum+i;;
             }
        }
        System.out.println("The sum of even numbers= " +sum);

        int sumOdd=0;
        for(int i=1 ; i<=50 ; i++) {
            if(i%2!=0) {
                sumOdd= sumOdd+i;;
                }

        }
        
        System.out.println("The sum of odd numbers= "+ sumOdd);
        System.out.println("------------------");
        
        int sumOddd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOddd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOddd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
	}

}
