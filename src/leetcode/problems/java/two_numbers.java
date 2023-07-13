package leetcode.problems.java;


import java.sql.Array;

public class two_numbers {
    public static int[] twoSum(int[] nums, int target) {
        int[] shit = new int[2];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public static void main(String []args){
        int [] arr = {2,4,11,3};
        int [] lol = twoSum(arr,6);
        for(int i = 0;i < lol.length-1;i++){
            System.out.println(lol[i]);
        }

    }
}
