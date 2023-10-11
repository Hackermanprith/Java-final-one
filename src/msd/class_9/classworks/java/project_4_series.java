package msd.class_9.classworks.java;
import java.util.*;
public class project_4_series {
    public static void main(String []args){
        double num = 2.7;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int terms = input.nextInt();
        input.close();
        for(int i = 1; i <= terms; i++){
            num = num + 1;
            System.out.println(num + " + " + 1 + " = " +num);
        }
    }
}
