package cz.czechitas.farmarka3;

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
    JLabel labNadpisHusy;
    JLabel labNadpisKralici;
    JLabel labPocetHusSamcu;
    JTextField txtPocetHusSamcu;
    JLabel labPocetKralikuSamcu;
    JTextField txtPocetKralikuSamcu;
    JLabel labPocetHusSamic;
    JTextField txtPocetHusSamic;
    JLabel labPocetKralikuSamic;
    JTextField txtPocetKralikuSamcic;
    JButton btnVypocitat;
    JLabel labNadpisCelkovyPocet;
    JLabel labPocetHus;
    JTextField txtPocetHus;
    JLabel labPocetKraliku;
    JTextField txtPocetKraliku;
    JLabel labNadpisPotraviny;
    JLabel labHmotnostPsenice;
    JTextField txtHmotnostPsenice;
    JLabel labHmotnostMrkve;
    JTextField txtHmotnostMrkve;
    JLabel labPocetRadkuPsenice;
    JTextField txtPocetRadkuPsenice;
    JLabel labPocetRadkuMrkve;
    JTextField txtPocetRadkuMrkve;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStisknutiButtonuVypocitaj(ActionEvent e) {
        String pocetHusSamcuString = txtPocetHusSamcu.getText();
        double pocetHusSamcu = Double.parseDouble(pocetHusSamcuString);

        String pocetHusSamcicString = txtPocetHusSamic.getText();
        double pocetHusSamic = Double.parseDouble(pocetHusSamcicString);

        String pocetKralikovSamcuString = txtPocetKralikuSamcu.getText();
        double pocetKralikovSamcu = Double.parseDouble(pocetKralikovSamcuString);

        String pocetKralikovSamicString = txtPocetKralikuSamcic.getText();
        double pocetKralikovSamic = Double.parseDouble(pocetKralikovSamicString);

        double pocetHus;
        double pocetKraliku;

        if (pocetHusSamcu > 0 && pocetHusSamic > 0) {
            // husata =  kazda hus samica bude mat aspon 15 husat ak je splnena podmienka
            pocetHus = pocetHusSamic * 15 + pocetHusSamcu + pocetHusSamic;
        } else {
            pocetHus = pocetHusSamcu + pocetHusSamic;
        }

        if (pocetKralikovSamcu > 0 && pocetKralikovSamic > 0) {
            // kralicky =  kazda kralici  samica bude mat aspon 40 kralicat ak je splnena podmienka
            pocetKraliku = pocetKralikovSamic * 40 + pocetKralikovSamcu + pocetKralikovSamic;
        } else {
            pocetKraliku = pocetKralikovSamcu + pocetKralikovSamic;
        }

        double hmotnostMrkve = pocetKraliku * MNOZSTVO_MRKVE * POCET_DNI;
        double hmotnostPsenice = pocetHus * MNOZSTVO_PSENICE * POCET_DNI;

        double pocetRadkuMrkve = hmotnostMrkve / 5;
        double pocetRadkuPsenice = hmotnostPsenice / 2;


        txtPocetHus.setText(Double.toString(pocetHus));
        txtPocetKraliku.setText(Double.toString(pocetKraliku));

        txtHmotnostPsenice.setText(Double.toString(hmotnostPsenice));
        txtHmotnostMrkve.setText(Double.toString(hmotnostMrkve));

        txtPocetRadkuPsenice.setText(Double.toString(pocetRadkuPsenice));
        txtPocetRadkuMrkve.setText(Double.toString(pocetRadkuMrkve));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labNadpisHusy = new JLabel();
        labNadpisKralici = new JLabel();
        labPocetHusSamcu = new JLabel();
        txtPocetHusSamcu = new JTextField();
        labPocetKralikuSamcu = new JLabel();
        txtPocetKralikuSamcu = new JTextField();
        labPocetHusSamic = new JLabel();
        txtPocetHusSamic = new JTextField();
        labPocetKralikuSamic = new JLabel();
        txtPocetKralikuSamcic = new JTextField();
        btnVypocitat = new JButton();
        labNadpisCelkovyPocet = new JLabel();
        labPocetHus = new JLabel();
        txtPocetHus = new JTextField();
        labPocetKraliku = new JLabel();
        txtPocetKraliku = new JTextField();
        labNadpisPotraviny = new JLabel();
        labHmotnostPsenice = new JLabel();
        txtHmotnostPsenice = new JTextField();
        labHmotnostMrkve = new JLabel();
        txtHmotnostMrkve = new JTextField();
        labPocetRadkuPsenice = new JLabel();
        txtPocetRadkuPsenice = new JTextField();
        labPocetRadkuMrkve = new JLabel();
        txtPocetRadkuMrkve = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Farmarka 3.0");
        setFont(new Font("Dialog", Font.BOLD, 12));
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[100,fill]" +
            "[100,fill]" +
            "[100,fill]" +
            "[100,fill]",
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
            "[]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labNadpisHusy ----
        labNadpisHusy.setText("Husy");
        labNadpisHusy.setFont(labNadpisHusy.getFont().deriveFont(labNadpisHusy.getFont().getStyle() | Font.BOLD, labNadpisHusy.getFont().getSize() + 8f));
        labNadpisHusy.setHorizontalTextPosition(SwingConstants.CENTER);
        labNadpisHusy.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(labNadpisHusy, "cell 0 0 2 1");

        //---- labNadpisKralici ----
        labNadpisKralici.setText("Kralici");
        labNadpisKralici.setFont(labNadpisKralici.getFont().deriveFont(labNadpisKralici.getFont().getStyle() | Font.BOLD, labNadpisKralici.getFont().getSize() + 8f));
        labNadpisKralici.setHorizontalTextPosition(SwingConstants.CENTER);
        labNadpisKralici.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(labNadpisKralici, "cell 2 0 2 1");

        //---- labPocetHusSamcu ----
        labPocetHusSamcu.setText("Pocet samcu:");
        labPocetHusSamcu.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetHusSamcu, "cell 0 1");
        contentPane.add(txtPocetHusSamcu, "cell 1 1");

        //---- labPocetKralikuSamcu ----
        labPocetKralikuSamcu.setText("Pocet samcu:");
        labPocetKralikuSamcu.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetKralikuSamcu, "cell 2 1");
        contentPane.add(txtPocetKralikuSamcu, "cell 3 1");

        //---- labPocetHusSamic ----
        labPocetHusSamic.setText("Pocet samic:");
        labPocetHusSamic.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetHusSamic, "cell 0 2");
        contentPane.add(txtPocetHusSamic, "cell 1 2");

        //---- labPocetKralikuSamic ----
        labPocetKralikuSamic.setText("Pocet samic:");
        labPocetKralikuSamic.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetKralikuSamic, "cell 2 2");
        contentPane.add(txtPocetKralikuSamcic, "cell 3 2");

        //---- btnVypocitat ----
        btnVypocitat.setText("Vypocitat");
        btnVypocitat.addActionListener(e -> priStisknutiButtonuVypocitaj(e));
        contentPane.add(btnVypocitat, "cell 1 4 2 1");

        //---- labNadpisCelkovyPocet ----
        labNadpisCelkovyPocet.setText("Celkovy pocet po sezone pred zimou");
        labNadpisCelkovyPocet.setFont(labNadpisCelkovyPocet.getFont().deriveFont(labNadpisCelkovyPocet.getFont().getStyle() | Font.BOLD, labNadpisCelkovyPocet.getFont().getSize() + 8f));
        labNadpisCelkovyPocet.setHorizontalTextPosition(SwingConstants.CENTER);
        labNadpisCelkovyPocet.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(labNadpisCelkovyPocet, "cell 0 6 4 1");

        //---- labPocetHus ----
        labPocetHus.setText("Poce hus:");
        labPocetHus.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetHus, "cell 0 7");

        //---- txtPocetHus ----
        txtPocetHus.setEditable(false);
        contentPane.add(txtPocetHus, "cell 1 7");

        //---- labPocetKraliku ----
        labPocetKraliku.setText("Poce kralikov:");
        labPocetKraliku.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetKraliku, "cell 2 7");

        //---- txtPocetKraliku ----
        txtPocetKraliku.setEditable(false);
        contentPane.add(txtPocetKraliku, "cell 3 7");

        //---- labNadpisPotraviny ----
        labNadpisPotraviny.setText("Potrebne potraviny:");
        labNadpisPotraviny.setFont(labNadpisPotraviny.getFont().deriveFont(labNadpisPotraviny.getFont().getStyle() | Font.BOLD, labNadpisPotraviny.getFont().getSize() + 8f));
        labNadpisPotraviny.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(labNadpisPotraviny, "cell 0 8 4 1");

        //---- labHmotnostPsenice ----
        labHmotnostPsenice.setText("Hmotnost psenice:");
        labHmotnostPsenice.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labHmotnostPsenice, "cell 0 10");

        //---- txtHmotnostPsenice ----
        txtHmotnostPsenice.setEditable(false);
        contentPane.add(txtHmotnostPsenice, "cell 1 10");

        //---- labHmotnostMrkve ----
        labHmotnostMrkve.setText("Hmotnost mrkve:");
        labHmotnostMrkve.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labHmotnostMrkve, "cell 2 10");

        //---- txtHmotnostMrkve ----
        txtHmotnostMrkve.setEditable(false);
        contentPane.add(txtHmotnostMrkve, "cell 3 10");

        //---- labPocetRadkuPsenice ----
        labPocetRadkuPsenice.setText("Pocet radku psenice:");
        labPocetRadkuPsenice.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetRadkuPsenice, "cell 0 11");

        //---- txtPocetRadkuPsenice ----
        txtPocetRadkuPsenice.setEditable(false);
        contentPane.add(txtPocetRadkuPsenice, "cell 1 11");

        //---- labPocetRadkuMrkve ----
        labPocetRadkuMrkve.setText("Pocet radku mrkve:");
        labPocetRadkuMrkve.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        contentPane.add(labPocetRadkuMrkve, "cell 2 11");

        //---- txtPocetRadkuMrkve ----
        txtPocetRadkuMrkve.setEditable(false);
        contentPane.add(txtPocetRadkuMrkve, "cell 3 11");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
