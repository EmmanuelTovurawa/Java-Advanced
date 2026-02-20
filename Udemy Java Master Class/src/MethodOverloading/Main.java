/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author Manex
 */
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position" and the
        //position they got and a further message "on the high score table".
        //
        // Create a 2nd method called calculateScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        //the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and <1000
        // 3 if the score is >=100 and <500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50

        int highScorePosition = calculateScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);

    }

    public  static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition
                + " on the high score table");
    }

    public static int calculateScorePosition(int playerScore) {

//        if(playerScore >=1000) {
//           return 1;
//        } else if (playerScore >=500) {
//            return 2;
//        } else if (playerScore >=100) {
//            return 3;
//        }
//            return 4;
        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        }else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return  finalScore;
        }

        return -1;

    }
}
