package cz.czechitas.tenis;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Scanner scanKeyboard = new Scanner(System.in);
        TennisGame wimbledon = new TennisGame();

        while (wimbledon.isInProgress()) {
            System.out.println("Choose player (1 alebo 2)");
            int playerNumber = scanKeyboard.nextInt();
            if (playerNumber == 1) {
                wimbledon.addPointToPlayer1();
            } else if (playerNumber == 2) {
                wimbledon.addPointToPlayer2();
            } else {
                System.out.println("Wrong choice, please select 1 or 2");
            }
            System.out.println("Score of the game is: Player1 " + wimbledon.getPointsOfPlayer1()
                    + " : Player2 " + wimbledon.getPointsOfPlayer2());
        }

        if (wimbledon.isPlayer1Winning()) {
            System.out.println("Winner is Player 1");
        } else if (wimbledon.isPlayer2Winning()) {
            System.out.println(" Winner is Player 2");
        } else {
            System.out.println("Something is wrong");
        }
    }
}
