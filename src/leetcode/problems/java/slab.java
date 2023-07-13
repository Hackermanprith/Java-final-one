package leetcode.problems.java;

import java.util.Scanner;

public class slab {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of calls: ");
        int calls = sc.nextInt();
        double charge = 0;
        if(calls > 300){
            charge = 1;
        } else if (calls > 200){
            charge = 0.70;
        } else if (calls > 100){
            charge = 0;
        }
        System.out.println("The amount to be paid : " + (charge * calls));

    }
}
