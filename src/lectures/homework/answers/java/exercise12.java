package lectures.homework.answers.java;

import java.util.Scanner;

public class exercise12 {
    public static void challenge1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        int length = 0;
        String [] array = new String[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter element " + (i) + ": ");
            array[i] = input.nextLine();
            length += array[i].length();

        }
        System.out.println("The length of the array is: " + length);

    }
    public static void challenge2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        String result = "";
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += word.charAt(i);
            }
        }

        System.out.println(result);
    }
    public static void challenge3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a email: ");
        String email = input.nextLine();
        String username = "";
        for(int i=0;i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            }
            else {
                username += email.charAt(i);
            }
        }
        System.out.println("Username is: " + username);
    }

    public static void main(String[] args) {
        challenge3();
    }
}
