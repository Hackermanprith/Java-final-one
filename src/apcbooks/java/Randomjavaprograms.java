package apcbooks.java;

import java.util.Scanner;

public class Randomjavaprograms {
    public static boolean randomsnippet(){
        //    S  =  (X+1)2+(X+2)3+(X+3)4+(X+4)5+…………… +(X+N)N+1
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <=n;i++){
            sum += (int) Math.pow((x+i),i+1);
        }
        System.out.println(sum);
        return true;
    }
    public static void anothersnipped(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int og = x;
        int sum = 0;
        int product = 1;
        while(x > 0){
            int temp = x%10;
            x/=10;
            sum += temp;
            product *= temp;
        }
        if((sum+product) == og){
            System.out.println("Special number");
        }
        else{
            System.out.println("Not a special number");
        }
    }
    public static void main(String[] args) {
       int i = 1;
       while(++i < 100){
           System.out.println(i);
       }
    }
}

