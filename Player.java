import java.util.Random;

public class Player {
    int guessNumber;
    public void guess(){
        Random random = new Random();
        guessNumber = random.nextInt(10) + 1;
        System.out.println("Player guessed: "+guessNumber);
    }

    int getGuessedRandomNumber(){
        return guessNumber;
    }
}
