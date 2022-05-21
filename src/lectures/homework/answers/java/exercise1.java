package lectures.homework.answers.java;
import java.util.*;
public class exercise1 {
    public static double average(int marks1, int marks2, int marks3) {
        int avg = (marks1 + marks2 + marks3) / 3;
        return avg;
    }

    public static int sumallodds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static int greaternum(int n, int j) {
        int greaternum = n;
        if (n > j) {
            greaternum = n;
        } else if (n < j) {
            greaternum = j;
        }
        return greaternum;
    }

    public static long circumfrence(int rad) {
        double pi = 3.14;
        return (long) ((rad * 2) * pi);
    }

    public static void eligibletoVote(int age) {
        if (age > 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void infloop(int i) {
        do {
            System.out.println("I use apna colleage for learning java");
        }
        while (i != 0);
    }

public static void counting() {
        Scanner input = new Scanner(System.in);
        int posnum = 0;
        int negnum = 0;
        int zero = 0;
       System.out.println("Enter 1 to continue and 0 to end :) ");
       int inputchecker = input.nextInt();
        while(inputchecker == 1) {
            System.out.println("Enter your number : ");
            int number = input.nextInt();
            if(number > 0) {
                posnum++;
            } else if(number < 0) {
                negnum++;
            } else {
                zero++;
            }

            System.out.println("Press 1 to continue & 0 to stop");
            inputchecker = input.nextInt();
        }

        System.out.println("Positives : "+ posnum);
        System.out.println("Negatives : "+ negnum);
        System.out.println("Zeros : "+ zero);
    }
    public static int power(int n,int y){
        if(n == 1| y == 1 ){
            return 1;
        }
        else{
            return (n * power(n,y-1))*n;
        }
    }
    public static int greatestdivisor(int n,int y){
        int divisor = 1;
        for (int i = n-1;i>=2;i--){
            if(n%i==0 && y%i==0){
                divisor = i;
                break;
            }
        }
        return divisor;
    }
    public static void fibonacci(int n){
        int temp;
        int firnum = 0;
        int secnum = 1;
        for(int i = 1;i<=n;i++){
            temp = secnum;
            secnum = firnum + secnum;
            firnum = temp;
            System.out.print(firnum+ " ");
        }

    }

    
    public static void main(String[]args){
        //int n = power(2,2);//added the last multiply cz the func starts from the second latst num example for pow 3 it will start from pow 2
        //System.out.println(n);
        fibonacci(10);
        System.out.println();
    }

}
