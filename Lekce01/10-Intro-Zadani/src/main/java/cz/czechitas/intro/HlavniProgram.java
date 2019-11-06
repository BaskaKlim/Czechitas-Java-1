package cz.czechitas.intro;

import cz.czechitas.intro.api.*;
import net.sevecek.util.*;

public class HlavniProgram {

    public void main(String[] args) {
        // ak chcem pracovat s objektmi, musim si ich najprv pomenovat
        AngryRed karel;
        AngryRed lucas;
        AngryMatilda Cica;
        karel = new AngryRed(400, 200);
        // TODO: Sem vepiste svuj program
        lucas = new AngryRed(100, 50);
        Cica = new AngryMatilda(20, 400);
        Cica.moveForward(900);


        for (int i = 0; i < 4; i++) {
            while (karel.isPossibleToMoveForward()) {
                karel.moveForward();
            }
            karel.turnRight();
        }
    }
}
