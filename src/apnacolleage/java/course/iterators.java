package apnacolleage.java.course;

import java.util.ArrayList;
import java.util.Iterator;
import java.math.*;


public class iterators {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();
        System.out.println(it.next());
        System.out.println();
        ArrayList<Integer> ldist = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            ldist.add(i);
        }
        int x = 0;
        Iterator<Integer> dit = ldist.iterator();
        while (dit.hasNext()) {
            x+= dit.next();
        }
        System.out.println(x);
        int f=1, i=2;
        while(++i<5)
            f*=i;
        System.out.println(f);
        //round a number

    }

}
