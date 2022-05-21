package apnacolleage.java.course;

import java.util.Scanner;
public class Time_converter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		scanner.close();
		
		//your code goes here
		int hourtoseconds = days*24*60*60;

		System.out.println(hourtoseconds);
	}

}
