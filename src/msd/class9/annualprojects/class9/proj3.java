package msd.class9.annualprojects.class9;

import java.util.Scanner;

public class proj3 {
    public static void main(String[] args) {
        System.out.print("Enter the value of x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        int sum = ((x*x) + (y*y));
        int s2 = (x + y);
        sum = sum/s2;
        System.out.println("The sum is: "+ sum);
    }
}
