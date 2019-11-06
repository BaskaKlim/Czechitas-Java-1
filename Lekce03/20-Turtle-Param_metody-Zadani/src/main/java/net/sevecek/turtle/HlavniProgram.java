package net.sevecek.turtle;

import java.awt.*;
import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();
        Color barva1;
        barva1 = new Color(88, 32, 71);

        nakresliObdelnik(20.0,50.0,90.0);
        nakresliTrojuholnik(100.0, 120,barva1);

    }

    public void nakresliObdelnik(double stranaA, double stranaB, double uhol) {

        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);
            zofka.turnRight(uhol);
            zofka.move(stranaB);
            zofka.turnRight(uhol);
        }
    }

    public void nakresliStverec(double strana) {
        nakresliObdelnik(strana, strana, 90.0);
    }

    public void nakresliTrojuholnik(double stranaC, double uholC, Color barvaStetce) {
        Color  schovanaBarva;
        schovanaBarva= zofka.getPenColor();
        zofka.setPenColor(barvaStetce);
        zofka.turnRight(30);
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(uholC);
            zofka.move(stranaC);
        }
        zofka.turnLeft(30);
        zofka.setPenColor(schovanaBarva);
    }
}