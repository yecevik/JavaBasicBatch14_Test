package Study;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int time=7;
String day="Monday";

if (day.equals("Monday")) {
	if (time>7) {
		System.out.println("Lets go to office");
	}
	if (time<6) {
		System.out.println("sleep more");
	}
	else {
		System.out.println("today is not defined");
	}
}
	}

}
