package lectures.homework.answers.java;
import java.util.Scanner;
import java.util.Random;
public class exercise11 {
    // __________________________________________________________________________
    //total memory consumption (rows *  columns)* space consumption of data type |
    // __________________________________________________________________________|
    // __________________________________________________________________________
    public static void exercise1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns");
        int columns = input.nextInt();
        int[][] twod = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twod[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercise2() {
        int[][] twod = new int[5][5];
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twod[i][j] = rand.nextInt(69);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter a number to find");
        int findingarandnum = input.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (twod[i][j] == findingarandnum) {
                    System.out.println("x found at location (" + i + ", " + j + " ) ");
                }
            }
        }

    }
    public static void main(String []args){
        exercise2();
    }
}