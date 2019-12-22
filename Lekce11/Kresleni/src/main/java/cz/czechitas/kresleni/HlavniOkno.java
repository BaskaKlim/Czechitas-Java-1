package cz.czechitas.kresleni;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;
import net.sevecek.util.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JMenuBar menuBar1;
    JMenuItem menuItem2;
    JMenuItem menuItem3;
    JMenuItem menuItem1;
    JLabel labColor1;
    JLabel labColor2;
    JLabel labColor3;
    JLabel labColor4;
    JLabel labColor6;
    JLabel labColor5;
    JLabel labObrazek;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    BufferedImage obrazek;
    Color barva;

    JFileChooser dialog = new JFileChooser(".");
    

    public HlavniOkno() {
        initComponents();
        nahrajVychoziObrazek();
    }
    private void nahrajVychoziObrazek() {
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/mandala/vychozi-mandala.png");
            obrazek = ImageIO.read(zdrojObrazku);
            labObrazek.setIcon(new ImageIcon(obrazek));
            labObrazek.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }
    }

    //-------------------------------------------------------------------------

    /**
     * Vyplni <code>BufferedImage obrazek</code>
     * na pozicich <code>int x</code>, <code>int y</code>
     * barvou <code>Color barva</code>
     */
    public void vyplnObrazek(BufferedImage obrazek, int x, int y, Color barva) {
        if (barva == null) {
            barva = new Color(255, 255, 0);
        }

        // Zamez vyplnovani mimo rozsah
        if (x < 0 || x >= obrazek.getWidth() || y < 0 || y >= obrazek.getHeight()) {
            return;
        }

        WritableRaster pixely = obrazek.getRaster();
        int[] novyPixel = new int[] {barva.getRed(), barva.getGreen(), barva.getBlue(), barva.getAlpha()};
        int[] staryPixel = new int[] {255, 255, 255, 255};
        staryPixel = pixely.getPixel(x, y, staryPixel);

        // Pokud uz je pocatecni pixel obarven na cilovou barvu, nic nemen
        if (pixelyMajiStejnouBarvu(novyPixel, staryPixel)) {
            return;
        }

        // Zamez prebarveni cerne cary
        int[] cernyPixel = new int[] {0, 0, 0, staryPixel[3]};
        if (pixelyMajiStejnouBarvu(cernyPixel, staryPixel)) {
            return;
        }

        vyplnovaciSmycka(pixely, x, y, novyPixel, staryPixel);
    }

    /**
     * Provede skutecne vyplneni pomoci zasobniku
     */
    private void vyplnovaciSmycka(WritableRaster raster, int x, int y, int[] novaBarva, int[] nahrazovanaBarva) {
        Rectangle rozmery = raster.getBounds();
        int[] aktualniBarva = new int[] {255, 255, 255, 255};

        Deque<Point> zasobnik = new ArrayDeque<>(rozmery.width * rozmery.height);
        zasobnik.push(new Point(x, y));
        while (zasobnik.size() > 0) {
            Point point = zasobnik.pop();
            x = point.x;
            y = point.y;
            if (!pixelyMajiStejnouBarvu(raster.getPixel(x, y, aktualniBarva), nahrazovanaBarva)) {
                continue;
            }

            // Najdi levou zed, po ceste vyplnuj
            int levaZed = x;
            do {
                raster.setPixel(levaZed, y, novaBarva);
                levaZed--;
            }
            while (levaZed >= 0 && pixelyMajiStejnouBarvu(raster.getPixel(levaZed, y, aktualniBarva), nahrazovanaBarva));
            levaZed++;

            // Najdi pravou zed, po ceste vyplnuj
            int pravaZed = x;
            do {
                raster.setPixel(pravaZed, y, novaBarva);
                pravaZed++;
            }
            while (pravaZed < rozmery.width && pixelyMajiStejnouBarvu(raster.getPixel(pravaZed, y, aktualniBarva), nahrazovanaBarva));
            pravaZed--;

            // Pridej na zasobnik body nahore a dole
            for (int i = levaZed; i <= pravaZed; i++) {
                if (y > 0 && pixelyMajiStejnouBarvu(raster.getPixel(i, y - 1, aktualniBarva), nahrazovanaBarva)) {
                    if (!(i > levaZed && i < pravaZed
                            && pixelyMajiStejnouBarvu(raster.getPixel(i - 1, y - 1, aktualniBarva), nahrazovanaBarva)
                            && pixelyMajiStejnouBarvu(raster.getPixel(i + 1, y - 1, aktualniBarva), nahrazovanaBarva))) {
                        zasobnik.add(new Point(i, y - 1));
                    }
                }
                if (y < rozmery.height - 1 && pixelyMajiStejnouBarvu(raster.getPixel(i, y + 1, aktualniBarva), nahrazovanaBarva)) {
                    if (!(i > levaZed && i < pravaZed
                            && pixelyMajiStejnouBarvu(raster.getPixel(i - 1, y + 1, aktualniBarva), nahrazovanaBarva)
                            && pixelyMajiStejnouBarvu(raster.getPixel(i + 1, y + 1, aktualniBarva), nahrazovanaBarva))) {
                        zasobnik.add(new Point(i, y + 1));
                    }
                }
            }
        }
    }

    /**
     * Vrati true pokud RGB hodnoty v polich jsou stejne. Pokud jsou ruzne, vraci false
     */
    private boolean pixelyMajiStejnouBarvu(int[] barva1, int[] barva2) {
        return barva1[0] == barva2[0] && barva1[1] == barva2[1] && barva1[2] == barva2[2];
    }

    private void priKliknutiNaLabColor(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        barva = label.getBackground();
//        stetec.setColor(barva);

    }

    private void priKliknutiNaLabObrazek(MouseEvent e) {
        vyplnObrazek(obrazek,e.getX(),e.getY(), barva);
        labObrazek.repaint();
    }



    //-------------------------------------------------------------------------


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        menuBar1 = new JMenuBar();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem1 = new JMenuItem();
        labColor1 = new JLabel();
        labColor2 = new JLabel();
        labColor3 = new JLabel();
        labColor4 = new JLabel();
        labColor6 = new JLabel();
        labColor5 = new JLabel();
        labObrazek = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mandala");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[grow,fill]",
            // rows
            "[]" +
            "[grow,fill]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //======== menuBar1 ========
        {
            menuBar1.setBackground(new Color(204, 204, 204));

            //---- menuItem2 ----
            menuItem2.setText("Otvorit obrazok");
            menuBar1.add(menuItem2);

            //---- menuItem3 ----
            menuItem3.setText("Ulozit obrazok");
            menuBar1.add(menuItem3);

            //---- menuItem1 ----
            menuItem1.setText("Ukoncit program");
            menuBar1.add(menuItem1);
        }
        setJMenuBar(menuBar1);

        //---- labColor1 ----
        labColor1.setOpaque(true);
        labColor1.setBorder(new BevelBorder(BevelBorder.RAISED));
        labColor1.setMinimumSize(new Dimension(32, 32));
        labColor1.setBackground(new Color(255, 51, 153));
        labColor1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabColor(e);
            }
        });
        contentPane.add(labColor1, "cell 0 0");

        //---- labColor2 ----
        labColor2.setOpaque(true);
        labColor2.setBorder(new BevelBorder(BevelBorder.RAISED));
        labColor2.setMinimumSize(new Dimension(32, 32));
        labColor2.setBackground(new Color(255, 204, 102));
        labColor2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabColor(e);
            }
        });
        contentPane.add(labColor2, "cell 1 0");

        //---- labColor3 ----
        labColor3.setOpaque(true);
        labColor3.setBorder(new BevelBorder(BevelBorder.RAISED));
        labColor3.setMinimumSize(new Dimension(32, 32));
        labColor3.setBackground(new Color(153, 0, 153));
        labColor3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabColor(e);
            }
        });
        contentPane.add(labColor3, "cell 2 0");

        //---- labColor4 ----
        labColor4.setOpaque(true);
        labColor4.setBorder(new BevelBorder(BevelBorder.RAISED));
        labColor4.setMinimumSize(new Dimension(32, 32));
        labColor4.setBackground(new Color(0, 204, 204));
        labColor4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabColor(e);
            }
        });
        contentPane.add(labColor4, "cell 3 0");

        //---- labColor6 ----
        labColor6.setOpaque(true);
        labColor6.setBorder(new BevelBorder(BevelBorder.RAISED));
        labColor6.setMinimumSize(new Dimension(32, 32));
        labColor6.setBackground(new Color(0, 153, 204));
        labColor6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabColor(e);
            }
        });
        contentPane.add(labColor6, "cell 4 0");

        //---- labColor5 ----
        labColor5.setOpaque(true);
        labColor5.setBorder(new BevelBorder(BevelBorder.RAISED));
        labColor5.setMinimumSize(new Dimension(32, 32));
        labColor5.setBackground(new Color(204, 204, 255));
        labColor5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabColor(e);
            }
        });
        contentPane.add(labColor5, "cell 5 0");

        //---- labObrazek ----
        labObrazek.setHorizontalAlignment(SwingConstants.LEFT);
        labObrazek.setVerticalAlignment(SwingConstants.TOP);
        labObrazek.setMinimumSize(new Dimension(700, 700));
        labObrazek.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiNaLabObrazek(e);
            }
        });
        contentPane.add(labObrazek, "cell 0 1 8 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
