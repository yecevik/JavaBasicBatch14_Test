package Study;
import java.util.Scanner;

public class MyOwnScenario2 {

	public static void main(String[] args) {
		

Scanner aaa=new Scanner(System.in);

boolean wantVacation=aaa.nextBoolean();

if (wantVacation) { 
	System.out.println("What's your budget?");
	int budget=aaa.nextInt();

	
	System.out.println("Where do you wanna go, Bahamas or Europe? B/E");
	String vac=aaa.nextLine();
	
	if (vac.equals("e")) {
		
		System.out.println("Do you want to fly by Delta or JetBlue? D/J");
		String flight=aaa.nextLine();
		
		System.out.println("Do you want to stay at hotel or Airbnb? H/A");
		String accom=aaa.nextLine();
		
		
		if (flight.equals("d")) {
			if (accom.equals("H"))  System.out.println("You can stay "+((budget-900)/150)+" nights in Europe");
		
		
	}
	
	}
	
}
	}}
