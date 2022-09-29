package Study;

import java.util.Scanner;

public class task5Re {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		
		

		System.out.println("What's your birth month");
		String month = aaa.nextLine();
		String birth =null;
		

		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			birth ="your birth season is Winter ";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			birth ="your birth season is Spring ";}

		else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			birth ="your birth season is Summer ";

		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			birth ="your birth season is Fall ";

		}
		else { birth="Invalid Month";}
		System.out.println(birth);
	}
	

}
