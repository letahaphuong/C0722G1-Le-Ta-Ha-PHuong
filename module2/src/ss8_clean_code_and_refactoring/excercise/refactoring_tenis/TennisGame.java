package ss8_clean_code_and_refactoring.excercise.refactoring_tenis;

public class TennisGame {
    static final int LOVE = 0;
    static final int FIFTEEN = 1;
    static final int THIRTY = 2;
    static final int FORTY = 3;

    static final String LOVE_ALL = "Love-All";
    static final String FIFTEEN_ALL = "Fifteen-All";
    static final String THIRTY_ALL = "Thirty-All";
    static final String FORTY_ALL = "Forty-All";
    static final String DEUCE = "Deuce";

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        boolean isEqualScore = score1 == score2;
        boolean isScore1MoreThan4 = score1 >= 4;
        boolean isScore2MoreThan4 = score2 >= 4;

        if (isEqualScore) {
            return displayScoreEqual(score1);
        }

        if (isScore1MoreThan4 || isScore2MoreThan4) {
            return displayScoreMoreThan4(player1Name, player2Name, score1, score2);
        }

        return displayScoreElse(score1, score2);
    }

    private static String displayScoreElse(int score1, int score2) {
        String display = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1;
            } else {
                display += "-";
                tempScore = score2;
            }
            switch (tempScore) {
                case LOVE:
                    display += "Love";
                    break;
                case FIFTEEN:
                    display += "Fifteen";
                    break;
                case THIRTY:
                    display += "Thirty";
                    break;
                case FORTY:
                    display += "Forty";
                    break;
            }
        }
        return display;
    }

    private static String displayScoreEqual(int score) {
        switch (score) {
            case LOVE:
                return LOVE_ALL;
            case FIFTEEN:
                return FIFTEEN_ALL;
            case THIRTY:
                return THIRTY_ALL;
            case FORTY:
                return FORTY_ALL;
            default:
                return DEUCE;

        }
    }

    private static String displayScoreMoreThan4(String player1Name, String player2Name, int score1, int score2) {
        int subtractionResult = score1 - score2;

        if (subtractionResult == 1) {
            return "Advantage " + player1Name;
        }
        if (subtractionResult == -1) {
            return "Advantage " + player2Name;
        }
        if (subtractionResult >= 2) {
            return "Win for " + player1Name;
        }
        return "Win for " + player2Name;
    }
}
