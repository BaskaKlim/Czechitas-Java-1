package cz.czechitas.prsi;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        // Karta mojaKarta1 = new Karta(7, "piko");
        //  Karta mojaKarta2 = new Karta(10, "srdce");

        // TODO: vytvaranie noveho zoznamu
        List<Karta> balicekKaret = new ArrayList<>();
        // TODO: pridanie vsetkych kariet do balika

        for (int i = 7; i <= 14; i++) {

            balicekKaret.add(new Karta(i, "listy"));
            balicekKaret.add(new Karta(i, "zalud"));
            balicekKaret.add(new Karta(i, "srdce"));
            balicekKaret.add(new Karta(i, "piko"));
        }

        Random nahodnyGenerator = new Random();
        for (int i = 0; i < 1000; i++) {

            // dalsie nahodne cislo s hornou hranicou = pocet kariet v balickuKaret
            int nahodnyIndex = nahodnyGenerator.nextInt(balicekKaret.size());
            Karta michanaKarta = balicekKaret.remove(nahodnyIndex);
            balicekKaret.add(michanaKarta);
        }

        System.out.println(balicekKaret);
    }

}
