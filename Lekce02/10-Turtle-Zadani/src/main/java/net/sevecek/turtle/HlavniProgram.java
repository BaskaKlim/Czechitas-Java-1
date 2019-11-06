package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    // 0. define variables
    Turtle emil;

    // main method
    public void main(String[] args) {
        // create (call) our object turtle emil
        emil = new Turtle();
        // drawing the house
        drawHouse();
        // drawing the pig
        drawPig();
    }

    // part 1 - brief: to draw a house and a pig
    //1. square method  - house building
    public void drawSquarec() {
        for (int i = 0; i < 4; i++) {
            emil.penDown();
            emil.move(100);
            emil.turnRight(90);
            emil.penUp();
        }
    }

    // 2. triange method - roof

    public void drawTriange() {
        //setup the beggining point
        emil.move(100);
        emil.turnRight(30);
        for (int i = 0; i < 3; i++) {
            emil.penDown();
            emil.move(100);
            emil.turnRight(120);
            emil.penUp();
        }
    }

    // 3. move to left method
    public void moveToNewStart() {
        emil.penUp();
        emil.turnRight(60);
        emil.move(120);
        emil.turnRight(90);
        emil.move(100);
        emil.turnRight(180);

    }

    // 4. method of drawing whole small house

    public void drawHouse() {
        drawSquarec();
        drawTriange();
        moveToNewStart();
    }

    // 5. method of drawing a pig body

    public void drawBody() {
        for (int i = 0; i < 2; i++) {
            emil.penDown();
            emil.move(50);
            emil.turnRight(90);
            emil.move(100);
            emil.turnRight(90);
            emil.penUp();
        }

    }

    // 6. method of drawing a pig head
    public void drawHead() {
        // setting the turle to the right start position for head
        emil.turnRight(90);
        emil.move(100);
        emil.turnLeft(90);
        emil.move(50);
        // drawing the head
        emil.turnRight(120);
        for (int i = 0; i < 3; i++) {
            emil.penDown();
            emil.move(50);
            emil.turnRight(120);
            emil.penUp();
        }
    }

    // 7. method of drawing a pig legs
    public void drawLegs() {
        emil.turnLeft(30);
        emil.penDown();
        emil.move(20);
        emil.penUp();
        emil.turnRight(150);
        emil.move(20);
        emil.turnLeft(90);
        emil.penDown();
        emil.move(20);
        emil.penUp();

    }

    // 8. method of drawing a whole pig
    public void drawPig() {
        drawBody();
        drawHead();
        emil.turnRight(60);
        emil.move(50);
        drawLegs();
        emil.turnLeft(180);
        emil.move(20);
        emil.turnLeft(120);
        emil.move(100);
        emil.turnLeft(90);
        drawLegs();

    }

}
