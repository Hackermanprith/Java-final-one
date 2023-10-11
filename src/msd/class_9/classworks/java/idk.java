package msd.class_9.classworks.java;

public class idk {
    public static void main(String[] args) {
        int i = 1;
        int j = 4;
        int k = 5;
        switch (i){
            case 1:
                if(j >k){
                    System.out.println("j is greater than k");
                    break;
                }
                else{
                    System.out.println("k is greater than j");
                    break;
                }
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
