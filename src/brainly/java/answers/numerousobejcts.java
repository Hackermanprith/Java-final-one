package brainly.java.answers;

import java.util.ArrayList;

public class numerousobejcts {
    class Employee {
        String name = "Gotham";
        int salary = 10;
    }
    public static void main(String[] args) {
        // Create an object of the myClass class]
        ArrayList <Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            employees.add(new numerousobejcts().new Employee());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(employees.get(i).name);
        }
        employees.get(0).name = "Bruce";
        System.out.println(employees.get(0).name);
    }
}
