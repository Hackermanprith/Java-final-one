package leetcode.problems.java;
import java.util.ArrayList;
import java.util.Scanner;
public class paisanikal {
    public static void Counter(int n){
        ArrayList<Integer> nikal = new ArrayList<>();
        int [] paisa ={1,2,5,10,20,50,100,500,1000};
        for(int i = paisa.length-1;i >= 0;i--){
            int C = n/paisa[i];
            nikal.add(C);
            n = n % paisa[i];
        }
        System.out.println("Minimum amount of notes");
        System.out.println("-----------------------------------------------");
       System.out.println("One rupees notes : "+ nikal.get(8));
       System.out.println("Two rupees notes : "+ nikal.get(7));
       System.out.println("Five rupees notes : "+ nikal.get(6));
       System.out.println("Ten rupees notes : "+ nikal.get(5));
       System.out.println("Twenty rupees notes : "+ nikal.get(4));
       System.out.println("Fifty rupees notes : "+ nikal.get(3));
       System.out.println("Hundred rupees notes : "+ nikal.get(2));
       System.out.println("Five Hundred rupees notes : "+ nikal.get(1));
       System.out.println("Thousand Hundred rupees notes : "+ nikal.get(0));
    }
    public static void main(String[]args){
        System.out.println("______________________________________________");
        System.out.print("Enter the currency to be broken down : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("____________________________________________");
        Counter( amount);

    }
}
