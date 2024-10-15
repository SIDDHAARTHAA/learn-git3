import java.util.Random;

public class GuessGame {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessGame() {
        player1 = new Player();
        player2 = new Player();
    }

    public void startGame(){
        Random random = new Random();
        targetNumber = random.nextInt(10) + 1;
        System.out.println("Target number is: "+targetNumber);

        boolean winnerFound = false;

        while (!winnerFound) {
            player1.guess();
            player2.guess();
            
            int guess1 = player1.getGuessedRandomNumber();
            int guess2 = player2.getGuessedRandomNumber();

            if (guess1 == targetNumber) {
                System.out.println("Player 1 wins!");
                winnerFound = true;
            } else if (guess2 == targetNumber) {
                System.out.println("Player 2 wins!");
                winnerFound = true;
            }
            else {
                System.out.println("No correct guesses, try again!\n");
            }
        }
    }
}
