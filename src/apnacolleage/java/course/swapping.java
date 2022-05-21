package apnacolleage.java.course;
import java.util.Scanner;
public class swapping {
    public static void main(String[]args){
        //using normal

        int a = 89;
        int b = 45;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //adding user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number which will be assigned to var a");
        a = input.nextInt();
        System.out.println("Enter the second number which will be assigned to var b");
        b = input.nextInt();
        input.close();
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("");

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
