package apcbooks.java;
import java.util.Scanner;
public class Slab_Calls {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of calls made : ");
        int totalunitsconsumed = sc.nextInt();
        double totalbill = 0.0;
        if(totalunitsconsumed <= 50){
            totalbill += totalunitsconsumed * 0.50;
            System.out.println("Forst case");

        }
        else if(totalunitsconsumed > 50 && totalunitsconsumed <= 150){
            totalbill = (50*0.5) +  (totalunitsconsumed-50) * 0.75;
            System.out.println("Second case applied");

        }
        else if(totalunitsconsumed >= 150 && totalunitsconsumed <= 250){
            totalbill=(50*0.5)+(100*0.75)+((totalunitsconsumed-150)*1.2);
            System.out.println("Second last case applied");


        }
        else{
            totalbill=(50*0.5)+(100*0.75)+(100*1.2)+((totalunitsconsumed-250)*1.5);
            System.out.println("Last case applied");
        }
        totalbill += (20*totalbill)/100;
        System.out.println("Total bill to be paid is: "+totalbill);
    }
}
