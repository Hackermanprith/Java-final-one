package project.cinemahall.java;

import java.util.Scanner;

public class second_project {

	public static void main(String[] args) {
		//vars
		int totalincome;
		int totalseats;
		int businessrows;
		
		//setting input
		Scanner input = new Scanner(System.in);
		
		//getting input
		System.out.print("Enter the number of row: ");
		int numberofRows = input.nextInt();
		System.out.print("Enter the number of seats in each row: ");
		int numberofseats = input.nextInt();
		input.close();
		//main calc
		totalseats = numberofRows * numberofseats;
		if(totalseats >= 60) {
			if(totalseats >= 70) {
				 businessrows  = 2;
			}
			else if(totalseats >= 80){
				  businessrows = 2;
			}
			else if(totalseats >= 90){
				  businessrows = 3;
			}
			else{
				 businessrows = 1;
			}
			int frontHalfOfRows = numberofRows /2;
			int backHalfOfRows = numberofRows - frontHalfOfRows - businessrows;
			
			totalincome = frontHalfOfRows * numberofseats * 8 + backHalfOfRows * numberofseats *10 + businessrows * numberofseats * 15;
			System.out.println("Your profit will be $"+totalincome);
		}
		else{
			totalincome = totalseats * 10; 
			System.out.print("Your profit will be $"+totalincome);
		}
				
	}

}
