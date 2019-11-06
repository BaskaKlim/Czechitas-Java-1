package net.sevecek.turtle;

import com.sun.corba.se.spi.orb.*;
import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    // 0. define variables
    Turtle emil;

    // main method
    public void main(String[] args) {
        // create (call) our object turtle emil
        emil = new Turtle();

        //TODO: ahoj kouc, vyber si prosim z preddefinovanych funkcii  part1(); part2(); part3(); a part4();   a vykresli ti to dane ciastocne zadanie.
       part2();
    }

    // part 1 - brief: to draw a house and a pig

    // all task part1 method
    public void part1() {
        drawHouse();
        moveLeft();
        drawPig();
        drawHouse();
    }

    public void drawHouse() {
        drawSquarec();
        moveUp();
        drawRoof();
        moveToNewStart();
    }

    public void moveLeft(){
        emil.penUp();
        emil.turnRight(90);
        emil.move(200);
        emil.turnLeft(90);

    }

    public void drawPig() {
        drawPigBody();
        drawPigHead();
        drawPigLegs();
    }


    public void drawSquarec() {
        for (int i = 0; i < 4; i++) {
            emil.penDown();
            emil.move(100.0);
            emil.turnRight(90.0);
            emil.penUp();
        }
    }


    public void drawRoof() {
        //setup the beggining point
        emil.turnRight(30.0);
        for (int i = 0; i < 3; i++) {
            emil.penDown();
            emil.move(100.0);
            emil.turnRight(120.0);
            emil.penUp();
        }
        emil.turnLeft(30.0);
    }


    public void drawPigBody() {
        for (int i = 0; i < 2; i++) {
            emil.penDown();
            emil.move(100.0);
            emil.turnRight(90.0);
            emil.move(150.0);
            emil.turnRight(90.0);
            // setting the turtle back to the start
            emil.penUp();
        }

    }


    public void drawPigHead() {
        // setting the turtle to the right start position for head
        emil.turnLeft(90.0);
        drawRoof();
        // setting the turtle back to the start
        emil.turnRight(90.0);

    }


    public void drawPigLegs() {
        for (int k = 0; k < 2; k++) {

            emil.penDown();
            emil.turnRight(150.0);
            emil.move(30.0);
            emil.penUp();
            emil.turnLeft(180.0);
            emil.move(30.0);
            emil.turnLeft(120.0);
            emil.move(30.0);
            emil.penDown();
            emil.turnLeft(180.0);
            emil.move(30.0);
            emil.penUp();
            emil.turnLeft(30.0);
            emil.turnRight(90.0);
            emil.move(150.0);
            emil.turnLeft(90.0);
        }
    }

    public void moveToNewStart() {
        emil.penUp();
        emil.turnRight(90.0);
        emil.move(140.0);
        emil.turnRight(90.0);
        emil.move(100.0);
        emil.turnRight(180.0);

    }

    public void moveUp() {
        emil.penUp();
        emil.move(100.0);
        emil.penDown();
    }



    // part 2 brief: to draw a pics of hectagon, circle and sun

    // all task part2 method
    public void part2() {
        emil.setLocation(100.00,100.00);
        drawCircle();
        moveLeft();
        drawHectagon();
        moveLeft();
        drawSun();
    }


    public void drawCircle() {
        emil.penDown();
        for (int i = 0; i < 20; i++) {
            emil.move(10.0);
            emil.turnRight(20.0);
        }
        emil.penUp();
    }
    public void drawHectagon() {
        emil.penDown();
        for (int i = 0; i < 6; i++) {
            emil.move(50.0);
            emil.turnRight(60.0);
        }
        emil.penUp();
    }

    public void drawSun() {

        for (int i = 0; i < 9; i++) {
            emil.penDown();
            for (int f = 0; f < 2; f++) {
                emil.move(10.0);
                emil.turnRight(20.0);
            }
            emil.move(10.0);
            emil.turnLeft(90.0);
            drawSunlights();
            emil.turnRight(90.0);
        }
        emil.penUp();
    }

    public void drawSunlights() {
        emil.penDown();
        for (int h = 0; h < 2; h++) {
            emil.move(40);
            emil.turnRight(180.0);
        }
        emil.penUp();
    }


    // part 3: brief = panoram

    public void part3() {

        // go up and draw the sun
        moveUpToSun();
        drawSun();

        // go back to down and draw 5 houses
        moveBackToGround();
        for (int i = 0; i < 5; i++) {
            drawHouse();
        }
        // go one line down to the starting position
        emil.turnRight(180);
        emil.move(250);
        emil.turnRight(90);
        emil.move(600);
        emil.turnRight(90);

        // draw two houses and one pig between them
        drawHouse();
        emil.turnRight(90);
        emil.move(200);
        emil.turnLeft(90);
        drawHouse();
        emil.turnLeft(90);
        emil.move(300);
        emil.turnRight(90);
        drawPig();
    }

    public void moveUpToSun() {
        emil.penUp();
        emil.move(200);
        emil.turnLeft(90);
        emil.penDown();
    }

    public void moveBackToGround() {
        emil.penUp();
        emil.turnLeft(90);
        emil.move(300);
        emil.turnRight(90);
        emil.move(100);
        emil.turnRight(90);
        emil.penDown();
    }


