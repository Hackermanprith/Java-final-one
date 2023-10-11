package apcbooks.java;

import java.util.Scanner;

public class Nelsonno {
    public static int takeinput(String message) {
        Scanner sc = new Scanner(System.in);
        int input;
        if (message != null) {
            System.out.print(message + " ");
        }
        try {
            input = sc.nextInt();
            if(input == 0){
                input = takeinput("Enter any number except 0 idiot:");
            }
        } catch (Exception e) {
            System.out.println("Sorry but invalid type of input was given by you !!,Please enter a digit");
            input = takeinput(null);
        }
        return input;
    }
    public static String nelson(int inp){
        int counter = 0;
        while(inp > 0){
            int temp = inp%10;
            if(counter == 3){
                break;
            }
            if(temp == 1){
                counter++;
            }
            if(temp!=1){
                counter = 0;
            }
            inp /=10;

        }
        if(counter == 3){
            return "It is Nelson number";
        }
        return "It is not a Nelson number";
    }
    public static void main(String[] args) {
        System.out.println(nelson(takeinput("Enter a number to check if its nelson: ")));
    }
}
