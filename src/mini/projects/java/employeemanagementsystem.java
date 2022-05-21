package mini.projects.java;
import java.io.*;
import java.util.*;
public class employeemanagementsystem {
        public static void display(){
            System.out.println("\t\t*******************************************");
            System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("\t\t*******************************************");
            System.out.println("\t\t\t    --------------------------");
            System.out.println("\t\t\t     ~$ PRITHWISH MUKHERJEE");
            System.out.println("\t\t\t    --------------------------");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Employee Leave");
            System.out.println("6. Set employee salary");
            System.out.println("7. Employee Change Menu");
            System.out.println("8. Exit");
        }
        class Employee{
            int id;
            String name;
            String address;
            String phone;
            String email;
            String designation;
            String department;
            String Teamleader;
            String location;
            double employ_salary;
            int employ_id;
            int noofleavesleft;
        }
    public static void main(String []args){
        display();
    }
}
