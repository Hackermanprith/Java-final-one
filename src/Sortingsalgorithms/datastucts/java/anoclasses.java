package Sortingsalgorithms.datastucts.java;
import java.lang.*;
import java.util.Random;

public class anoclasses {
    private interface anoclass{
        void chos();
        void chosa2();
    }
    public static void main(String[]args){
        System.out.println("Hello World");
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
        final Runnable helloWorld = () -> {

        };
        helloWorld.run();
    }
}
