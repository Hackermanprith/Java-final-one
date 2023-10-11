package lectures.homework.answers.java;

import java.util.Scanner;

public class saranyasolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inp = sc.nextInt();
        int counter = 0;
        int dup = inp;
        while (dup > 0){
            dup /= 10;
            counter++;
        }
        while(counter/2 > 0){
            int temp = inp % 10;
            int first = inp / (int)Math.pow(10,counter-1);
            inp /= 10;
            counter--;
            System.out.print((first+temp)/2 + " ");
        }
    }
}
