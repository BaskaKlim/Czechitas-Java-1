package cz.czechitas.ludia;

import java.io.*;
import java.util.*;
import com.sun.org.apache.bcel.internal.generic.*;

public class SpousteciTrida {

    public static void main(String[] args) throws Exception {

        List<String> zoznamMien = new ArrayList<>();

        Scanner nacitacRiadkov = new Scanner( new File("Zoznam"));
        while (true) {
            String meno = nacitacRiadkov.nextLine();
            if (meno.isEmpty()) break;
            // TODO: pridaj meno do zoznamu mien
            zoznamMien.add(meno);
        }
        // TODO: vypis mena zo zoznamu mien
        // idem cez indexy od posledny index, ktory je o -1 mensi ako velkost zoznamu  az po 0
        for (int i = zoznamMien.size()- 1; i>=0; i--) {
            System.out.println(zoznamMien.get(i));
        }
    }

}
