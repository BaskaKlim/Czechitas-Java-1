package net.sevecek.turtle;

import java.awt.*;
import java.util.concurrent.*;
import net.sevecek.turtle.engine.*;
import sun.rmi.runtime.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle donatelo;
        donatelo = new Turtle();
        // paralizovanie jadier
        // ExecutorService paralelniSpoucec;
        //paralelniSpoucec = Executors.newCachedThreadPool();
        //  paralelniSpoucec.execute(this::kresliDonatelem);
        //  paralelniSpoucec.execute(this::kresliLeonardem);
        // kresliLeonardem();
        // kresliDonatelem();
        //  paralelniSpoucec.shutdown();
        //  nakresliRovnostrannyTrojuholnik(donatelo, 30, 30);
        nakresliNuholnik(donatelo, 11, 30);
    }

    /*public void nakresliRovnostrannyTrojuholnik(Turtle zelva, double strana, double uhol) {
        zelva.turnRight(30);
        for (int i = 0; i <3; i++) {
            zelva.move(strana);
            zelva.turnRight(uhol);
        }
        zelva.turnLeft(30);
    }
                     */

    public void nakresliNuholnik(Turtle zelva, int n, double strana) {

        for (int i = 0; i <= n; i++) {
            zelva.move(strana);
            zelva.turnRight(30);
        }

    }
}
        /* public void kresliLeonardem () {
            Turtle leonardo;
            leonardo = new Turtle();
            leonardo.setPenColor((new Color(74, 238, 239)));
            leonardo.penUp();
            leonardo.move(100.0);
            leonardo.penDown();
            nakresliRovnostrannzTrojuholnik(leonardo, 100.0, 120);
        }
        */
        /*

        public void kresliDonatelem () {
            Turtle donatelo;
            donatelo = new Turtle();
            donatelo.setPenColor((new Color(150, 90, 210)));
            nakresliRovnostrannzTrojuholnik(donatelo, 100.0, 120);
        }     */
