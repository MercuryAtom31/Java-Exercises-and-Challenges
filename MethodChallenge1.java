public class MethodChallenge1 {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mohamed", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Mehmet", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mamadou", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Mohand", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Mohamedov", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int playerPositionInHighScoreList) {
        System.out.println(playerName + " managed to get into position " +
                playerPositionInHighScoreList + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        //int scoreValue = playerScore;
        int position = 4;
        if (playerScore >= 1000) {
//            return 1;
            position = 1;
        } else if (playerScore >= 500) {
//            return 2;
            position = 2;
        } else if (playerScore >= 100) {
//            return 3;
            position = 3;
        }
//        else {
//            return 4;

//        }
//        return 4;
        return position;
        //return scoreValue;
    }
}
