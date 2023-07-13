package msd.class_9.classworks;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class projects_halfyearly_all {
    public static void perfectno(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if (x == sum)
            System.out.println("Its a perfect no");
        else
            System.out.println("Its not perfect just like your ...... ");

        String l = ((x == sum) ? "Its perfect" : "Its not perfect");
        System.out.println(l);
    }

    public static void fibonacci(int x) {
        int lastno = 0;
        int i = 0;
        int currentno = 0;
        int  firstTerm = 0, secondTerm = 1;
        System.out.print("Fibbonaci no upto " + x + " is :");
        while (i < x) {
            i++;
            System.out.print(((i ==x) ?  firstTerm : firstTerm + ","));
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }

    public static void odd_even(int x) {
        int odd_counter = 0;
        int even_counter = 0;
        while (x > 0) {
            int temp = x % 10;
            int i = 10;
            x = x / 10;
            if (temp % 2 == 0) {
                even_counter++;
            } else {
                odd_counter++;
            }
        }
        System.out.println();
        System.out.println("Odd digits in the no  are :" + odd_counter + "and even digits are " + even_counter);
    }

    public static void avg_digits(int x) {
        int counter = 0;
        int avg = 0;
        while (x > 0) {
            int temp = x % 10;
            avg += temp;
            x /= 10;
            counter++;
        }
        avg /= counter;
        System.out.println("Average of the digits is: " + avg);

    }

    public static void palindrome(int x) {
        int reversedno = 0;
        int orignalno = x;
        while (x > 0) {
            int temp = x % 10;
            reversedno = reversedno * 10 + temp;
            x /= 10;
        }
        if (reversedno == orignalno) { //Phber. (pad conduction (dourevast) Animal Пзале
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }

    }

    public static void nocheckingmyversion(int x) { //5234
        int counter = 0;
        int first_digit = 0;
        int last_digit = 0;
        String las_digit_text = "Hi";
        String firs_digit_text = "Lol";
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            if (counter == 0) {
                last_digit = temp;
                if (last_digit % 2 == 0) {
                    las_digit_text = "even";
                } else {
                    las_digit_text = "odd";
                }
            } else {
                first_digit = temp;
                if (first_digit % 2 == 0) {
                    firs_digit_text = "even";
                } else {
                    firs_digit_text = "odd";
                }
            }
            counter++;
        }
        System.out.println("First digit is " + firs_digit_text + " and last digit is " + las_digit_text);
    }

    public static void nocheckingschool(int x) { //5234
        int counter = 0;
        int first_digit = 0;
        int last_digit = 0;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            if (counter == 0) {
                last_digit = temp;
            } else {
                first_digit = temp;
            }
            counter++;
        }
        if (first_digit % 2 != 0 && last_digit % 2 != 0) {
            System.out.println("Number is starting and ending with odd digits");
        } else {
            System.out.println("Number is not starting and ending with odd digits");
        }
    }
    public static String convertype(double decimal) {
        int digitsAfterPoint = String.valueOf(decimal).length() - String.valueOf(decimal).indexOf('.') + 1; // get the count of digits after the point // for example 0.8384 has two digits
        BigInteger numerator = BigInteger.valueOf((long) (decimal * Math.pow(10, digitsAfterPoint))); // multiply 0.75 with 10^2 to get 75
        BigInteger denominator = BigInteger.valueOf((long) (Math.pow(10, digitsAfterPoint)));       // 10^2 is your denominator
        int gcd = numerator.gcd(denominator).intValue();                                           // calculate the greatest common divisor of numerator  and denominator
        if (gcd > 1) {                                                                             // gcd(75,100) = 25
            return String.valueOf(numerator.intValue() / gcd) + " / " + String.valueOf(denominator.intValue() / gcd);  // return 75/25 / 100/25 = 3/4
        } else {
            return String.valueOf(numerator) + " / " + String.valueOf(denominator);              // if gcd = 1 which means nothing to simplify just return numerator / denominator
        }//
    }// }
    public static String findDivision(int x, int y, int n) {
        // Write your code here.
        BigDecimal a = new BigDecimal(x);
        BigDecimal b = new BigDecimal(y);
        BigDecimal c = a.divide(b);
        String str = c.toString();
        int digitsAfterPoint = String.valueOf(str).length() - String.valueOf(str).indexOf('.')+1;
        if(digitsAfterPoint == n){
            return String.valueOf(c);
        }
        else{
            float k = c.setScale(n, BigDecimal.ROUND_HALF_DOWN).floatValue();
            str = String.valueOf(k);
            return str;
        }
    }

    public static void noseries(int n){
                // initializing counter by 1
                int num = 2;
                int denominator = 3;

                // variable to calculate result
                double res = 0.0;
                // while loop until nth term
                // is not reached
                while (n > 0)
                {
                    n--;
                        res = res + (double) num / (double)denominator;
                        if(n==0){
                            System.out.print(num + "/" + denominator + " = ");
                        }
                        else {
                            System.out.print(num + "/" + denominator + " + ");
                        }
                        num = num + 2;
                        denominator = denominator + 2;


                }
                System.out.println(res);
                String no = convertype(res);
                System.out.println(no);

        }





    public static void sqrootlargestno(int x) {
        int largestno = 1;
        while (x > 0) {
            int temp = x % 10;
            if (temp > largestno) {
                largestno = temp;
            }
            x /= 10;
        }
        Double rootsquare = Math.sqrt(largestno);
        System.out.println("Largest no is: " + largestno);
        System.out.println("Square root of largest digit: " + rootsquare);
    }

    public static void hcflcm(int x, int y) {
        int hcf = 0,gcd = 0;
        for (int i = 1; i <= x || i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is ::" + hcf);
        for(int k = 1; (k <= x) && (k <= y); ++k) {
            if(x % k == 0 && y % k == 0)
                gcd = k;
        }

        int lcm = (x * y) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", x,y , lcm);
    }
    public static void series_n(int x){
        System.out.println();
        int sum = 0;
        for(int i =2;i <= x;i+=2){
            sum +=  i/(i+1) ;
            System.out.print(sum + ", ");
        }


    }
    public static void switchcaseprogram(int x,int y){
        System.out.println();
        switch(x){
            case 1:
                System.out.println("perimeter of circle " +  (2*3.14*y));
                break;
            case 2:
                System.out.println("Area of circle " + (3.14*(y*y)));
                break;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        fibonacci(x);
    }
}
