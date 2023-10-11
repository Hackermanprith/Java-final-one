package apcbooks.java;

import java.util.Scanner;

public class hailstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Hailstone Series is");
        while(x!=0){
            if(x == 1){
                System.out.print(x);
                break;
            }
            System.out.print(x +" , ");
            if(x % 2 == 0){
                x/=2;
            }
            else{
                x=(x * 3+1);
            }
        }
    }
}
