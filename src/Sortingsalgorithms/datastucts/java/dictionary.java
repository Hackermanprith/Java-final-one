package Sortingsalgorithms.datastucts.java;
import java.io.*;
import java.util.HashMap;
import java.util.*;

public class dictionary {
    static HashMap <String,Integer> hsmp ;
    public static void load() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.FileReader("Lol.txt"));
        String line = br.readLine();
        while(line!=null){
            String []words = line.split(" ");
            for (String word:words) {
                int s = Integer.parseInt(word+1);
                hsmp.put(word,s);
            }
            line = br.readLine();
        }
    }
    public static void main(String[]args) throws IOException {
        BufferedWriter ls = new BufferedWriter(new FileWriter("Lol.txt"));
        ls.write("Rakesh 60000");
        ls.close();
        load();
        hsmp.forEach((k,v)->System.out.println(k+"has "+v));


    }
}
