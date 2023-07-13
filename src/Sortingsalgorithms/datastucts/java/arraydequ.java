package Sortingsalgorithms.datastucts.java;
import java.util.ArrayDeque;
public class arraydequ {
    public static void main(String[]args){
        ArrayDeque <Integer> ad = new ArrayDeque<Integer>();
        ad.add(1);
        ad.addFirst(55);
        ad.addLast(45);
        ad.forEach(System.out::println);
        //everything is same except for the method of insertion and deletion
    }
}
