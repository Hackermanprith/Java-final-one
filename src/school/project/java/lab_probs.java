package school.project.java;
import java.util.Scanner;
public class lab_probs {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        double avg = (s1+s2+s3+s4)/4;
        if(avg > 80){
            System.out.println("A");
        } else if (avg >=70 && avg <=79){
            System.out.println("B");
        } else if (avg >= 60 && avg <= 69) {
            System.out.println("C");
        } else if (avg >=50 && avg <=59){
            System.out.println("D");
        } else if (avg < 50){
            System.out.println("F");
        }
    }
}
