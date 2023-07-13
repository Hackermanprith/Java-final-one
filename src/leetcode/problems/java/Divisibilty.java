package leetcode.problems.java;

public class Divisibilty {
    public static long[] divisibility(int x, int y, int[] a) {
        // Write your code here.
        long [] z = {0,0};
        for(int i = 0;i <= a.length-1;i++){
            if(a[i]% x == 0 && a[i]%y != 0){
                z[0] = z[0] + a[i];
            }
            else if(a[i]%y == 0 && a[i]%x != 0){
                z[1] =  z[1] + a[i];
            }
        }
        return z;
    }
    public static void main(String [] args){
        int [] a = {6,20,30,61};
        long [] z = divisibility(3,5,a);
        System.out.println(z[0]);
        System.out.println(z[1]);
    }
}
