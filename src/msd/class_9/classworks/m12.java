package msd.class_9.classworks;

import java.util.Scanner;

public class m12 extends samsung implements network {
    public static String name;
    public m12(String name){
        this.name = name;
    }

    @Override
    void gamelauncher() {
        System.out.println("open game launcher");
    }

    @Override
    void kill() {
        System.out.println("Kill gamelauncger");
    }

    @Override
    void switchoff() {
        System.out.println("Turning off");
    }
//scd

    @Override
    void ring() {
        System.out.println("Call comming");
    }

    @Override
    void switchon() {
        System.out.println("Damn");
    }

    @Override
    public void connecttointernt() {
        Scanner sc = new Scanner(System.in);
        if (Activated) {
            System.out.println("Connecting to nearest tower");
            System.out.println(towers[1]);
        } else {
            System.out.println("Activate card first");
            //scanner
            String paymentid = sc.nextLine();

            setActivated(paymentid);

        }

    }

    @Override
    public void flightmode() {

    }

    @Override
    public void getSsid() {

    }

    /**
     * @param Paymentid
     */
    @Override
    public void setActivated(String Paymentid) {
        Activated = true;
    }


}
