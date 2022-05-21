package project.cinemahall.java;

import java.util.Scanner;

public class thirdproject {
	private static char[][] cinemaHall;
	public static int totalpaid;

	public static void cinemaCreate(int numberOfRows, int numberOfSeats) {
		cinemaHall = new char[numberOfRows][numberOfSeats];
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfSeats; j++) {
				cinemaHall[i][j] = 'S';
			}
		}
	}
	
	public static void cinema_printing() {
		System.out.println("Cinema: ");
		System.out.println("");
		for (int i = 1; i <= cinemaHall[0].length; i++) {
			if (i == 1) {
				System.out.print("  " + i);
			} else {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("");
		for (int i = 0; i < cinemaHall.length; i++) {
			System.out.print(i + 1);
			for (int j = 0; j < cinemaHall[0].length; j++) {
				System.out.print(" " + cinemaHall[i][j]);
			}
			System.out.println();
		}


	}
	public static void takeTicker(int seatRow, int seatNumber){
		Scanner sv = new Scanner(System.in);
		int totalseats = cinemaHall.length * cinemaHall[0].length;
		int ticketprice;
		char seatinrow = cinemaHall[seatRow -1][seatNumber - 1];
		char c2 = 'B';
		if (seatinrow == c2){
			System.out.println("Its already booked please try another seat");
			System.out.print("Enter the column no: ");
			int SeatRowtwo = sv.nextInt();
			System.out.print("Enter the seat no: ");
			int seatNumbertwo = sv.nextInt();
			takeTicker(SeatRowtwo,seatNumbertwo);
		}
		else{
			if (totalseats <= 40) {
				ticketprice = 15;
				totalpaid = totalpaid + ticketprice;
			}
			else {
				int frontHalfOfRows = cinemaHall.length/2;
				if(seatRow <= frontHalfOfRows) {
					ticketprice = 20;
					totalpaid = totalpaid + ticketprice;
				}
				else {
					ticketprice = 15;
					totalpaid = totalpaid + ticketprice;
				}
			}
			System.out.println("Ticket price $"+ ticketprice);
			cinemaHall[seatRow -1][seatNumber - 1] = 'B';

		}

	}

		public static void statistics(){
		        int totalseats = cinemaHall.length * cinemaHall[0].length;
				int totalticketssold = 0;
			for (char[] chars : cinemaHall) {
				for (int j = 0; j < cinemaHall[0].length; j++) {
					if (chars[j] == 'B') {
						totalticketssold++;
					}
				}
			}
			    int percentageofocuppancy = (totalticketssold * 100)/totalseats;
			    double percentageofoccupancyround = Math.round(percentageofocuppancy);
				System.out.println("Total seats in cinema hall: " + totalseats);
				System.out.println("Total tickets sold: " + totalticketssold);
				System.out.println("Total tickets left: " + (totalseats - totalticketssold));
				System.out.println("Total Percentage of occupancy " + percentageofoccupancyround + "%");
			    System.out.println("Total money earned: " + totalpaid);
			}
			public static void grettingandbasicsetting(){
				System.out.println("                    Welcome to Cinema Hall                  ");
				System.out.println("                  Made by Prithwish Mukherjee                ");
				Scanner inputl = new Scanner(System.in);
				System.out.print("Enter number of columns,Max columns  is 9: ");
				int numberOfRows = inputl.nextInt();
				System.out.print("Enter number of seats in a row,Max seats is 9: ");
				int numberOfSeats = inputl.nextInt();
				if(numberOfRows > 9 || numberOfSeats > 9){
					System.out.println("Sorry but number to big");
					System.out.print("Enter number of columns,Max columns  is 9: ");
					int numberOfRowstwo = inputl.nextInt();
					System.out.print("Enter number of seats in a row,Max seats is 9: ");
					int numberOfSeatstwo = inputl.nextInt();
					cinemaCreate(numberOfRowstwo, numberOfSeatstwo);
				}
				else if(numberOfRows < 0 || numberOfSeats < 0){
					System.out.println("Sorry but number to big");
					System.out.print("Enter number of columns,Max columns  is 9: ");
					int numberOfRowstwo = inputl.nextInt();
					System.out.print("Enter number of seats in a row,Max seats is 9: ");
					int numberOfSeatstwo = inputl.nextInt();
					cinemaCreate(numberOfRowstwo, numberOfSeatstwo);
				}
				else{
					cinemaCreate(numberOfRows, numberOfSeats);
				}


			}
	        public static void menu() {
				System.out.println("Your options are ");
				System.out.println("1.Buy Ticket ");
				System.out.println("2.Statistics");
				System.out.println("3.Show cinema ");
				System.out.println("4.Exit");
			}
			public static void logicandstuff(int option){
				Scanner inputk = new Scanner(System.in);
				if (option == 1) {
					System.out.print("How many tickets you wanna buy: ");
					int numberoftickets = inputk.nextInt();
					for (int k = 0; k < numberoftickets ; k++) {
						cinema_printing();
						System.out.print("Enter the seat no: ");
						int Seatno = inputk.nextInt();
						System.out.print("Enter the seat column no: ");
						int Column = inputk.nextInt();
						takeTicker(Column, Seatno);
						cinema_printing();
					}
				}
				if (option == 2) {
					statistics();
				}
				if (option == 3) {
					cinema_printing();
				}

			}
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				grettingandbasicsetting();
				while (true) {
					menu();
					System.out.print("Enter the option you wanna do ");
					int option = input.nextInt();
					logicandstuff(option);
					if (option == 4) {
						break;
					}
				}

			}
		}