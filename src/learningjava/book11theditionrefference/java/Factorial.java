package learningjava.book11theditionrefference.java;

public class Factorial {
    public static int lol(int n){
        int result;
        if (n == 1) return 1;
        result = lol(n-1) * n;
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Factorial of 3 is " + lol(69));
    }
}
