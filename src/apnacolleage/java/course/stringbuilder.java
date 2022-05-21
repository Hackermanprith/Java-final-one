package apnacolleage.java.course;
import java.lang.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder("I love Java");
        System.out.println(myString);
        myString.append(" and something important happened yesterdaz");
        System.out.println(myString);
        myString.insert(0, "I am prithwish");
        System.out.println(myString);
        System.out.println(myString);
        System.out.println(myString.capacity());
        System.out.println();
        System.out.println(myString.hashCode());
        myString.setCharAt(0, 'W');
        System.out.println(myString);
        myString.insert(1, "e");
        myString.delete(6,17);
        System.out.println(myString);
        myString.delete(3,5);
        System.out.println(myString);
        myString.append(" and also bruhhhhh");
        System.out.println(myString);
        myString.reverse();
        System.out.println(myString);
    }
}
