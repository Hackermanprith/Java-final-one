package apnacolleage.java.course;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
 		Scanner sr = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sr.nextLine();
        System.out.println("Enter your age");
        int age = sr.nextInt();
        System.out.println("Enter your address");
        String address = sr.nextLine();
        System.out.println("Enter your phone number");
        long phone = sr.nextLong();
        System.out.println("Enter your email");
        String email = sr.next();
        System.out.println("Enter your password");
        String password = sr.next();
        sr.close();
        System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nPhone: " + phone + "\nEmail: " + email + "\nPassword: " + password);
    }
}
