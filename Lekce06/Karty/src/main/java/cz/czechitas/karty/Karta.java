package cz.czechitas.karty;

import java.awt.*;
import java.io.*;
import org.omg.CORBA.*;

public class Karta {

    private int hodnota;
    private String farba;

    public void setHodnota(int nova) {
        if (nova >= 2 && nova <= 14) {
            hodnota = nova;
        }
    }
    public int getHodnota(){
        return hodnota;
    }

    public void setFarba(String nova) {
        if (nova == "Listy" || nova == "Srdce" || nova == "Piko" || nova == "Zalud") {
            farba = nova;
        }
    }

    public String getFarba(){
        return farba;
    }
    public String toString() {
        return "karta " + hodnota + " farby " + farba;
    }


}
