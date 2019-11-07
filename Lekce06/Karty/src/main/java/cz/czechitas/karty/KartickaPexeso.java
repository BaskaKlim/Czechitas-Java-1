package cz.czechitas.karty;

import com.sun.org.apache.xml.internal.utils.*;

public class KartickaPexeso {

    private int cislo;
    private int id;

    public void setCislo(int noveCislo) {
        if (noveCislo <= 31 && noveCislo >= 0) {
            cislo = noveCislo;
        }
    }

    public int getCislo() {
        return cislo;
    }

    public void setId(int noveCislo) {
        if (noveCislo <= 63 && noveCislo >= 0) {
            id = noveCislo;
        }

    }

    public int getId() {
        return id / 2;
    }
     // metoda equals ktora vybera na zaklade coho sa budu porovnavat / akych parametrov, vzdy sa pise takato metoda equals
    public boolean eaquals(Object druhy) {
        KartickaPexeso prvaKarticka = this;
        KartickaPexeso druhaKarticka = (KartickaPexeso) druhy;
        if ((prvaKarticka.getCislo() == druhaKarticka.getCislo())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Karticka pexesa " + id;
    }
}
