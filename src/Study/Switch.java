package Study;

public class Switch {

	public static void main(String[] args) {
		char choise= 'Y';
		String Answer;
		
		switch (choise) {
		
		case 'Y':
			Answer="Yes";
			
			break;
			
			case'N':
			
			Answer="No";
			
			break;
			
			case 'W':
				
				Answer="Maybe";
				
				break;
				
			default:
				
				Answer="Unknown";
				break;
				
		}
					System.out.println(Answer);
		
	}
		}
	


