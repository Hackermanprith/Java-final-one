package Sortingsalgorithms.datastucts.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileio {
    public static void main(String[] args) throws IOException {
        File file = new File("Augustine");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter next = new FileWriter("Augustine");
        for(int i = 0;i<=9990;i++){
            next.write("Nigga "+i+" \n");
        }
        Scanner sc= new Scanner(file);
        try{
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
