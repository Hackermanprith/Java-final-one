package mini.projects.java;

public class Saraniks_challange {
    public static void main(String[] args) {
        /*       *
              * - *
           * - * - *
          * - * - * - *
         */
        for (int i = 1; i <= 4; i++) {
            int j;
            if(i == 1){
                j = i;
            }
            else{
                j = i + (i - 1);
            }
            for (int k = 1; k <= j; k++) {
                if (k % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
