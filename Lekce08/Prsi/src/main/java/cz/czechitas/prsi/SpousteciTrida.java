package cz.czechitas.prsi;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Karta mojaKarta1 = new Karta(7, "piko");
        Karta mojaKarta2 = new Karta(10, "srdce");

        // vytvaranie noveho zoznamu
        List<Karta> balicekKaret = new ArrayList<>();
        balicekKaret.add(mojaKarta1);
        balicekKaret.add(mojaKarta2);
        balicekKaret.add(new Karta(12, "listy"));
        balicekKaret.add(new Karta(14, "zalud"));

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
