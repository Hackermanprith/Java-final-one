package msd.class_9.classworks.java;
import java.util.Scanner;

public class prawnno {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sqrott = (int) Math.sqrt(num);
        System.out.println(((sqrott*(sqrott+1)) == num) ? "It is Pronic number" : "Not a Pronic number");
    }
}
