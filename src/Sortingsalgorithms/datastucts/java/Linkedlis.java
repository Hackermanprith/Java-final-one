package Sortingsalgorithms.datastucts.java;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlis {
    public static void main(String []args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Satwik");
        ll.addFirst("Sreejit");
        ll.addLast("Swarnava");
        for (String item:ll) {
            System.out.println(item);

        }
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.contains("Satwik"));
        ll.forEach(System.out::println);
        selectionshort los = new selectionshort();
        //it has all other same methods as arraylis : )
    }
}
