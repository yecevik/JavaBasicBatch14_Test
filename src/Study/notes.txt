package Study;

import java.util.Scanner;

public class MyOwnScenario {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		System.out.println("Do you want to go to a vacation?");

		boolean wantVacation = aaa.nextBoolean();

		if (wantVacation) {
			System.out.println("What's your budget?");
			int budget = aaa.nextInt();

			System.out.println("Where do you wanna go, Bahamas or Europe? B/E");
			char vac = aaa.next().charAt(0);

			if (vac == 'E') {

				System.out.println("Do you want to fly by Delta or JetBlue? D/J");
				String flight = aaa.next();

				System.out.println("Do you want to stay at hotel or Airbnb? H/A");
				String accom = aaa.next();

				if (flight.equals("D")) {
					if (accom.equals("H"))

						System.out.println("You can stay " + ((budget - 900) / 150) + " nights in Europe");
				}

				else if (flight.equals("D")) {
					if (accom.equals("A"))
						System.out.println("You can stay " + ((budget - 900) / 70) + " nights in Europe");
				} else if (flight.equals("J")) {
					if (accom.equals("A"))
						System.out.println("You can stay " + ((budget - 1050) / 70) + " nights in Europe");
				} else if (flight.equals("J")) {
					if (accom.equals("H"))
						System.out.println("You can stay " + ((budget - 1050) / 150) + " nights in Europe");
				}

			}

			else if (vac == 'B') {
				System.out.println(" Would you like to go by Cruise or Plane? C/P");
			}
		}

