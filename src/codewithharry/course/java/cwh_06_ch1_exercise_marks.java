package codewithharry.course.java;
import java.util.Scanner;
import java.util.ArrayList;
public class cwh_06_ch1_exercise_marks {
    public static void noobrapproach(){
        Scanner sc = new Scanner(System.in);
        int totalmarks = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Noobrapproach");
            System.out.println("Enter your marks for"+ i + "subject: ");
            int marks = sc.nextInt();
            totalmarks = totalmarks + marks;
        }
        int avg = totalmarks/5;
        System.out.println("Your average is: " + avg);
    }
    public static void probutnoobapproach( ){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> markslist = new ArrayList<Integer>();
        int totalmarks = 0;
        System.out.println("Enter the no of subjects you have taken: ");
        int noofsubjects = sc.nextInt();
        for(int i = 0; i < noofsubjects; i++){
            System.out.println("Enter your marks for"+ i + "subject: ");
            int marks  = sc.nextInt();
            markslist.add(marks);
            System.out.println(markslist.size());
        }
        for (int i = 0;i<markslist.size();i++){
            totalmarks = totalmarks + markslist.get(i);
        }
        int avg = totalmarks/markslist.size();
        System.out.println("Your average is: " + avg);


    }
    public static void main(String[] args) {
        noobrapproach();
        probutnoobapproach();
    }
}
