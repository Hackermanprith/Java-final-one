package msd.class9.annualprojects.class9;

import java.util.Scanner;

public class proj2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int commaterm = 0;
        int inp = sc.nextInt();

        for(int i = 2;i<= inp;i++){
            while(inp % i == 0){
                if(commaterm == 0){
                    System.out.print(i) ;
                    commaterm++;
                    continue;
                }
                System.out.print(", "+i);
                inp /= i;
            }
        }
    }
}
