package apcbooks.java;

import java.util.Scanner;

public class particlespeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameofparticle = sc.nextLine();
        if(nameofparticle.equals("Uranium-235")){
            int time = sc.nextInt();
            int sum = 0;
            for(int i = 1;i<= time;i++ ) {
                sum += Math.sqrt(2 * 1000 * i);
                System.out.println("Current status of particle: " + sum);
                if (sum <= 100000){
                    System.out.println(" FACILITY EXPLOSION POSSIBLE!");
                    System.out.println("FACILITY EXPLOSION POSSIBLE!");
                    System.out.println("FACILITY EXPLOSION POSSIBLE!");
                }
                if (sum <= 5000) {
                    System.out.println(" FACILITY CATASTROPHE POSSIBLE!");
                    System.out.println("FACILITY CATASTROPHE POSSIBLE!");
                    System.out.println( "FACILITY CATASTROPHE POSSIBLE!");
                }

                if(sum > 1000){
                    System.out.println("DANGER !!!!");
                    System.out.println("DANGER !!!!");
                    System.out.println("DANGER !!!!");
                    System.out.println("DANGER !!!!");
                }
            }
        }
    }
}
