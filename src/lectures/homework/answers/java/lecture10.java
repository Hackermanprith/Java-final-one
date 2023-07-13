package lectures.homework.answers.java;
import java.util.*;

public class lecture10 {
    public static void arrayname(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String [] name = new String[size];
        for(int i = 0;i < size;i++){
            System.out.println("Enter Student Name");
            name[i] = input.nextLine();
        }
        for (int i = 0;i < name.length;i++){
            System.out.print(name[i] + ", ");
        }
    }
    public static void arraysearcher(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for(int i = 0;i < size;i++){
            System.out.println("Enter a random int");
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter the number you wanna find: ");
        int findingnumber = input.nextInt();
        for(int i = 0;i < size;i++){
            if (numbers[i] == findingnumber){
                System.out.println("The number is present at" + i);
            }
        }
    }
    public static void seriesn(int x){
        int sum = 0;
        for(int i = 2; i <= x; i+=2){
            sum = sum + i/(i+1);
            System.out.println(sum);
        }
        System.out.println("Sum of the series is: " + sum);
    }
    public static void main(String []args){
        //arrayname();
       // arraysearcher();
        seriesn(88);

    }
}
