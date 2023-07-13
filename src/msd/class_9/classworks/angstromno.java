package msd.class_9.classworks;
import java.util.Scanner;
import java.lang.Math;
public class angstromno {
    public static void simplified(int x) {
        int cube = 0;
        int f = x;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            cube += Math.pow(temp, 3);
        }
        if(cube == f)
            System.out.println("It is an angstrom number");
        else
            System.out.println("It is not an angstrom number");
    }
    public static void complex(int x){
        int cube = 0;
        int f = x;
        int counter= 0;
        while(x > 0){
            x /= 10;
            counter++;
        }
        while(x > 0) {
            int temp = x % 10;
            x /= 10;
            cube += Math.pow(temp, counter);
        }
        if(cube == f)
            System.out.println("It is an angstrom number");
        else
            System.out.println("It is not an angstrom number");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        simplified(x);
    }
}
