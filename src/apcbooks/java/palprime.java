package apcbooks.java;

import java.util.Scanner;


public class palprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fac = 0;
        int reversednum = 0;
        int orignum = x;
        for(int i = 1;i<=x;i++){
            if(x%i == 0){
                fac++;
            }
        }
        while(x > 0){
            int temp = x%10;
            x/=10;
            reversednum = reversednum * 10 + temp;
        }
        if(fac == 2 && reversednum == orignum){
            System.out.println("Number is palprime");
        }
        else {
            System.out.println("Number not palprime");
        }
    }
}
