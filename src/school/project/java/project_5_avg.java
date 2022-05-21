package school.project.java;
import java.util.Scanner;
public class project_5_avg {
    public static void main(String []args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println();
        int i = 0;
        int total = 0;
        while(i < 3){
            System.out.print("Enter the marks: ");
            int marks = input.nextInt();
            System.out.println();
            total = total + marks;
            i++;
        }
        int j = 0;
        while(j < 3 ){
        System.out.println("Your roll no is:" + rollno);
        System.out.println("The average is: " + total/3);
        System.out.println("The total is: " + total);
        j++;
        }
        }
    }

