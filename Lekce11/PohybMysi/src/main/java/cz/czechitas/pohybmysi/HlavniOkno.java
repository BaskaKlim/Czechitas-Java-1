package cz.czechitas.pohybmysi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labPlocha;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priPohybuNadLabPlocha(MouseEvent e) {
        // TODO add your code here
        int x= e.getX();
        int y = e.getY();

        int absolutniX = e.getXOnScreen();
        int absolutniY = e.getYOnScreen();
        String suradnice = "x:" + x + "y:" + y + "\n Absolutni x: " + absolutniX + "," + "Absolutni y: " + absolutniY;

        labPlocha.setText(suradnice);


    }

    private void priStlaceniMysiNadLabPlocha(MouseEvent e) {
        // TODO add your code here

        int x= e.getX();
        int y = e.getY();

        String suradnice = "x:" + x + "y:" + y;

        this.setTitle(suradnice);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labPlocha = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PohybMysiEventHandler");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow,fill]",
            // rows
            "[grow,fill]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labPlocha ----
        labPlocha.setText("text");
        labPlocha.setHorizontalAlignment(SwingConstants.CENTER);
        labPlocha.setBackground(new Color(51, 153, 255));
        labPlocha.setOpaque(true);
        labPlocha.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                priPohybuNadLabPlocha(e);
            }
        });
        labPlocha.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priStlaceniMysiNadLabPlocha(e);
            }
        });
        contentPane.add(labPlocha, "cell 0 0");
        setSize(400, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
