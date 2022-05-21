package lectures.homework.answers.java;
import java.util.Scanner;
public class lecture3 {
    public static void operater(int a, int b,int mode){
        switch(mode){
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if(b == 0){
                    System.out.println("One number is 0");
                }
                else{
                    System.out.println(a / b);
                }
                break;

            case 5:
                if(b == 0){
                    System.out.println("One number is 0");
                }
                else{
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
    public static void months(int month) {
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        }
        else{
            System.out.println("December");
        }
    }
    public static void main(String[]args){
        Scanner option = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int a = option.nextInt();
        System.out.println();
        System.out.print("Enter no 2: ");
        int b = option.nextInt();
        System.out.print("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Remainder of division \n");
        System.out.print("The mode is: ");
        int mode = option.nextInt();
        operater(a,b,mode);
        System.out.println("Enter the month number");
        int month = option.nextInt();
        months(month);

    }
}
