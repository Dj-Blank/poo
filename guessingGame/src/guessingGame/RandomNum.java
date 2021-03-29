package guessingGame;
import java.util.Random;

public class RandomNum {
	
    private int secretNumber;
    private Random random;

    RandomNum(int limit) {
        this.random = new Random();
        this.setSecretNumber(limit);
    }

    public void setSecretNumber(int limit) {
        this.secretNumber = this.random.nextInt(limit);
    }

    public int getSecretNumber() {
        return this.secretNumber;
    }


}

