package apnacolleage.java.course;

import java.util.Scanner;

public class Reversingastring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string to be reversed ");
		String text = scanner.nextLine();
		scanner.close();
		char[] arr = text.toCharArray();
		System.out.print("Reversed string is ");
		for(int i = arr.length-1; i>= 0;i--){
			System.out.print(arr[i]);
		}

	}

}

