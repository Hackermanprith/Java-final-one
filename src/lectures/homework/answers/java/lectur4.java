package lectures.homework.answers.java;
import java.util.Scanner;
public class lectur4 {
    public static void exercise1(){
        Scanner dowhileloopthing = new Scanner(System.in);
        int answer;
        do{
            System.out.println("Enter your marks ");
            int marks = dowhileloopthing.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Enter 1 to start or 0 to exit");
            answer = dowhileloopthing.nextInt();
        }while (answer != 0);
    }
    public static void prime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n/2;i++){
            if(n%i ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("Its not a prime");
        }
    }
    public static void allevenbnumbers(int n ){
        System.out.println("Even numbers upto "+ n +"are: ");
        for(int i = 1;i <=n;i++){
            if (i % 2== 0) {
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        exercise1();
        System.out.print("Enter the number you wanna find if it is prime or no ");
        int primeNumber = input.nextInt();
        prime(primeNumber);
        System.out.println("Enter a number to get all even numbers upto it: ");
        int allnumbers = input.nextInt();
        allevenbnumbers(allnumbers);
    }
}
