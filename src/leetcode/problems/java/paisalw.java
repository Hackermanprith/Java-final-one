package leetcode.problems.java;
import java.util.Scanner;
public class paisalw {
    public static double interestrate(double t,double money){
        double rate = 0;
        if(t >=5 ){
            rate =9.5;
        }
        else if(t < 5 && t >= 4){
            rate = 9.0;
        }
        else if(t < 4 && t >= 3){
            rate = 8.5;
        }
        else if(t < 3 && t >= 2){
            rate = 8.0;
        }
        else if(t < 2 && t >= 1){
            rate = 7.5;
        }
        else if(t < 1 ){
            rate = 5.5;
        }
        return rate * money * t;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of money to be taken as a loan:");
        double money = sc.nextDouble();
        System.out.println(      );
        System.out.println("Enter the number of years for which the loan is taken for months type it after decimal point if none type .0:");
        double t = sc.nextDouble();
        System.out.println(      );
        double interest = interestrate(t,money) + money;
        System.out.println("The amount to be paid back  is: " + interest);

    }
}
