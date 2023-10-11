package msd.class_9.classworks.java;
import java.util.Scanner;
public class project_3_multiplication_table {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("The number upto: ");
        int upto = input.nextInt();
        input.close();
        for(int i = 1; i <= upto; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
