package apcbooks.java;
import java.util.Scanner;
public class slab_hinmotron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time travelled: ");
        int time = sc.nextInt();
        System.out.print("The total distance travelled by himutron in "+time+"s is ");
        int distance_travelled = 0;
        if(time <= 10){
            distance_travelled = time * 10;
        }
        else if(time > 10 && time <=30){
            distance_travelled = 10*10 + ((time - 10) * 15);

        } else if (time > 30 && time <= 60) {
            distance_travelled = (10*10) + (20 * 15) + ((time - 30) * 20);
        }
        else{
            distance_travelled = (10 * 10) + (20*15)+(30*20)+((time - 60) * 25);
        }
        System.out.print(distance_travelled + "m");

    }
}
