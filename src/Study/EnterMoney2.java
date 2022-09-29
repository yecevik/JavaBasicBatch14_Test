package Study;

import java.util.Scanner;

public class EnterMoney2 {

	
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome!! What would you like buy? ");
    String item=scanner.nextLine();
    System.out.println("The cost of " + item + " is $25");

    int sum = 25;

    while(sum!=0) {
        System.out.println("How much are you gonna pay?");
        int amount=scanner.nextInt();
        sum=sum-amount;
        if(sum>0) {
            System.out.println("Please pay "+ sum +   " more");

        } 

        else if(sum<0) {
            System.out.println("you change is "+ (sum*-1)+ "$");
            break;
        }
        else if(sum==0) {
            System.out.println("yes. it is the correct amount");
        }
    }


}}