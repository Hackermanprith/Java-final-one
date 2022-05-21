package mini.projects.java;
import java.util.Random;
import java.util.Scanner;

class gusser{
    public int randomNumber;
    public int guess;
    public int guessCount;
    gusser() {
        Random numb = new Random();
        this.randomNumber = numb.nextInt(100);
    }
    public void setGuess() {
        System.out.println("Guess a number between 0 and 100");
        Scanner input = new Scanner(System.in);
        this.guess = input.nextInt();
        guessCount++;
    }
    public  void guess(){
        if(this.guess == randomNumber){
            System.out.println("You guessed the number");

        }
        else if(this.guess > randomNumber){
            System.out.println("Your guess is too high");
        }
        else{
            System.out.println("Your guess is too low");
        }
    }
}
public class randomnummberguesser {
    public static void main(String[] args) {
        gusser game = new gusser();
        do {
            game.setGuess();
            game.guess();
        } while (game.guess != game.randomNumber);
        System.out.println("You guessed the number in " + game.guessCount + " guesses");
    }

}
