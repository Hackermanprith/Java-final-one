package apcbooks.java;
import java.util.Scanner;
import java.lang.Math;
public class Baibhavschool_programs {
    public static void shopkeeper(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the article: $ ");
        double price = sc.nextDouble();
        double priceofferedbysh1 = price - ((price * 30)/100);
        double priceofferedbysh2 = price - ((price * 20)/100);
        priceofferedbysh2 -= (priceofferedbysh2 * 10)/100;
        System.out.println("Price offered by shopkeeper 1: $"+String.format("%.2f", priceofferedbysh1));
        System.out.println("Price offered by shopkeeper 2: $"+String.format("%.2f", priceofferedbysh2));
    }
    public static void camera(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the camera: $");
        double price = sc.nextDouble();
        price -= (price * 10)/100;
        price += (price * 6)/100;
        System.out.println("Final price of the item is: $"+String.format("%.2f",price));
    }
    public static void timeperiod_simplependulum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the pendulum (in meters) : ");
        double length = sc.nextDouble();
        System.out.print("Enter the value of gravity: ");
        double gravity = sc.nextDouble();
        int timeperiod = (int) (2 * 3.14 * Math.sqrt(length/gravity));
        System.out.println("Time period of the pendulum is " + timeperiod+"s");
    }
    public static void Emp_payment(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();
        double finalsaray =  (0.3 * salary + 0.15 * salary ) + salary;
        finalsaray -= salary * 0.125;
        System.out.print("Final salary is $"+finalsaray);

    }
    public static void CI() {
        double rate = 5;
        double principle = 5000;
        int time = 3;
        System.out.println();
        double interest;
        for (int i = 1; i <= time; i++) {
            interest = principle * rate/ 100;
            String suffix = "";
            principle += interest;
            if (i == 1) {
                suffix = "st year ";
            } else if (i == 2) {
                suffix = "nd year ";

            } else if (i == 3) {
                suffix = "rd year ";

            } else {
                suffix = "th year ";

            }
            System.out.println("The interest for the " + i + suffix + interest);
        }
    }
    public static void Shares(){
        int Shares_held = (2000 * 100)/(10 * 10);
        System.out.println("No. of shares held currently " + Shares_held);
        int Shares_required = 3000 - Shares_held;
        System.out.println("No. of shares to purchase = " + Shares_required);
    }
    public static void main(String[] args) {
        CI();
        Shares();

    }
}
