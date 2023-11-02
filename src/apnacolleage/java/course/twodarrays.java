package apnacolleage.java.course;

import java.util.Scanner;

public class twodarrays {
    public static void main(String[] args) {
        int [] [] nigga = new int[2][2];
        nigga[0][0] = 4;
        nigga[0][1] = 1;
        nigga[1][0] = 2;
        nigga[1][1] = 3;
        //print using for each
        for(int i = 0; i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(nigga[i][j]);
            }
            System.out.println();
        }
        for(int[] i : nigga){
            System.out.println(i);
        }
        String x = "Bitch";
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String y = sc.next();
        char [] niggerin = x.toCharArray();


    }
}
