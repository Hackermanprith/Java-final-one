package msd.class9.annualprojects.class9;

public class proj7to10 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                if(j%2 == 0 ){
                    System.out.print("0");
                    continue;
                }
                System.out.print("1");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1;i<=5;i++){
            if(i%2 == 0){
                for(int j = 1;j<=i;j++){
                    if(j%2 == 0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
                continue;
            }
            for(int j = 1;j<=i;j++){
                    if(j%2 == 0){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
            System.out.println();
        }
        System.out.println();
        for(int i = 5;i>=1;i--){
            if(i%2 == 0){
                for(int j=1;j<=i;j++){
                    if(j%2 == 0){
                        System.out.print("1");
                        continue;
                    }
                    System.out.print("0");
                }
                System.out.println();
                continue;
            }
            for(int j=1;j<=i;j++){
                if(j%2 == 0){
                    System.out.print("0");
                    continue;
                }
                System.out.print("1");
            }
            System.out.println();

        }
        System.out.println();
        int num = 9;
        char ch = 'A';
        for(int i = 5;i>= 1;i--){
            if(i % 2 == 0){
                for(int j = 1;j<= i;j++){
                    System.out.print(ch);
                }
                ch++;
                System.out.println();
                continue;
            }
            for(int j = 1;j<= i;j++){
                System.out.print(num);

            }
            num--;
            System.out.println();
        }

    }
}
