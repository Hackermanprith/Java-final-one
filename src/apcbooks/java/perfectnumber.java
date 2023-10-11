package apcbooks.java;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<= 100;i++) {
            for (int j = 1; j != i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            System.out.println(((sum == i)? i+ " is perfect number": i + " is not a perfect number"));
            sum = 0;
        }
    }
}
