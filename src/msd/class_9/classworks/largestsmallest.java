package msd.class_9.classworks;

import java.util.Scanner;

public class largestsmallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int s = 9;
        int l = 1;
        while(n > 0){
            int temp = n % 10;
            n /= 10;
            if(temp > l)
                l = temp;
            if(temp < s)
                s = temp;
        }
        System.out.println("Smallest digit is "+s);
        System.out.println("Largest digit is "+l);

    }
}
