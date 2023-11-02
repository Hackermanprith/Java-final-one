package apnacolleage.java.course;

public class strimgs {
    public static void main(String []args){
        String name = "I hate my life";
        String mycrush = " love Computer";
        String concatitnate = name +" and "+ mycrush;
        System.out.println(concatitnate.length());
        System.out.println(concatitnate.toUpperCase());
        System.out.println(concatitnate.toLowerCase());
        System.out.println(concatitnate.replace("hate","love"));
        concatitnate = concatitnate.replace("hate","love");
        for(int i=0;i<concatitnate.length();i++){
            System.out.print(concatitnate.charAt(i));
        }
        String student1 ="Prithwis";
        String student2 = "Bob";
        String student3 = "Prithwis";
        if(student1.equals(student3)){
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
        if(student1.equalsIgnoreCase(student2)){
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
        String whatdoprithwishthinkabouthislife = name.substring(10,name.length());
        System.out.println(whatdoprithwishthinkabouthislife);
        String email = "namegobrrrr@gmail.com";
        String email1 = email.substring(0,email.indexOf("@"));
        String email2 = email.split("n")[1];
        System.out.println(email1);
        System.out.println(email2);

    }
}
