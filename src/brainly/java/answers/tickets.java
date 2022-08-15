package brainly.java.answers;
import java.util.Scanner;
public class tickets {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age < 16 ){
            System.out.println("Ticket price is 10 ruppes");
        }
        else if(age > 16 && age < 65 ){
            System.out.println("Ticket price is 15");
        }
        else if(age > 65){
            System.out.println("Ticket is free");
        }
    }
}
