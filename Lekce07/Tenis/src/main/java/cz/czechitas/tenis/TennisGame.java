package cz.czechitas.tenis;

import java.util.*;

public class TennisGame {

    private int pointsOfPlayer1;
    private int pointsOfPlayer2;

    public boolean isInProgress() {
        if (isPlayer1Winning() || isPlayer2Winning()) {
            return false;
        } else {
            return true;
        }
    }

    public void addPointToPlayer1() {

        if (pointsOfPlayer1 <= 15) {
            pointsOfPlayer1 += 15;
        } else if (pointsOfPlayer1 == 40 && pointsOfPlayer2 == 50) {
            pointsOfPlayer2  -= 10;
        } else {
            pointsOfPlayer1 += 10;
        }
    }

    public void addPointToPlayer2() {

        if (pointsOfPlayer2 <= 15) {
            pointsOfPlayer2 += 15;
        } else if (pointsOfPlayer2 == 40 && pointsOfPlayer1 == 50) {
            pointsOfPlayer1 -= 10;
        } else {
            pointsOfPlayer2 += 10;
        }
    }

    public boolean isPlayer1Winning() {
        if (pointsOfPlayer2 < 40 && pointsOfPlayer1 >= 50) {
            return true;
        } else if (pointsOfPlayer2 == 40 && pointsOfPlayer1 >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPlayer2Winning() {
        if (pointsOfPlayer1 < 40 && pointsOfPlayer2 >= 50) {
            return true;
        } else if (pointsOfPlayer1 == 40 && pointsOfPlayer2 >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public int getPointsOfPlayer1() {
        return pointsOfPlayer1;
    }

    public int getPointsOfPlayer2() {
        return pointsOfPlayer2;
    }
}
