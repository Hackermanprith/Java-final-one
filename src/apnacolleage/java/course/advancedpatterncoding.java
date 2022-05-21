package apnacolleage.java.course;

public class advancedpatterncoding {
    public static void main(String []args){
        int n = 4;
        for(int i = 1;i <= n;i++){
            //first 1
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(int k = 1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int p = 1;p<=i;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int q = 4;q >= 1;q--){
            for(int u = 1; u<=q;u++){
                System.out.print("*");
            }
            int spaces = 2 * (n-q);
            for(int k = 1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int u = 1; u<=q;u++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        n = 5;
        //upper part
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
