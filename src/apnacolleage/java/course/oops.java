package apnacolleage.java.course;

class pen{
    String color;
    String type;
    String brand;
    String model;
    double price;
    public void write(String text){
        System.out.println("write " + text);
    }
    public void getPrice(){
        System.out.println("The price of the "+ this.type +" pen is $"+this.price);
    }
}
class students {
    String name;
    int age;
    int Class;
    char section;
    String gender;
    String heorshe;
    String hisorher;
    students(String name,int age,int Class,char section,String gender,String heorshe,String hisorher){
        this.name = name;
        this.age = age;
        this.Class = Class;
        this.section = section;
        this.gender = gender;
        this.heorshe = heorshe;
        this.hisorher = hisorher;
        System.out.println(this.name + " has been registered");
    }
    public void getInfo(){
        System.out.println("Name of student is "+this.name+" and "+ this.heorshe + " is " + this.age + " old and he reads in " + this.Class + " section be "+this.section);

    }
}
//Function overloading
class Books{
    String name;
    int price;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int price){
        System.out.println(price);
    }
    public void printinfo(String name,int price){
        System.out.println(name+" "+price);
    }
}
//inheritennce
//four types of inheritence are there

class shape{
    String colour;
    public void area(){
        System.out.println("Displays area");
    }
}
//single level
class triange extends shape{
    public void area(int l,int h){
        System.out.println("Area is " + 1/2*l*h);
    }
}
//multilevel
class Equilateraltriangle extends triange{
    public void area(int l,int h){
        System.out.println("Area is " + 1/2*l*h);
    }
}
/* Shape
   /
  Triangle
  /
  equilateral

 */
class Circle extends shape{
    public void area(int r){
        System.out.println("Area is "+(3.14)*r*r);
    }
}
/*we do not need to show class so we can either make it a interface or use abstract key word
abstract class animal{
    abstract class walk();
}
 */
//or also no  need to add public because interface makes it public by default
interface animal{
    void walk();
}
class horse implements animal {
    public void walk(){
        System.out.println("walk");
    }
}
public class oops {
    public static void main(String[] args) {
    pen bro = new pen();
    bro.brand = "Classmate";
    bro.color = "Blue";
    bro.type =  "Gel";
    bro.model = "Fat man";
    bro.price = 10.00;
    bro.write("hfrerf");
    bro.getPrice();
    pen prithwish = new pen();
    prithwish.brand = "Classmate";
    prithwish.color = "Black";
    prithwish.type =  "Fountain";
    prithwish.model = "Big man";
    prithwish.price = 50.00;
    prithwish.getPrice();
    students Prithwish = new students("Prithwish Mukherjee",13,7, 'B',"Male","he" ,"his");
    Prithwish.getInfo();
    Books horro = new Books();
    horro.printinfo("Lol",234);
    triange amar = new triange();
    amar.colour = "white";
    horse maya = new horse();
    maya.walk();
    }
}
