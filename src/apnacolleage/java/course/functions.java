package apnacolleage.java.course;
import java.util.Scanner;
public class functions {
    public static String printMyname(String name){
        System.out.print("Your name is "+name);
        if(name.length() > 8){
            return " ,your name is not good";
        }else{
            return " ,Nice Name";
        }
    }
    public static int add(int a,int b){
        return a + b;
    }
    public static int multiply(int a,int b){
        int multiply = a * b;
        return multiply;
    }
    //doing non recursive approch for the tut do not think I am noob
    public static int factorial(int n){
        int factorial = 1;

        for(int i = n;i>=1;i--){
            factorial = i * factorial;
        }
        return factorial;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String bur = printMyname(name);
        System.out.println(bur);
        System.out.println();
        System.out.print("Enter the first number to add: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number to add: ");
        int num2 = input.nextInt();
        int addition = add(num1,num2);
        System.out.println("The result of addition will be:  "+addition);
        System.out.print("Enter the first number to multiply: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number to multiply: ");
        num2 = input.nextInt();
        int multiplication = multiply(num1,num2);
        System.out.println("The result of multiplication will be: "+multiplication);
        System.out.println("Enter a number to find palindrome of ");
        num1 = input.nextInt();
        int lol = factorial(num1);
        System.out.println("Factorial of " + num1 + " is "+lol);

    }
}