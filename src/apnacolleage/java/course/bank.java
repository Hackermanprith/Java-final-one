package apnacolleage.java.course;

class Account{
    public String name;
    protected String email;
    private String password;
    //getter
    public void setPassword(String pass){
        this.password = pass;
    }
    //setter
    public String getPassword(){
        return this.password;
    }
}
public class bank {
    public static void main(String[]args){
        Account Prithwish = new Account();
        Prithwish.name = "Bro";
        Prithwish.email = "shie@hmao.cpm";
        //the next line is commented just to show the error just uncomment
        //Prithwish.password = "srf";
        //using the getter
        Prithwish.setPassword("OFJKW4IR5UOT8694URIJ");
        System.out.println(Prithwish.getPassword());
    }
}