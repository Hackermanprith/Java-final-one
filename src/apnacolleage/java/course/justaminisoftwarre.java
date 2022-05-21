package apnacolleage.java.course;
import java.util.Scanner;
public class justaminisoftwarre {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1");
        int subject1 = input.nextInt();
        System.out.println("Enter the marks of subject 2");
        int subject2 = input.nextInt();
        System.out.println("Enter the marks of subject 3");
        int subject3 = input.nextInt();
        System.out.println("Enter the marks of subject 4");
        int subject4 = input.nextInt();
        System.out.println("Enter the marks of subject 5");
        int subject5 = input.nextInt();
        input.close();
        int avg = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;
        System.out.println("Your average is " + avg);
        if (avg >= 90) {
            System.out.println("Those are some pretty good marks");
        }
        else if (avg >= 80) {
            System.out.println("I would say you did well");
        }
        else if (avg >= 50) {
            System.out.println("You did alright");
        }
        else {
            System.out.println("I have already informed the burial ground");
        }
    }
}
