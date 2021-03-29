package guessingGame;
import java.util.Scanner;

public class Player {
    public void play(Scanner input, RandomNum game) {
        int tries = 10;
        int number = 0;

        for (int i = 0; i < tries; i++) {
            System.out.print("guess number: ");
            number = Integer.parseInt(input.next());
            if (number > game.getSecretNumber()) {
                System.out.println("secret number is lower");
            } else if (number < game.getSecretNumber()) {
                System.out.println("secret number is higher");
            } else {
                break;
            }
        }
        if (number == game.getSecretNumber()) {
            System.out.println("WIN");
        }
        if (tries == 5 && number != game.getSecretNumber()) {
            System.out.println("You needed to many attempts!");
        }
    }
}