package Study;

public class TemperatureCheck {

	public static void main(String[] args) {
		double temp=55;
		
		if (temp<32) {
			System.out.println("Water will freeze with temperature "+temp+"F");
			
		} else {
			System.out.println("Water will not freeze at this temperature");
		}
	}

}
