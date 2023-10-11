package msd.class9.annualprojects.class9;

import java.util.Scanner;

public class proj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inp = sc.nextInt();
        int i = 0;
        while(inp > 0){
            int temp = inp % 10;
            inp /= 10;
            i++;
            if(i%2 == 0){
                System.out.print(temp);
                System.out.println();
                continue;
            }
            System.out.print(temp + " ");
        }
    }
}
