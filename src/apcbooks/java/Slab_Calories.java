package apcbooks.java;

import java.util.Scanner;

public class Slab_Calories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time played (less than 90 minutes): ");
        int timeplayed = sc.nextInt();
        int calx = 0;
        if(timeplayed > 90){
            System.out.println("Enter a value less than 90");
            System.exit(0);
        }
        if(timeplayed <=15){
            calx = 30 * timeplayed;
        } else if (timeplayed > 15 && timeplayed <= 45) {
            calx = (30 * 15) + ((timeplayed - 15)* 20);
        } else if (timeplayed > 45 && timeplayed <= 75) {
            calx = (30 * 15) + (45* 20) +((timeplayed - 45 ) * 30);
        } else if (timeplayed >75 && timeplayed <= 90) {
            calx = (30 * 15) + (45* 20) +(30 * 15)+((timeplayed - 75 )* 35);
        }
        System.out.println("Total calories burnt by player is "+ calx+"cal");
    }
}
