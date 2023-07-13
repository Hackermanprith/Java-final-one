package previousyear;
import java.util.Scanner;
class Cabservice{
    String Cartype = " ";
    double km;
    double bill;
    void Cabservice(){
        Cartype = " ";
        km = 0;
        bill = 0;
    }
    void input(String Cartype, double km){
        this.Cartype = Cartype;
        this.km = km;
    }
    void calculate(){
        if(Cartype.equals("Micro")){
            bill = 10 * km;
        }
        else if(Cartype.equals("Mini")){
            bill = 15 * km;
        }
        else if(Cartype.equals("Prime")){
            bill = 20 * km;
        }
        else{
            System.out.println("Invalid Car Type");
        }
    }
    void display(){
        System.out.println("Car Type: " + Cartype);
        System.out.println("Kilometers: " + km);
        System.out.println("Bill: " + bill);
    }

}
public class cabmodel {
}
