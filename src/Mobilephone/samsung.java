package Mobilephone;

public class samsung extends mobile{

    @Override
    void call() {
        System.out.println("Samsung is calling");

    }

    @Override
    int network() {
        int networkid = 8459558;
        System.out.println("Samsung is connect to network");
        return networkid;


    }
    @Override
    void launchapp(String name) {
        System.out.println("Samsung launching " + name);


    }

    @Override
    void exitapp(String name) {
        System.out.println("Samsung is exiting "+ name);


    }

    @Override
    void back() {
        System.out.println("Samsung is going to home screen");

    }
    static void gamelauncher(){
        System.out.println("Launching launcher");
    }
}

