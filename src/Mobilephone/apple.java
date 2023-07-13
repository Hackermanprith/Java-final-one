package Mobilephone;

public class apple extends mobile {

    @Override
    void call() {
        System.out.println("Apple is calling");

    }

    @Override
    int network() {
        int networkid = 8459558;
        System.out.println("Apple is connect to network");
        String storekoreo = "Ami pagol";
        System.out.println(storekoreo);
        call();
        return networkid;


    }

    @Override
    void launchapp(String name) {
        System.out.println("Apple launching " + name);


    }

    @Override
    void exitapp(String name) {
        System.out.println("Apple is exiting " + name);


    }

    @Override
    void back() {
        System.out.println("Apple is going to home screen");

    }

    static void Imessage(String msg){
        System.out.println(msg);
    }
}
