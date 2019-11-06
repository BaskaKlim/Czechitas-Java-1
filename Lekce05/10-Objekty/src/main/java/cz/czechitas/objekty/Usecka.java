package cz.czechitas.objekty;

import java.awt.*;

public class Usecka {

    Point pointA;
    Point pointB;

    public String toString (){
      return " Usecka od " + pointA + " do " + pointB;
    }


    public Double countLenght (){
        int sideA = pointA.x - pointB.x;
        int sideB = pointA.y - pointB.y;
         return  Math.sqrt( sideA*sideA + sideA*sideA);
    }
}
