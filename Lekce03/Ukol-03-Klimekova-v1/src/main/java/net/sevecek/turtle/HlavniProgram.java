package net.sevecek.turtle;

import java.awt.*;
import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    Turtle emil;
    Color mainColor;

    public void main(String[] args) {

        // declare our object Turtle
        emil = new Turtle();
        mainColor = emil.getPenColor();

        // TODO: mila koucka, vyber si jednu z hlavnych metod drawIceCream(), drawTrain(); drawIceMan(); alebo nechaj spustit preddefinovanu kombinaciu vsetkych.
        goLeft(300);
        drawIceCream();
        goDown(200.0);
        goRight(100);
        drawIceMan();
        goRight(400);
        goDown(200);
        drawTrain();

    }

    public void drawIceCream() {
        // setting position
        emil.turnLeft(180);
        drawTriangle(150.0, 102.6, 70.0, 40.0, new Color(233, 220, 165));
        drawCircle(8.6, 10.0, 36, new Color(214, 57, 224));
        emil.turnRight(180);
        // setting the starting setup
        goRight(120.0);
        emil.setPenColor(mainColor);

    }

    public void drawIceMan() {
        emil.turnRight(10);
        drawCircle(20.0, 12.0, 30, new Color(0, 191, 209));
        goUp(145.0);
        emil.turnLeft(10);
        drawCircle(12.0, 12.0, 30, new Color(0, 191, 209));
        goLeft(45.0);
        drawCircle(5.0, 12.0, 30, new Color(0, 191, 209));
        goRight(156.0);
        drawCircle(5.0, 12.0, 30, new Color(0, 191, 209));
        goUp(105.0);
        goLeft(100.0);
        drawCircle(8.0, 12.0, 30, new Color(0, 191, 209));
    }



    public void drawTrain() {

        drawLocomotive();
        drawWagon();
        drawWagon();

    }

    public void drawLocomotive() {
        emil.turnRight(135.0);
        drawTriangle(70.00, 100.0, 45.0, 90.0, new Color(224, 224, 0));
        emil.turnRight(20.0);
        goUp(50.0);
        emil.turnLeft(180);
        drawRectangle(100.0, 180.0, 90.0, new Color(0, 191, 209));

        // wheels
        goDown(30.0);
        goRight(15.0);
        drawCircle(5.0, 12.0, 30, new Color(51, 3, 88));
        goRight(75.0);
        drawCircle(5.0, 12.0, 30, new Color(51, 3, 88));

        goRight(40);
        goUp(35.0);
        goRight(5);
        drawCircle(14.0, 12.0, 30, new Color(214, 57, 224));
        drawRectangle(200.0, 135.0, 90.0, new Color(224, 224, 0));

    }

    public void drawWagon() {
        emil.turnRight(90.0);
        emil.penUp();
        emil.move(90.0);
        emil.penDown();
        emil.setPenColor(mainColor);
        emil.move(100.0);
        emil.turnLeft(90.0);
        drawRectangle(200.0, 150.0, 90.0, new Color(0, 168, 129));
        emil.turnRight(90.0);
        emil.move(100.0);
        goDown(30.0);
        drawCircle(5.0, 12.0, 30, new Color(51, 3, 88));
        emil.turnLeft(90.0);
    }

// geometrical methods

    public void drawSquare(double side) {
        drawRectangle(side, side, 90.00, Color.lightGray);
    }

    public void drawRectangle(double sideA, double sideB, double angle, Color newColor) {
        emil.setPenColor(newColor);
        for (int i = 0; i < 2; i++) {
            emil.move(sideA);
            emil.turnRight(angle);
            emil.move(sideB);
            emil.turnRight(angle);
        }
    }

    public void drawTriangle(double sides, double sideC, double mainAngle, double angles, Color newColor) {
        emil.setPenColor(newColor);
        emil.turnRight(90.0);
        emil.move(sideC);
        emil.turnLeft(180.0 - mainAngle);
        emil.move(sides);
        emil.turnLeft(180.0 - angles);
        emil.move(sides);
        emil.turnRight(160.0);
    }

    public void drawCircle(double side, double angle, int iterations, Color newColor) {

        emil.setPenColor(newColor);
        for (int i = 0; i < iterations; i++) {
            emil.move(side);
            emil.turnRight(angle);

        }
    }

// methods of moving

    public void goLeft(double distance) {
        emil.penUp();
        emil.turnLeft(90.0);
        emil.move(distance);
        emil.turnRight(90.0);
        emil.penDown();

    }

    public void goUp(double distance) {
        emil.penUp();
        emil.move(distance);
        emil.penDown();
    }

    public void goDown(double distance) {
        emil.penUp();
        emil.turnRight(180.0);
        emil.move(distance);
        emil.turnRight(180.0);
        emil.penDown();
    }

    public void goRight(double distance) {
        emil.penUp();
        emil.turnRight(90.0);
        emil.move(distance);
        emil.turnLeft(90.0);
        emil.penDown();

    }
}



