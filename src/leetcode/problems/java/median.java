package leetcode.problems.java;

public class median {
    public static void median(int[] nums1, int[] nums2){
        int []finalarr = new int[(nums1.length + nums2.length-1)];
        int pointer = 0;
            System.arraycopy(nums1, 0, finalarr, 1, nums1.length);
            for(int i = 0; i<= finalarr.length-1;i++){
                System.out.println(finalarr[i]);
            }
    }
    public static void main(String []args){
        int []b= {2,3,4,5};
        int []k= {6,7,8,9,10};
        median(b,k);
        int x = Integer.parseInt("j45");
        System.out.println(x);
    }
}
