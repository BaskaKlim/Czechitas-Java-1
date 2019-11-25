package cz.czechitas.prvniokno;

import javax.swing.*;
import net.sevecek.util.swing.*;

public class SpousteciTrida {

    public static void main(String[] args) {
       JFrame okno = new JFrame();
       okno.setVisible(true);
        okno.setSize(400,400);
       okno.setLocation(600,600);

       JLabel nadpis = new JLabel("Ahoj holky!");
       okno.add(nadpis) ;

    }

}
