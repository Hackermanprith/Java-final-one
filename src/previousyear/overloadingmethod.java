package previousyear;

public class overloadingmethod {
    void print(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=4;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    void print(int a){
        int sd = 0;
        int se = 0;
        while(a>0){
            int d = a%10;
            if(d%2==0){
                se += d;
            }
            else{
                sd += d;
            }
            a /= 10;

        }
        if(sd == se){
            System.out.println("Its a lead number");
        }
        else{
            System.out.println("Its not a lead number");
        }
    }
    public static void main(String[] args) {
        overloadingmethod obj = new overloadingmethod();
        obj.print();
        obj.print(10);
    }
}
