package Sortingsalgorithms.datastucts.java;
import java.lang.*;
public class anoclasses {
    private interface anoclass{
        void chos();
        void chosa2();
    }
    public static void main(String[]args){
        anoclass lol = new anoclass() {
            @Override
            public void chos() {
                System.out.println("Hello World");

            }

            @Override
            public void chosa2() {
                System.out.println("Hello World 2");

            }
        };
        lol.chos();
    }
}
