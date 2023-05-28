

public class main {

    public static void main(String[] args) {
        int playerPositionInHighScoreList = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerPositionInHighScoreList);

        playerPositionInHighScoreList = calculateHighScorePosition(1000);
        displayHighScorePosition("Tom", playerPositionInHighScoreList);

        playerPositionInHighScoreList = calculateHighScorePosition(500);
        displayHighScorePosition("Tommy", playerPositionInHighScoreList);

        playerPositionInHighScoreList = calculateHighScorePosition(100);
        displayHighScorePosition("Timmy", playerPositionInHighScoreList);

        playerPositionInHighScoreList = calculateHighScorePosition(25);
        displayHighScorePosition("Thomas", playerPositionInHighScoreList);
    }

    public static void displayHighScorePosition(String playerName, int playerPositionInHighScoreList) {
        System.out.println(playerName + " managed to get into position " + playerPositionInHighScoreList +
                " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result = (playerScore >= 1000) ? 1
                : (playerScore >= 500) ? 2
                : (playerScore >= 100) ? 3
                : 4;

        return result;
    }
}
