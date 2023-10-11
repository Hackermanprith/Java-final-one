package msd.class_9.classworks;

import org.jetbrains.annotations.NotNull;

public class randomtests {
    public static void main(@org.jetbrains.annotations.NotNull String @NotNull [] args) {
        int f = 373731;
        int max = 0;
        int min = 9;
        int counter = 0;
        while(f > 0){
            int temp = f % 10;
            f = f / 10;
            if(temp > max && temp > min){
                max = temp;
            }
            if(temp < min && temp < max){
                min = temp;
            }
            if(counter == 0){
                max = temp;
            }
            counter++;
        }
        System.out.println(max+min);
    }


}
