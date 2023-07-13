package Sortingsalgorithms.datastucts.java;

import java.io.*;

public class lekhalikhi {
    public static void main(String[]args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("lekhalikhi.txt"));
        bw.write("Hello World");
        bw.write("\nSuck some lolipops");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("lekhalikhi.txt"));
        String line = br.readLine();
         while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
        //or
        String lol;
        while((lol=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