// part 4: brief = letters of my surname

    public void part4() {
        writeB();
        writeA();
        writeR();
        writeA();
    }

    public void writeA() {
        emil.penDown();
        emil.turnRight(30);
        for (int i = 0; i < 5; i++) {
            emil.move(20);
        }
        emil.turnRight(120);
        for (int i = 0; i < 5; i++) {
            emil.move(20);
        }

        emil.turnRight(180);
        emil.move(40);
        emil.turnLeft(60);
        emil.move(60);
        emil.penUp();

        //setting the turtle to the start position
        emil.turnLeft(60);
        emil.move(40);
        emil.turnLeft(210);

        // setting the turle to new starting position
        emil.turnRight(90);
        emil.move(120);
        emil.turnLeft(90);
    }

    public void writeB() {
        emil.penDown();
        for (int i = 0; i < 5; i++) {
            emil.move(20);
        }
        emil.turnRight(90);
        for (int i = 0; i < 3; i++) {
            emil.move(20);
        }
        emil.turnRight(40);
        emil.move(20);
        emil.turnRight(50);
        emil.move(20);
        emil.turnRight(40);
        emil.move(20);
        emil.turnRight(50);
        for (int i = 0; i < 3; i++) {
            emil.move(20);
        }
        emil.turnRight(180);
        for (int i = 0; i < 3; i++) {
            emil.move(20);
        }
        emil.turnRight(40);
        emil.move(20);
        emil.turnRight(50);
        emil.move(20);
        emil.turnRight(40);
        emil.move(20);
        emil.turnRight(50);
        for (int i = 0; i < 3; i++) {
            emil.move(20);
        }
        emil.penUp();

        // Setting the turtle to the starting position
        emil.turnRight(90);
        emil.penUp();

        // setting the turle to new starting position
        emil.turnRight(90);
        emil.move(100);
        emil.turnLeft(90);
    }

    public void writeR() {
        emil.penDown();
        for (int i = 0; i < 5; i++) {
            emil.move(20);
        }
        emil.turnRight(90);
        for (int i = 0; i < 3; i++) {
            emil.move(20);
        }
        emil.turnRight(40);
        emil.move(20);
        emil.turnRight(50);
        emil.move(20);
        emil.turnRight(40);
        emil.move(20);
        emil.turnRight(50);
        for (int i = 0; i < 3; i++) {
            emil.move(20);
        }
        emil.turnRight(220);
        for (int i = 0; i < 4; i++) {
            emil.move(20);
        }
        // setting the turtle to the start position
        emil.penUp();
        emil.turnRight(140);
        emil.move(60);
        emil.turnRight(90);

        // setting the turle to new starting position
        emil.turnRight(90);
        emil.move(100);
        emil.turnLeft(90);
    }
}




