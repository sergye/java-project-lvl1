package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {

    private static int randomNumber;
    private static String[] question = new String[Engine.ATTEMPTS_NUMBER];
    private static String[] correctAnswer = new String[Engine.ATTEMPTS_NUMBER];
    private static final String GAME_TASK = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void play() {
        for (int i = 0; i < Engine.ATTEMPTS_NUMBER; i++) {
            setQuestionData();
            question[i] = getQuestion();
            correctAnswer[i] = getCorrectAnswer();
        }
        Engine.start(GAME_TASK, question, correctAnswer);
    }

    private static void setQuestionData() {
        randomNumber = Utils.getRandomNumber(Engine.RANDOM_RANGE);
    }

    private static String getQuestion() {
        return String.format(Engine.QUESTION, randomNumber);
    }

    private static String getCorrectAnswer() {
        return isEven(randomNumber) ? "yes" : "no";
    }


    private  static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
