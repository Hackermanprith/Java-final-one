package lectures.homework.answers.java;

public class lecture7 {
    public static boolean isPrime(int n){
    boolean isPrime = true;
     for(int i = 2;i>=n-1;n++){
         if(n%i == 0){
             isPrime = false;
         }
         else{
             isPrime = true;
         }
     }
        return isPrime;
    }
    public static boolean evenodd(int n){
        boolean isEven = false;
        if(n%2 == 0){
            isEven = true;
        }
        else {
            isEven = false;
        }
        return isEven;
    }
    public static void printtable(int n,int upto){
        for(int i = 1;i<=upto;i++){
            System.out.println(n + " * "+ i + " = " + n*i);
        }
    }
    public static void main(String[]args){
        boolean l = isPrime(64);
        System.out.println(l);
        printtable(9,10);
    }
}
