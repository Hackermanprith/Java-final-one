package Sortingsalgorithms.datastucts.java;
import java.util.ArrayList;
import msd.class_9.classworks.m12;

public class normalarraylist {
    /*
    @author Prithwish
     */
    public static void main(String[] args) {
        ArrayList<m12> arr = new ArrayList<m12>();
        arr.add(new m12("Bob"));
        arr.add(new m12("Sreejit"));
        arr.add(new m12("Swarnava"));
        arr.add(new m12("Satwik"));
        arr.add(new m12("Swarnava"));
        arr.remove(0);
        System.out.println(arr.contains("Satwik"));
        System.out.println(arr.indexOf("Satwik"));
        System.out.println(arr.lastIndexOf("Swarnava"));
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        System.out.println(arr.get(0).name);

    }
}
