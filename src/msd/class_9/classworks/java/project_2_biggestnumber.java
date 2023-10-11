package msd.class_9.classworks.java;
import java.util.Scanner;

public class project_2_biggestnumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int no1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int no2 = input.nextInt();
        System.out.println("Enter the Third number: ");
        int no3 = input.nextInt();
        input.close(); 
        if(no1 > no2 && no1 > no3){
            System.out.println("The Biggest number is: " + no1);
            System.out.println("The Square number is: "+ no1*no1);
            System.out.println("The Cube number is: "+ no1*no1*no1);
        }
        else if(no2 > no1 && no2 > no3){
            System.out.println("The Biggest number is: " + no2);
            System.out.println("The Square number is: "+ no2*no2);
            System.out.println("The Cube number is: "+ no2*no2*no2);
        }
        else if(no3 > no1 && no3 > no2){
            System.out.println("The Biggest number is: " + no3);
            System.out.println("The Square number is: "+ no3*no3);
            System.out.println("The Cube number is: "+ no3*no3*no3);
        }
        else{
            System.out.println("The numbers are equal");
        }

    }
}
