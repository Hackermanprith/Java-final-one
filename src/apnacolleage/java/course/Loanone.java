package apnacolleage.java.course;

import java.util.*;

public class Loanone {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ammount to pay ");
		int amount = scanner.nextInt();
		System.out.print("How many months ");
		int months = scanner.nextInt();
		System.out.println("Percent of money to be paid ");
		int percentofinterest = scanner.nextInt();
		scanner.close();
		int tobepaid = 0;
		//your code goes here
		for(int i = 0; i < months; i++){
			tobepaid = (amount * percentofinterest)/ 100;
			amount = amount + tobepaid;
		}
		System.out.println("The ammount needed to pay after interest of "+percentofinterest+" is " +amount);
	}

}
