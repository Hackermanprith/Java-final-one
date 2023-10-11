package apcbooks.java;

import java.lang.reflect.Type;
import java.util.Scanner;

public class All_seriesStuff {
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
    public static void s1_19(){
       int input = takeinput("Enter the upper limit of the natural numbers: ");
       int sum_even_no = 0;
       int sum_odd_no = 0;
       for(int i = 1;i < input;i++){
           int numbr = i;
           while(numbr > 0){
               int temp = numbr%10;
               if(temp%2 == 0){
                   sum_even_no += temp;
               }
               else{
                   sum_odd_no += temp;
               }
               numbr/=10;

           }
       }
        System.out.println("-----------------------------------------------");
        System.out.println("Sum of all even number is: "+sum_even_no);
        System.out.println("Sum of all odd number is: "+sum_odd_no);
        System.out.println("-----------------------------------------------");

    }
    public static void s1_20(){
        double sum = 0;
        for(int i = 1;i<= 9;i++){
            sum += (i * (i+1));
            if(i == 9){
                System.out.print(i + " * "+ (i+1) + " = ");
                continue;
            }
            System.out.print(i + " * "+ (i+1) + " + ");
        }
        System.out.print(sum);
    }
    public static void s2_20(){
        double sum = 0;
        for(int i = 1;i<=9;i++){
            sum += (i*(i+1));
            if(i == 9){
                System.out.print(i + " * " + (i+1)+" = ");
                continue;
            }
            System.out.print(i + " * " + (i+1)+" + ");
            i+=1;
        }
        System.out.print(sum);
    }
    public static void s3_20(){
        double sum = 0;
        for(int i = 2;i <= 10;i+=1){
            sum += (i-1) * (i+1);
            if(i== 10){
                System.out.print((i-1) + " * " + (i+1) + " = ");
                continue;
            }
            System.out.print((i-1) + " * " + (i+1) + " + ");

        }
        System.out.print(sum);
    }
    public static void s4_20() {
        double sum = 0;
        for (int i = 1; i <= 19; i++) {
            sum += (i - (i + 1));
            if (i == 19) {
                System.out.print(i + "-" + (i + 1)+"=");
                continue;
            }
            System.out.print(i + "-" + (i + 1) + "+");
        }
        System.out.println(sum);
    }
    public static void s5_20(){
        double sum = 1;
        System.out.print(" 1 + ");
        for(int i = 2;i<= 10;i++){
            sum += (double) 1 /i;
            if(i == 10 ){
                System.out.print(1 + "/" + i + " = ");
                continue;
            }
            System.out.print(1 + "/" + i + " + ");
        }
        System.out.print(sum);
    }

    public static void s6_20(){
        double sum  = 0;
        for(int i = 1;i <= 9; i++){
            sum += (double) i/(i+1);
            if(i == 9){
                System.out.print(i + "/" + (i+1) + " = " );
                continue;
            }
            System.out.print(i + "/" + (i+1) + " + " );
        }
        System.out.print(sum);
    }
    public static void s7_20(){
        double sum = 0;
        sum -= 1.0;
        for(int i= 2;i<=10;i++){
            if(i == 10){
                sum -= (double) 1/10;
            }
            sum += (double) 1/i;
        }
        System.out.print(sum);
    }
    public static void s1_21() {
        int x = takeinput("Please enter a digit for the base number :");
        int n = takeinput("Please enter a digit to go to the series upto :");
        double sum = n;
        System.out.print(x + " + ");
        for (int i = 2; i <= n; i++) {
            sum += (double) ((Math.pow(x, i)) / i);
            if(i == n){
                System.out.print(x+"^"+i+"/"+i + " = ");
                continue;
            }
            System.out.print(x + "^" + i + "/" + i+" + ");
        }
        System.out.print(sum);

    }

    public static void s2_21() {
        int n = takeinput("Enter the no for the series continuity: ");
        int x = takeinput("Enter the number n for the series");
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            var  v = (double) (Math.pow(x, i)) / i + 1;
            if (i == n) {
                System.out.print(x + "^" + i + "/" + (i + 1)+"=");
                sum += v;
                continue;
            }
            System.out.print(x + "^" + i + "/" + (i + 1) + " + ");
            sum += v;
        }
        System.out.println(sum);
    }
    public static void s3_21(){
        int  x  = takeinput("Enter the base value for the series: ");
        int n = takeinput("Enter the power raise and the continuation of the number");
        double sum = 0.0;
        for(int i = 1;i<= n;i++){
            sum += (Math.pow(x,i+1))/i;
            if(i ==  n){
                System.out.print(x + "^" +(i+1) + "/"+ i + " = ") ;
                continue;
            }
            System.out.print(x + "^" +(i+1) + "/"+ i + " + ") ;
        }
        System.out.print(sum);
    }
    public static void s4_21(){
        int  x  = takeinput("Enter the base value of n: ");
        int n = takeinput("Enter the power raise and the continuation of the number");
        double sum = Math.pow(x,2);
        System.out.print(x+"^"+2 + " + ");
        for(int i = 2;i<= n;i++){
            sum += Math.pow(x,i+1)/i;
            if(i == n){
                System.out.print(x+"^"+(i+1)+"/"+i + " = ");
                continue;
            }
            System.out.print(x+"^"+(i+1)+"/"+i + " + ");
        }
        System.out.print(sum);
    }
    public static void s5_21(){
        int  x  = takeinput("Enter the base value of n: ");
        int n = takeinput("Enter the power raise and the continuation of the number");
        double sum = Math.pow(x,1);
        System.out.print(x + " + ");
        for(int i = 2;i<= n;i++){
            sum += Math.pow(x,i)/i;
            if(i == n){
                System.out.print(x + "^"+ i + "/" + i + " = ");
                continue;
            }
            System.out.print(x + "^"+ i + "/" + i + " + ");
        }
        System.out.print(sum);
    }








    public static void main(String[] args) {
                double x = Math.sqrt(8);
                x= Math.floor(x);
                int z = (int) x;
        System.out.println(z);


    }
}
