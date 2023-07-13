package leetcode.problems.java;

import java.util.Objects;

public class strff {
    public static String longestCommonPrefix(String[] strs) {
        String last = null;
        String word;
        for (int i = 0;i<=strs.length-1;i++){
            if (i > 0) {
                if (Objects.equals(last, strs[i])) {
                    last = strs[i];
                }
                else{
                    last = "";
                }
            } else {
                word = strs[0];
                //add first two letters to last
                last = word.substring(0, 2);
                System.out.println(last);
            }
        }
        return last;
    }
    public static void main(String[]args){
        String [] lol = {"bruh","kruh","duh"};
        String sol = longestCommonPrefix(lol);
        System.out.println(sol);
    }

}
