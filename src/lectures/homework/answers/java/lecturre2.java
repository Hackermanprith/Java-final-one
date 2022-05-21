package lectures.homework.answers.java;

public class lecturre2 {
    public static void diqameter(int radius) {
        final double pi = 3.14;
        double diameter = 3.14 * radius;
        double area = pi * (radius * radius);
        System.out.println(diameter);
        System.out.println(area);
    }
    public static void print_table(int table,int uptotable){
        for(int i = 1;i <= uptotable;i++){
            System.out.println(table + " * " + i +" = "+table*i);
        }
    }
    public static void main(String []args){
        int age = 24;
        System.out.print(age);
        diqameter(9);
        print_table(9,13);

    }

}
