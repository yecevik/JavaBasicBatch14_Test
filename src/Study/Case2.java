package Study;

public class Case2 {

	public static void main(String[] args) {
		
		int day=5;
		String name;
		
		
		
		
		switch (day) {
		
		case 1:
		name = "Monday";
		break;
		
		case 2:
			name = "Tuesday";
			break;
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
		default:
			name = "invalid";
			
			break;
			
		}
		System.out.println(name);
		
		
		
		
		double discount;
		char code='C';
		
		switch (code) {
		
		case 'A':
		
		discount=0.0;
		
		case 'B':
		discount=0.1;
		
		case 'C':
		discount=0.2;
		break;
		
		default:
			discount=0.3;
		
		
		}
	}

}