		else {
			System.out.println("Do you want to go to a Restaurant? y/n");

			char food = aaa.next().charAt(0);
			if (food == 'y') {
				System.out.println("fine dining or fast food a/b?");
				char chooseRest = aaa.next().charAt(0);
				if (chooseRest == 'a')

				{
					System.out.println("We don't have that much money. Eat at home or go to fast food restaurant b/c?");
					char ffho = aaa.next().charAt(0);
					if (ffho == 'b') {
						System.out.println(" it’s a good decision. You can save some money.");
					} else {
						System.out.println("McDonalds or KFC? m/k");
						char fast = aaa.next().charAt(0);
						if (fast == 'm') {
							System.out.println("Choose menu");
							System.out.println("1.Hamburger $10");

							System.out.println("2.Cheeseburger $15");
							System.out.println("3.Bigmac $20");
							System.out.println("4.Soda $5");
							System.out.println("5.Fries $6");
							System.out.println("6.Sundae $7");
							System.out.println("Enter 3 different number of selections");
							int selection1 = aaa.nextInt();
							if (selection1 == 1) {
								selection1 = 10;
							}
							if (selection1 == 2) {
								selection1 = 15;
							}
							if (selection1 == 3) {
								selection1 = 20;
							}
							if (selection1 == 4) {
								selection1 = 5;
							}
							if (selection1 == 5) {
								selection1 = 6;
							}
							if (selection1 == 6) {
								selection1 = 7;
							}

							int selection2 = aaa.nextInt();
							if (selection2 == 1) {
								selection2 = 10;
							}
							if (selection2 == 2) {
								selection2 = 15;
							}
							if (selection2 == 3) {
								selection2 = 20;
							}
							if (selection2 == 4) {
								selection2 = 5;
							}
							if (selection2 == 5) {
								selection2 = 6;
							}
							if (selection2 == 6) {
								selection2 = 7;
							}

							int selection3 = aaa.nextInt();
							if (selection3 == 1) {
								selection3 = 10;
							}
							if (selection3 == 2) {
								selection3 = 15;
							}
							if (selection3 == 3) {
								selection3 = 20;
							}
							if (selection3 == 4) {
								selection3 = 5;
							}
							if (selection3 == 5) {
								selection3 = 6;
							}
							if (selection3 == 6) {
								selection3 = 7;
							}

							int total1 = selection1 + selection2 + selection3;
							if (total1 <= 30) {
								System.out.println("Enjoy your meal");
							} else {
								System.out.println("You should eat at home. You don't have enough money");
							}
						} else if (fast == 'k')
							System.out.println("Choose menu");
						System.out.println("1.2pc chicken  $8");

						System.out.println("2.3 Pc Chicken $12");
						System.out.println("3.Tenders $15");
						System.out.println("4.Soda $5");
						System.out.println("5.Fries $6");
						System.out.println("6.Coleslaw $7");
						System.out.println("Enter 3 different number of selections");

						int selection11 = aaa.nextInt();

						if (selection11 == 1) {
							selection11 = 8;
						}
						if (selection11 == 2) {
							selection11 = 12;
						}
						if (selection11 == 3) {
							selection11 = 15;
						}
						if (selection11 == 4) {
							selection11 = 5;
						}
						if (selection11 == 5) {
							selection11 = 6;
						}
						if (selection11 == 6) {
							selection11 = 7;
						}

						int selection21 = aaa.nextInt();
						if (selection21 == 1) {
							selection21 = 8;
						}
						if (selection21 == 2) {
							selection21 = 12;
						}
						if (selection21 == 3) {
							selection21 = 15;
						}
						if (selection21 == 4) {
							selection21 = 5;
						}
						if (selection21 == 5) {
							selection21 = 6;
						}
						if (selection21 == 6) {
							selection21 = 7;
						}

						int selection31 = aaa.nextInt();
						if (selection31 == 1) {
							selection31 = 18;
						}
						if (selection31 == 2) {
							selection31 = 12;
						}
						if (selection31 == 3) {
							selection31 = 15;
						}
						if (selection31 == 4) {
							selection31 = 5;
						}
						if (selection31 == 5) {
							selection31 = 6;
						}
						if (selection31 == 6) {
							selection31 = 7;
						}

						{

						}
					}
				} else if (chooseRest == 'b') {
					{
						System.out.println("McDonalds or KFC? m/k");
						char fast = aaa.next().charAt(0);
						if (fast == 'm') {
							System.out.println("Choose menu");
							System.out.println("1.Hamburger $10");

							System.out.println("2.Cheeseburger $15");
							System.out.println("3.Bigmac $20");
							System.out.println("4.Soda $5");
							System.out.println("5.Fries $6");
							System.out.println("6.Sundae $7");
							System.out.println("Enter 3 different prices of selections");
							int selection1 = aaa.nextInt();
							if (selection1 == 1) {
								selection1 = 10;
							}
							if (selection1 == 2) {
								selection1 = 15;
							}
							if (selection1 == 3) {
								selection1 = 20;
							}
							if (selection1 == 4) {
								selection1 = 5;
							}
							if (selection1 == 5) {
								selection1 = 6;
							}
							if (selection1 == 6) {
								selection1 = 7;
							}

							int selection2 = aaa.nextInt();
							if (selection2 == 1) {
								selection2 = 10;
							}
							if (selection2 == 2) {
								selection2 = 15;
							}
							if (selection2 == 3) {
								selection2 = 20;
							}
							if (selection2 == 4) {
								selection2 = 5;
							}
							if (selection2 == 5) {
								selection2 = 6;
							}
							if (selection2 == 6) {
								selection2 = 7;
							}

							int selection3 = aaa.nextInt();
							if (selection3 == 1) {
								selection3 = 10;
							}
							if (selection3 == 2) {
								selection3 = 15;
							}
							if (selection3 == 3) {
								selection3 = 20;
							}
							if (selection3 == 4) {
								selection3 = 5;
							}
							if (selection3 == 5) {
								selection3 = 6;
							}
							if (selection3 == 6) {
								selection3 = 7;
							}

							int total1 = selection1 + selection2 + selection3;
							if (total1 <= 30) {
								System.out.println("Enjoy your meal");
							} else {
								System.out.println("You should eat at home. You don't have enough money");

							}

						} else {
							System.out.println("it’s a good decision. You can save some money.");
						}
					}
				}

			}
		}
	}
}
