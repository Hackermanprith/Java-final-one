package lectures.homework.answers.java;

public class lecture5 {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN


    // Bold
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN

    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN

    // Background
    // Underline

    // High Intensity
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN


    // High Intensity backgrounds
    public static void main(String[]args) {
        System.out.println(RED_BOLD_BRIGHT + "Hw of lecture 5" + RESET);
        System.out.println(BLUE_BOLD_BRIGHT+"Hw 1"+RESET);
        System.out.println();
        int n = 5;
        for(int i = 1;i<= n;i++){
            for(int j = 1;j<= n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<= 5;k++){
                System.out.print(GREEN_BOLD_BRIGHT+"*"+RESET);

            }
            System.out.println();
        }
        System.out.println();
        System.out.println(BLUE_BOLD_BRIGHT+"Hw 2"+RESET);
        System.out.println();
        n =1;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(RED_BOLD_BRIGHT+" "+n+" "+RESET);
            }
            n++;
            System.out.println();
        }
        System.out.println();
        System.out.println(GREEN_BOLD_BRIGHT+"Hw 3"+RESET);
        System.out.println();
        n = 5;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1;j--){
                System.out.print(BLUE_BOLD+j+RESET);
            }
            for(int j = 2;j<=i;j++){
                System.out.print(CYAN_BOLD_BRIGHT+j+RESET);
            }
            System.out.println();
        }
    }
}
