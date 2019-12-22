package cz.czechitas.grafika;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labPlocha;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    BufferedImage obrazek;
    Graphics2D stetec;

    public HlavniOkno() {

        initComponents();
        obrazek = new BufferedImage(400, 300, BufferedImage.TYPE_3BYTE_BGR);
        labPlocha.setIcon(new ImageIcon(obrazek));
        labPlocha.setText("");
        labPlocha.setBackground(null);

        stetec = (Graphics2D) obrazek.getGraphics();
        stetec.setColor(Color.WHITE);
        stetec.fillRect(0, 0, obrazek.getWidth(), obrazek.getHeight());
        stetec.setColor(Color.BLUE);
        stetec.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        stetec.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      //  stetec.drawLine(10, 10, 200, 100);
        stetec.drawLine(300, 50, 300, 50);

    }

    private void priStisknutiMysiNadLabPlocha(MouseEvent e) {

        int x= e.getX();
        int y = e.getY();
        stetec.drawLine(x,y,x,y);
        labPlocha.repaint();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labPlocha = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grafika");
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
        labPlocha.setHorizontalAlignment(SwingConstants.LEFT);
        labPlocha.setVerticalAlignment(SwingConstants.TOP);
        labPlocha.setOpaque(true);
        labPlocha.setBackground(new Color(204, 255, 204));
        labPlocha.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priStisknutiMysiNadLabPlocha(e);
            }
        });
        contentPane.add(labPlocha, "cell 0 0");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
