package cz.czechitas.dennarozeni;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        //vstup
        Scanner nacitacZKlavesnice = new Scanner(System.in);

        System.out.println("Zadejte den v mesici sveho narozeni: ");
        int den = nacitacZKlavesnice.nextInt();
        System.out.println("Zadejte mesic sveho narozeni: ");
        int mesiac = nacitacZKlavesnice.nextInt();
        System.out.println("Zadejte rok sveho narozeni: ");
        int rok = nacitacZKlavesnice.nextInt();

        LocalDate datumNarozeni = LocalDate.of(rok, mesiac,den);
        DayOfWeek denVTydnu = datumNarozeni.getDayOfWeek();
        // EEEE kod pre den
        DateTimeFormatter formatovac = DateTimeFormatter.ofPattern("EEEE");
        String nazevDne = formatovac.format(denVTydnu);
        // vystup 
        System.out.println(nazevDne);
    }

}
