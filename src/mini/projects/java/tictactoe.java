package mini.projects.java;
import java.util.*;
/*
* @author PRITHWISH
* @since 11-10-2021
* @version 1.0
*
 */
public class tictactoe {
    private static String[][] board;
    private static int lol = 1;
    private static int i = 0;
    private static int j = 0;
    public static String mode = "computer";

    public static void intialgame() {
        board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    public static void printthefrickinboard() {
        int ncounter = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == " ") {
                    System.out.print(ncounter + " | ");
                    ncounter++;
                } else {
                    System.out.print(board[i][j] + " | ");
                    ncounter++;
                }

            }
            System.out.println();
        }
    }

    public static void setingji(int l) {
        if (l == 1) {
            i = 0;
            j = 0;
        } else if (l == 2) {
            i = 0;
            j = 1;
        } else if (l == 3) {
            i = 0;
            j = 2;
        } else if (l == 4) {
            i = 1;
            j = 0;
        } else if (l == 5) {
            i = 1;
            j = 1;
        } else if (l == 6) {
            i = 1;
            j = 2;
        } else if (l == 7) {
            i = 2;
            j = 0;
        } else if (l == 8) {
            i = 2;
            j = 1;
        } else if (l == 9) {
            i = 2;
            j = 2;
        }

    }

    public static void comp() {
        //gen rand num
        Random r = new Random();
        int l = r.nextInt(9);
        setingji(l);
        if (board[i][j] == " ") {
            board[i][j] = "O";
            lol++;
        } else {
            comp();
        }
    }

    public static void maingameplay() {
        Scanner input = new Scanner(System.in);
        String Current = null;
        Current = "X";
        System.out.println("Enter where you want to place " + Current + " in (0 - 9): ");
        int l = input.nextInt();
        setingji(l);
        if (l <= 9 && Objects.equals(board[i][j], " ")) {
            board[i][j] = Current;
            lol++;
        } else if (l >= 9) {
            System.out.println("Invalid no has been given");
            maingameplay();
        }
        comp();
    }

    public static void playergameplay() {
        Scanner input = new Scanner(System.in);
        String Current = null;
        Current = "X";
        if (lol % 2 == 0) {
            Current = "X";
        } else {
            Current = "O";
        }
        System.out.println("Enter where you want to place " + Current + " in (0 - 9): ");
        int l = input.nextInt();
        setingji(l);
        if (l <= 9 && Objects.equals(board[i][j], " ")) {
            board[i][j] = Current;
            lol++;
        } else if (l >= 9) {
            System.out.println("Invalid no has been given");
            maingameplay();
        }
    }

    public static boolean checkwon() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != " " && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println(board[i][0] + " has won");
                return true;
            }
        }

        //Check each column
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != " " && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                System.out.println(board[i][0] + " has won");
                return true;
            }

            //Check the diagonals
            if (board[0][0] != " " && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                System.out.println(board[1][1] + " has won");
                return true;
            }
            if (board[2][0] != " " && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
                System.out.println(board[2][0] + " has won");
                return true;
            }

            //Otherwise nobody has not won yet

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mode you want to play in (Computer/Player): ");
        mode = input.nextLine().toLowerCase();
        intialgame();
        printthefrickinboard();
        if (mode.equals("computer")) {
            for (int i = 0; i < 6; i++) {
                maingameplay();
                boolean bruh = checkwon();
                if (bruh) {
                    break;
                }
                printthefrickinboard();

            }
        }
        if (mode.equals("player")) {
            for (int i = 0; i < 6; i++) {
                playergameplay();
                boolean bruh = checkwon();
                if (bruh) {
                    break;
                }
                printthefrickinboard();
            }
        }
    }
}