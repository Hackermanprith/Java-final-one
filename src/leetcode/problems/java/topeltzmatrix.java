package leetcode.problems.java;

import java.util.Arrays;

public class topeltzmatrix {


    public static boolean isToeplitzMatrix(int[][] matrix) {
            for(int i=1;i<matrix.length;i++){
                for(int j=1;j<matrix[i].length;j++){
                    if(matrix[i][j]!=matrix[i-1][j-1]) {
                        System.out.println(Arrays.toString(matrix[i]));
                        return false;
                    }
                }


            }
            return true;
    }
    public static void main(String[]args){
        int [][] datrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean bruh = isToeplitzMatrix(datrix);
        System.out.println(bruh);
    }
}
