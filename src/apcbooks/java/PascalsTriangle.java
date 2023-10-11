package apcbooks.java;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> main = new ArrayList<>();
        int n = 69;
        for(int i =0 ; i <= n;i++){
          ArrayList <Integer> Temp = new ArrayList<>();
          int number = (int) Math.pow(11,i);
          while (number > 0){
              int temp = number % 10;
              System.out.print(temp + " ");
              Temp.add(temp);
              number /= 10;
          }
            System.out.println();
          main.add(Temp);
        }

    }
}
