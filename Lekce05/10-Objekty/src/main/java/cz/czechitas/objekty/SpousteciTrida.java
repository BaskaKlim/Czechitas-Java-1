package cz.czechitas.objekty;

import java.awt.*;
import javax.jws.soap.*;
import javax.swing.*;

public class SpousteciTrida {

    public static void main(String[] args) {

        // precvicovanie objektov
        /*
        int myAge = 31;
        System.out.println(myAge);

        Point pointInTheMiddle = new Point();
        pointInTheMiddle.x = 960;
        pointInTheMiddle.y = 540;

        Point pointLeftUp = new Point();
        pointLeftUp.x = 0;
        pointLeftUp.y = 0;

        System.out.println(pointInTheMiddle);
        System.out.println(pointLeftUp);

        JFrame window  = new JFrame();
        window.setLocation(pointInTheMiddle);
        window.setVisible(true);

        Dimension dimensionOfWindow = new Dimension();
        dimensionOfWindow.width = 400;
        dimensionOfWindow.height = 400;
        window.setSize(dimensionOfWindow);

       // window.setSize(new Dimension());         / ale este by som musela nastavit velkost dimenzii



        Bus busJelacicova = new Bus();
        busJelacicova.numberOfBus = 64;
        busJelacicova.color = new Color(224, 0, 42);
        busJelacicova.numberOfpassengers = 13;
        busJelacicova.identificationNumber = 867;


        Bus busSnp = new Bus();
        busJelacicova.numberOfBus = 4;
        busJelacicova.color = new Color(224, 0, 42);
        busJelacicova.numberOfpassengers = 20;
        busJelacicova.identificationNumber = 111;

        busJelacicova.comingPassengers();
        System.out.println(busJelacicova.toString());

        busJelacicova.comingPassengers();
        busJelacicova.comingPassengers();
        busJelacicova.comingPassengers();

        System.out.println(busJelacicova.toString());

        busJelacicova.leavingOnePassenger();
        System.out.println(busJelacicova.toString());

        busJelacicova.comingPassengers();
        busJelacicova.comingPassengers();
        busJelacicova.comingPassengers();
        busJelacicova.comingPassengers();
        busJelacicova.comingPassengers();
        System.out.println(busJelacicova.toString());

        busJelacicova.leavingOnePassenger();
        busJelacicova.leavingOnePassenger();
        busJelacicova.leavingOnePassenger();
        busJelacicova.leavingOnePassenger();
        System.out.println(busJelacicova.toString());

        busJelacicova.comingPassengers();
        System.out.println(busJelacicova.toString());
        busJelacicova.comingPassengers();
        System.out.println(busJelacicova.toString());

        busJelacicova.leavingAllPassengers();
        System.out.println(busJelacicova.toString());


        busSnp.comingPassengers();
        busSnp.comingPassengers();
        busSnp.comingPassengers();
        busSnp.comingPassengers();
        System.out.println(busSnp.toString());

         */

        // musim si inicializovat vsetky objekty, aj Points ktore mam spomenute v class Usecka a vlozim do nich vlastnosti
        Point leftPoint = new Point();
        Point rightPoint = new Point();

        leftPoint.x = 77;
        leftPoint.y = 100;

        rightPoint.x = 50;
        rightPoint.y = 99;

        // musim priradit vytvorene objekty k objektom Point
        Usecka useckaOne = new Usecka();
        rightPoint = useckaOne.pointA;
        leftPoint = useckaOne.pointB;

        System.out.println(useckaOne.toString());
      // druhy sposob
        Usecka useckaTwo = new Usecka();
        useckaTwo.pointA = new Point();
        useckaTwo.pointA.x = 11;
        useckaTwo.pointA.y = 33;
        useckaTwo.pointB = new Point();
        useckaTwo.pointB.x = 77;
        useckaTwo.pointB.y = 99;

        System.out.println(useckaTwo.toString());
        System.out.println(useckaTwo.countLenght());


    }

}