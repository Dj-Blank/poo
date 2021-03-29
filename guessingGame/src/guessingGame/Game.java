package guessingGame;
import java.util.Scanner;


public class Game {
    private Scanner input;
    private Player player;
    private RandomNum guessNumberGame;
    private boolean running;
    private String command;

    Game() {
        this.player = new Player();
        this.input = new Scanner(System.in);
        this.guessNumberGame = new RandomNum(10);
        this.running = true;
    }

    public void init() {
        while (running) {
            System.out.println("commands: leave, play");
            System.out.print(">> ");
            this.command = this.input.next();

            if (this.command.equals("leave")) {
                this.running = false;
            } else if (command.equals("play")) {
                this.player.play(this.input, this.guessNumberGame);
                this.guessNumberGame.setSecretNumber(10);

            } else {
                System.out.println("unknown command");
            }
        }
    }
}