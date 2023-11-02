package Sortingsalgorithms.datastucts.java;

public class recursion {
    public static int fibbo(int n){
        if(n < 2){
            System.out.println(n);
        }
        return fibbo(n-1)+ fibbo(n-2);
    }
}
