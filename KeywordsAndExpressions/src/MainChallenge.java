// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainChallenge {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.


        int highScore = calculateHighScorePosition(500);
        System.out.println(highScore);

        highScore = calculateHighScorePosition(100);
        System.out.println(highScore);

        highScore = calculateHighScorePosition(25);
        System.out.println(highScore);

        highScore = calculateHighScorePosition(1000);
        System.out.println(highScore);

        highScore = calculateHighScorePosition(1500);
        System.out.println(highScore);

        displayHighScorePosition("Tim", highScore);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " finished on position " + position );
    }

    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if ((playerScore == 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return  3;
        } else return 4;

    }
}