package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        // ingrediences and kitchen utensils

        Miska cervenaMiska = new Miska("cervenaMiska");
        Miska zlutaMiska = new Miska("zlutaMiska");
        Mixer mixer = new Mixer("mixer");
        Vaha kuchynskaVaha = new Vaha("vaha");
        PlechNaPeceni plech = new PlechNaPeceni("plech");
        ElektrickaTrouba trouba = new ElektrickaTrouba("trouba");

        Vajicka vajicka = new Vajicka("vajicka");
        Ovoce ovoce = new Ovoce("ovoce");
        Maslo maslo125g = new Maslo("maslo125g");
        Mouka pytlikMouky = new Mouka("pytlikMouky");
        Cukr pytlikCukru = new Cukr("pytlikCukru");
        PrasekDoPeciva prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // preparation phase
        trouba.zapniSe(180);

        // red bowl - main bowl
        for (int i = 0; i < 4; i++) {
            cervenaMiska.nalozJedenKus(vajicka);
        }
        cervenaMiska.nalozCelyObsah(pytlikCukru);
        mixer.zamichej(cervenaMiska);
        cervenaMiska.nalozCelyObsah(maslo125g);
        mixer.zamichej(cervenaMiska);

        // yellow bowl - secondary bowl
        kuchynskaVaha.vynulujSeS(zlutaMiska);
        while (kuchynskaVaha.zjistiHmotnost(zlutaMiska) != 250) {
            if (kuchynskaVaha.zjistiHmotnost(zlutaMiska) < 250) {
                zlutaMiska.nalozTrochu(pytlikMouky);
            } else {
                zlutaMiska.vylozTrochu(pytlikMouky);
            }
        }
        // mixing phase
        cervenaMiska.nalozObsahMisky(zlutaMiska);
        cervenaMiska.nalozCelyObsah(prasekDoPeciva);
        mixer.zamichej(cervenaMiska);

        // final phase - baking

        plech.preberObsah(cervenaMiska);
        for (int i = 0; i < 50; i++) {
            plech.posypKusem(ovoce);
        }
        trouba.vlozSiDovnitr(plech);
        trouba.nechejPect(25);
        trouba.vypniSe();
        trouba.vyndejObsahVen();
    }
}

