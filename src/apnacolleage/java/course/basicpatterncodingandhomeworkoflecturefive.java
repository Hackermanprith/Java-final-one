package apnacolleage.java.course;

public class basicpatterncodingandhomeworkoflecturefive {
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    // Underline
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
    public static void main(String[]args){
        System.out.println(BLUE+"Pattern Coding"+RESET);
        System.out.println(YELLOW+"Pattern 1 :"+RESET);
        for(int i = 0; i < 5;i++){
            for(int j = 0;j<5;j++){
                System.out.print(WHITE+"*   "+RESET);
            }
            System.out.println();
        }
        System.out.println("Second Pattern ");
        System.out.println();
        int n = 4;
        int m = 5;

        for(int k = 1;k <= 4;k++){//outer loop
            for(int l = 1;l<=5;l++){//inner loop
                if(l == 1 || k == 1|| k == n || l == m ){
                    System.out.print(GREEN+"* "+RESET);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(PURPLE+"Third Pattern : "+RESET);
        System.out.println();
        for(int o = 1; o<= 4;o++){
            for(int p = 1;p<=o;p++){
                System.out.print(CYAN+"* "+RESET);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(RED + "4th Pattern: " +RESET);
        System.out.println();
        for(int q = 4;q >= 1;q--){
            for(int u = 1; u<=q;u++){
                System.out.print(RED_BOLD+"* "+RESET);
            }
            System.out.println();
        }
        System.out.println(RED + "5th Pattern : " + RESET);
        System.out.println();
        n = 4;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int k = 1;k<=i;k++){
                System.out.print(GREEN+"*"+RESET);
            }
            System.out.println();
        }
        System.out.println(GREEN_BRIGHT + "6th Pattern : " + RESET);
        System.out.println();
        for(int i = 1;i <=5;i++){
            for(int j = 1; j <=i;j++){
                System.out.print(CYAN_BRIGHT+j + " "+RESET);
            }
            System.out.println();
        }
        System.out.println(GREEN_BOLD_BRIGHT + "7th Pattern : " + RESET);
        System.out.println();
        n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(YELLOW_BOLD+j+" "+RESET);
            }
            System.out.println();
        }
        System.out.println(PURPLE_BRIGHT + "8th Pattern : " + RESET);
        System.out.println();
        n = 5;
        int number = 1;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(BLUE_BRIGHT+number + "  "+RESET);
                number++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(RED_BRIGHT + "9th Pattern" + RESET);
        n = 5;
        for(int i = 1;i<= n;i++){
            for(int j = 1;j<= i;j++){
                int sum = j+i;
                if(sum % 2 == 0){

                    System.out.print(GREEN_BRIGHT+"1 "+RESET);
                }
                else{
                    System.out.print(BLUE_BRIGHT+"0 "+RESET);
                }
            }
            System.out.println();
        }
        System.out.println(RED_BRIGHT + "Hw of lecture 5" + RESET);
        System.out.println("Hw 1");
        System.out.println();
        n = 5;
        for(int i = 1;i<= n;i++){
            for(int j = 1;j<= n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<= 5;k++){
                System.out.print(GREEN_BRIGHT+"*"+RESET);

            }
            System.out.println();
        }
        System.out.println(GREEN_BRIGHT + "6th Pattern : " + RESET);
        System.out.println();
        for(int i = 1;i <=5;i++){
            for(int j = 1; j <=i;j++){
                System.out.print(CYAN_BRIGHT+j + " "+RESET);
            }
            System.out.println();
        }
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(YELLOW_BOLD+j+" "+RESET);
            }
            System.out.println();
        }
    }
}
