package Sortingsalgorithms.datastucts.java;
import java.util.HashSet;
public class hashsetd {
    public static void main(String[]args){
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(69);
        hs.add(24);
        hs.add(1);
        hs.remove(4);
        System.out.println(hs);
        hs.forEach(System.out::println);
        //no duplicates are stored
        //items are not stored in order but on the basis of hash
    }
}
