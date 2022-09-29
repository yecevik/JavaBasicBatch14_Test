package HW;

import java.util.Scanner;

public class HwCountries {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);

		System.out.println("Which country are you from? USA/Turkey/Russia/Germany/France");
		String country = aaa.nextLine();

		String lang;

		switch (country) {

		case "USA":
			lang = "English";

			break;

		case "Turkey":
			lang = "Turkish";
			break;

		case "Russia":
			lang = "Russian";
			break;

		case "Germany":
			lang = "German";
			break;

		case "France":
			lang = "French";
			break;

		default:
			lang = "Unknown language";
			break;

		}
		System.out.println("You are from " + country + " and you speak " + lang);
	}

}
