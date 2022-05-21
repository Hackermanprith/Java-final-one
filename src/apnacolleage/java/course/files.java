package apnacolleage.java.course;
import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
public class files {
    public static void main(String[] args) throws FileNotFoundException {
        File Life = new File("C:\\Users\\Prithwish Mukherjee\\Desktop\\Learningjava\\src\\com\\pmdev\\in\\Mylife");
        if (Life.exists()) {
            System.out.println("File exists but u still do not have it");
        } else {
            System.out.println("File does not exist like ur life");
        }
        //u can use scanner to read the file
        try{
            Scanner sc = new Scanner(Life);
            while (sc.hasNextLine()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        //u can use buffered reader to read the file
        try {
            BufferedReader br = new BufferedReader(new FileReader(Life));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        //file creation formatter\
        try {
            Formatter f = new Formatter("sfe.txt");
            f.format("%s", "Hello");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }



    }


}


