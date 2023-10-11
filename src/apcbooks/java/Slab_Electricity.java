package apcbooks.java;

import java.util.Scanner;

public class Slab_Electricity {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of units consumed: ");
        int unitsconsumed = sc.nextInt();
        double bill = 0.0;
        if(unitsconsumed <=50){
            bill = unitsconsumed * 0.50;
            System.out.println("First case applied!");
        }
        else if( unitsconsumed <=170){
            bill = (0.50 * 50)  + ((unitsconsumed-50) * 0.85);
            System.out.println("Second case applied!");
        }
        else if(unitsconsumed <= 300){
            bill = (50*0.5)+(120*0.85)+((unitsconsumed-170)*1.20);
        } else {
            bill = (50*0.5)+(120*0.85)+(130*1.2)+((unitsconsumed-300)*1.75);
        }
        System.out.println("Your bill is: "+ bill );
    }
}
