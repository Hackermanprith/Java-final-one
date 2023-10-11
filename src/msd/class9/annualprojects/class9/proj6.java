package msd.class9.annualprojects.class9;

import java.util.Scanner;

public class proj6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number 3 : ");
        int num3 = sc.nextInt();
        System.out.print("Enter a number 4 : ");
        int num4 = sc.nextInt();
        System.out.print("Enter a number 5 : ");
        int num5 = sc.nextInt();
        System.out.print("Enter a number 6 : ");
        int num6 = sc.nextInt();
        System.out.print("Enter a number 7: ");
        int num7 = sc.nextInt();
        System.out.print("Enter a number 8 : ");
        int num8 = sc.nextInt();
        System.out.print("Enter a number 9 : ");
        int num9 = sc.nextInt();
        System.out.print("Enter a number 10 : ");
        int num10 = sc.nextInt();
        if(num1 <num2&& num2 <num3 && num3 <num4 && num4 < num5 && num5 < num6 && num6 <num7 && num7 <num8 && num8 <num9 &&num9<num10){
            System.out.println("It is in accending order");
        }
        else{
            System.out.println("It is not in accending order");
        }
    }
}
