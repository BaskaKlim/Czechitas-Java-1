package cz.czechitas.farmarka2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    public static final double MNOZSTVO_MRKVE = 0.5;
    public static final double MNOZSTVO_PSENICE = 0.25;
    public static final int POCET_DNI = 183;

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labNadpis;
    JLabel labPocetHus;
    JTextField txtPocetHus;
    JLabel labPocetKraliku;
    JTextField txtPocetKraliku;
    JButton btnVypocitat;
    JLabel labNadpis2;
    JLabel labHmotnostPsenice;
    JTextField txtHmotnostPsenice;
    JLabel labPocetRadkuPsenice;
    JTextField txtPocetRadkuPsenice;
    JLabel labHmotnostMrkve;
    JTextField txtHmotnostMrkve;
    JLabel labPocetRadkuMrkve;
    JTextField txtPocetRadkuMrkve;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStisknutiButtonuVypocitaj(ActionEvent e) {
        String pocetHusString = txtPocetHus.getText();
        double pocetHus = Double.parseDouble(pocetHusString);

        String pocetKralikovString = txtPocetKraliku.getText();
        double pocetKralikov = Double.parseDouble(pocetKralikovString);

        double hmotnostMrkve = pocetKralikov *MNOZSTVO_MRKVE * POCET_DNI;
        double hmotnostPsenice = pocetHus * MNOZSTVO_PSENICE * POCET_DNI;

        double pocetRadkuMrkve = hmotnostMrkve / 5;
        double pocetRadkuPsenice = hmotnostPsenice / 2;

        txtHmotnostPsenice.setText(Double.toString(hmotnostPsenice));
        txtHmotnostMrkve.setText(Double.toString(hmotnostMrkve));

        txtPocetRadkuPsenice.setText(Double.toString(pocetRadkuPsenice));
        txtPocetRadkuMrkve.setText(Double.toString(pocetRadkuMrkve));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labNadpis = new JLabel();
        labPocetHus = new JLabel();
        txtPocetHus = new JTextField();
        labPocetKraliku = new JLabel();
        txtPocetKraliku = new JTextField();
        btnVypocitat = new JButton();
        labNadpis2 = new JLabel();
        labHmotnostPsenice = new JLabel();
        txtHmotnostPsenice = new JTextField();
        labPocetRadkuPsenice = new JLabel();
        txtPocetRadkuPsenice = new JTextField();
        labHmotnostMrkve = new JLabel();
        txtHmotnostMrkve = new JTextField();
        labPocetRadkuMrkve = new JLabel();
        txtPocetRadkuMrkve = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Farmarka 2.0");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[94,fill]" +
            "[127,fill]" +
            "[grow,fill]",
            // rows
            "[fill]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labNadpis ----
        labNadpis.setText("Husy a kralici");
        labNadpis.setFont(labNadpis.getFont().deriveFont(labNadpis.getFont().getSize() + 7f));
        contentPane.add(labNadpis, "cell 0 0 3 1");

        //---- labPocetHus ----
        labPocetHus.setText("Pocet hus:");
        labPocetHus.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetHus, "cell 1 1");
        contentPane.add(txtPocetHus, "cell 2 1 2 1");

        //---- labPocetKraliku ----
        labPocetKraliku.setText("Pocet kraliku:");
        labPocetKraliku.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetKraliku, "cell 1 2");
        contentPane.add(txtPocetKraliku, "cell 2 2 2 1");

        //---- btnVypocitat ----
        btnVypocitat.setText("Vypocitat");
        btnVypocitat.addActionListener(e -> priStisknutiButtonuVypocitaj(e));
        contentPane.add(btnVypocitat, "cell 2 3");

        //---- labNadpis2 ----
        labNadpis2.setText("Potrebne potraviny:");
        labNadpis2.setFont(labNadpis2.getFont().deriveFont(labNadpis2.getFont().getSize() + 7f));
        contentPane.add(labNadpis2, "cell 0 4 3 1");

        //---- labHmotnostPsenice ----
        labHmotnostPsenice.setText("Hmotnost psenice:");
        labHmotnostPsenice.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labHmotnostPsenice, "cell 1 5");

        //---- txtHmotnostPsenice ----
        txtHmotnostPsenice.setEditable(false);
        contentPane.add(txtHmotnostPsenice, "cell 2 5 2 1");

        //---- labPocetRadkuPsenice ----
        labPocetRadkuPsenice.setText("Pocet radku psenice:");
        labPocetRadkuPsenice.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetRadkuPsenice, "cell 1 6");

        //---- txtPocetRadkuPsenice ----
        txtPocetRadkuPsenice.setEditable(false);
        contentPane.add(txtPocetRadkuPsenice, "cell 2 6 2 1");

        //---- labHmotnostMrkve ----
        labHmotnostMrkve.setText("Hmotnost mrkve:");
        labHmotnostMrkve.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labHmotnostMrkve, "cell 1 7");

        //---- txtHmotnostMrkve ----
        txtHmotnostMrkve.setEditable(false);
        contentPane.add(txtHmotnostMrkve, "cell 2 7 2 1");

        //---- labPocetRadkuMrkve ----
        labPocetRadkuMrkve.setText("Pocet radku mrkve:");
        labPocetRadkuMrkve.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetRadkuMrkve, "cell 1 8");

        //---- txtPocetRadkuMrkve ----
        txtPocetRadkuMrkve.setEditable(false);
        contentPane.add(txtPocetRadkuMrkve, "cell 2 8 2 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}


