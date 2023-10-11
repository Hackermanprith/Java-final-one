package apcbooks.java;

import java.util.Scanner;

public class Slab_fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double fine = 0.0;
        if(x <= 5){
            fine = (0.40*x);
        } else if (x <= 10) {
            fine = (0.40 * 5) + (0.65 * (x-5));
        }
        else if(x > 10){
            fine = (0.40 * 5)+(0.65 * 5) + (0.80 * (x-10));
        }
        System.out.println(fine);
        switch (x){
            case 1:

        }
    }
}
