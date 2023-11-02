package Sortingsalgorithms.datastucts.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class collections {
    public static void main(String[] args) {
        HospitalStatus lol = new HospitalStatus();
        lol.addPatient();
    }

}
class patient{
    String addmitno;
    String admissiondate;
    String name;
    String phoneno;
    String bedname;

    ArrayList<Integer> roomsoneachfloor;

    int billno;
    patient(String addmitno,String admissiondate,String name,String phoneno,String bedname,int billno){
        this.addmitno = addmitno;
        this.admissiondate = admissiondate;
        this.name = name;
        this.phoneno = phoneno;
        this.bedname = bedname;
        this.billno = billno;
    }
    public void exportpatientdatatotxt() throws IOException {
        //export class data to a txt file
        BufferedWriter ls = new BufferedWriter(new FileWriter("PatientData.txt"));

    }

}
class bed{
    String bedid;
    String occupant;
    String nurseincharge;
    String mealtype;
    HashMap<String,Integer>Medicines;
    HashMap<String,Integer>LabTests;
    HashMap<String,String>MedicalHistory;
    HashMap<String,String>AssignedDoctors;

}
class Room{
    String roomid;
    String roomtype;
    Hashtable<String,String> occupant;//bed id, occupantid
    int noofbeds;


    Room(String roomid){
        this.roomid = roomid;
        this.roomtype = roomtype;
    }
}
class HospitalStatus{
    static  HashMap<String,ArrayList<Room>> Floorplan;
    HashMap <String, patient> patient_list;
    public static int Takeintinp(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int number = 0;
        try{
            number = sc.nextInt();

        }
        catch (Exception e){
            System.out.println("Invalid Input,Try again");
            number = Takeintinp(msg);
        }
        return number;
    }
    public static String Takestrinp (String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        String text = "";
        try {
            text = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid Input,try again");
            text = Takestrinp(msg);
        }

        return text;
    }

    HospitalStatus(){
        int numberoffloors = Takeintinp("Enter the no of floors in the hospital: ");
        int roomsoneachfloor = Takeintinp("Enter the no of rooms on each floor: ");
        Floorplan = new HashMap<>();


    }
    public void addPatient(){
        Random rand = new Random();
        String name = Takestrinp("Enter the name of the patient: ");
        String phoneno = Takestrinp("Enter the phone no of the patient: ");
        beds_printing();
        String bedname = Takestrinp("Enter the room id : ");



    }
    public static void beds_printing() {
        //print all empty rooms


    }
    private  static void addfloors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of floors in the hospital: ");
        int numberoffloors = sc.nextInt();
        System.out.println("Entering floor plannner mode: ");
        for(int i = 0;i<= numberoffloors;i++){
            floorplannermenu(i);
        }
        //add floors to the hospital

    }
    public static void floorplannermenu(int floorno){
        Random  r = new Random();
        System.out.println("Floor planner, floor ");
        System.out.println("1.Add general room");
        System.out.println("2.Add cabin room");
        System.out.println("3.Add cabin for 2 room");
        System.out.println("3.Add ICU room");
        System.out.println("4.Add Operation theatre");
        System.out.println("5.Add Emergency room");
        System.out.println("6.Add Waiting room");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                


        }



    }
    public static void roomplanner(int roomid){

    }

}
