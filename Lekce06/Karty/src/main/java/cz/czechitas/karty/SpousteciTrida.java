package cz.czechitas.karty;

import sun.rmi.runtime.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Karta mojaKarta = new Karta();

        mojaKarta.setFarba("Srdce");
        mojaKarta.setHodnota(7);

        System.out.println(mojaKarta);

        KartickaPexeso prvaKarticka = new KartickaPexeso();
        prvaKarticka.setId(0);
        
        KartickaPexeso druhaKarticka = new KartickaPexeso();
        druhaKarticka.setId(1);

        if (prvaKarticka.eaquals(druhaKarticka)){
            System.out.println(" Karticky su dvojica");
        }    else {
            System.out.println(" Karticky nie su dvojica");
        }

    }

}
