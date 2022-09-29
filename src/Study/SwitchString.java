package Study;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		Scanner aaa=new Scanner(System.in);

		System.out.println("Where are you from?");
	
		String country=aaa.nextLine();
		
		String fav;
		
		
		switch (country) {
		
		case "Usa":
		fav="burgers";
		break;
		
		case "Kazakhstan":
			fav="beshparmak ";
			break;
			
		case "Turkey":
			fav="adana kebab";
			break;
			
		case "Yemen":
			fav="Mandi";
			break;
			
		case"Afghanistan":
			fav="Qaboli Kebab";
			break;
			default:
				fav="Unknown";
				break;
			
		}
		System.out.println("Your favorite food is "+ fav);
		

			
		
		}
		
	}


