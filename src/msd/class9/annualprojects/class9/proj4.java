package msd.class9.annualprojects.class9;

import java.util.Scanner;

public class proj4 {
    public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num;
        int square = (int) Math.pow(num,2);
        int counter = 0;
        while(dup > 0){
            dup/=10;
            counter++;
        }
        int last_digits = (int) (square % Math.pow(10,counter));
        System.out.println((last_digits == num)?"It is an Automorphic number":"It is not an Automorphic number");
    }
}
