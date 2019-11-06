package cz.czechitas.kockamyssyr;

import java.util.*;
import cz.czechitas.kockamyssyr.api.*;
import net.sevecek.util.*;

public class HlavniProgram {

    public void main(String[] args) {
        int cislo = vygenerujCislo(100);
        int suradniceX = vygenerujCislo(400);
        int suradniceY = vygenerujCislo(500);

        //   System.out.println(vysadStromy(cislo));

        // TODO: Sem vepiste svuj program

        new Cat(50, 100);
        Cat tom = new Cat(500, 100);
        tom.setBrain(new KeyboardBrain());
        Mouse jerry = new Mouse(600, 300);
        jerry.setBrain(new KeyboardBrain(KeyCode.W, KeyCode.A, KeyCode.S, KeyCode.D));
        jerry.getX();
        jerry.getY();

        tom.getX();
        tom.getY();

        Cheese cheese = new Cheese(200, 200);


        //while (rozdilSuradnicX ==0 && rozdilSuradnicY == 0) {       bolo moje prve riesenie, ale tam by som musela riesit ze mam definovane rozdiely nad funkciu a volala som ich vo funkcii

        while (!jerry.isRemoved() && !cheese.isRemoved())  {
            int rozdilSuradnicX = rozdilX(tom.getX(), jerry.getX());
            int rozdilSuradnicY = rozdilY(tom.getY(), jerry.getY());
            posunSeOX(tom, rozdilSuradnicX);
            posunSeOY(tom, rozdilSuradnicY);
        }

    }

    public int rozdilX(int tomX, int jerryX) {
        return jerryX - tomX;
    }


    public int rozdilY(int tomY, int jerryY) {
        return jerryY - tomY;
    }

    public void posunSeOX(Cat tom, int rozdilX) {
        if (rozdilX >= 0) {
            tom.moveForward(Math.abs(rozdilX));
        } else if (rozdilX < 0) {
            tom.turnLeft();
            tom.turnLeft();
            tom.moveForward(Math.abs((rozdilX)));
            tom.turnLeft();
            tom.turnLeft();
        }
    }



    public void posunSeOY(Cat tom, int rozdilY) {
        if (rozdilY >= 0) {
            tom.turnRight();
            tom.moveForward(Math.abs(rozdilY));
            tom.turnLeft();
        } else if (rozdilY < 0) {
            tom.turnLeft();
            tom.moveForward(Math.abs((rozdilY)));
            tom.turnLeft();
            tom.turnLeft();

        }
    }

    public int vygenerujCislo(int horniHranice) {

        Random generatorNahodnychCisel = new Random();
        int nahodneCislo = generatorNahodnychCisel.nextInt(horniHranice);
        return nahodneCislo;

    }

    public int vysadStromy(int maximalniPocet) {
        Random vysadzacStromov = new Random();
        int pocetStromov = vysadzacStromov.nextInt(maximalniPocet);

        for (int i = 0; i < pocetStromov; i++) {
            new Tree(vygenerujCislo(500), vygenerujCislo(400));
        }
        return pocetStromov;
    }

}


/* new Meat(200, 500); */

/* public int ziskajRozdilSouradicX(Cat kocka, Mouse mys) {
   return kocka.getX() - mys.getX();    */