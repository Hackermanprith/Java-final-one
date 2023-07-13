package Sortingsalgorithms.datastucts.java;
class Yourmom implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(i<=100){
            System.out.println(" I love your mom");
            i++;
        }
    }
}

public class multithreading {
    public static void main(String[]args) {
        Cook t1 = new Cook();
        Homework t2 = new Homework();
        Yourmom stwik = new Yourmom();
        Thread t3 = new Thread(stwik);
        t3.setPriority(10);
        t3.start();

        t1.start();
        t2.start();
    }

}
class Cook extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<=100){
            System.out.println(" I am Cooking");
            i++;
        }
    }
}

class Homework extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<=10){
            System.out.println(" I am doing my homework");
            i++;
        }
    }
}
