package apnacolleage.java.course;
import java.io.IOException;
import java.lang.Process;
import java.lang.Runtime;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //Print hip mom
        Process pcs = Runtime.getRuntime().exec(
                "cmd /c start cacls C:\\Users\\Prithwish Mukherjee\\Documents\\thor.txt /e /p %username% : f");

        //Logic that manipulates the file here
    }
}
