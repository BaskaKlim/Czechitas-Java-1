package cz.czechitas.prsi;

import java.util.*;

public class Karta {

    private int hodnota;
    private String barva;

    public String getBarva() {
        return barva;
    }

    public int getHodnota() {
        return hodnota;
    }

    public String getNazovHodnoty() {
        // vytvorim si zoznam validnych hodnot cez List<String> a Arrays.asList, ktory mi z pola urobi zoznam
        List<String> jmenaKaret = Arrays.asList("7", "8", "9", "10", "dolnik", "hornik", "kral", "eso");

        String tatoKarta = jmenaKaret.get(hodnota -7);
        return tatoKarta;
    }

    @Override
    public String toString() {
        return "Karta: " + getNazovHodnoty() +" " + barva ;
    }

    public Karta(int novaHodnota, String novaBarva) {
        this.hodnota = novaHodnota;

        if (novaHodnota >= 7 && novaHodnota <= 14) {
            this.hodnota = novaHodnota;
        } else {
            System.out.println("Zadaj hodnotu karty od 7 do 14.");
        }

        this.barva = novaBarva;

        if (novaBarva.equals("srdce") || novaBarva.equals("zalud") || novaBarva.equals("piko") || novaBarva.equals("listy")) {
            this.barva = novaBarva;

        } else {
            System.out.println("Zadaj niektoru z validnych farieb: srdce, zalud, piko alebo listy.");
        }
    }
}
