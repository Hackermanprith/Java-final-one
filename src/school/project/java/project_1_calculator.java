package school.project.java;
import java.util.Scanner;
public class project_1_calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What operation would you like to perform? (+, -, *, /): ");
        String operation = input.nextLine();
        if(operation.equals("+")){
            System.out.println("Enter two numbers to add: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        }
        else if(operation.equals("-")){
            System.out.println("Enter two numbers to subtract: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
        }
        else if(operation.equals("*")){
            System.out.println("Enter two numbers to multiply: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
        }
        else if(operation.equals("/")){
            System.out.println("Enter two numbers to divide: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2));
        }
        else{
            System.out.println("Invalid operation");
        }
    }
    
}
