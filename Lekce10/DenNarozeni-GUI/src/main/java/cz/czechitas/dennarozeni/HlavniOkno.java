package cz.czechitas.dennarozeni;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labDatum;
    JTextField txtDen;
    JLabel labOddelovac1;
    JTextField txtMesiac;
    JLabel labOddelovac2;
    JTextField txtRok;
    JButton btnVypocitaj;
    JLabel labDen;
    JTextField txtDenNarozeni;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStisknutiVypocitaj(ActionEvent e) {
        String den = txtDen.getText();
        int denCislo = Integer.parseInt(den);
        String mesiac = txtMesiac.getText();
        int mesiacCislo = Integer.parseInt(mesiac);
        String rok = txtRok.getText();
        int rokCislo = Integer.parseInt(rok);

        LocalDate datumNarozeni = LocalDate.of(rokCislo, mesiacCislo, denCislo);
        DayOfWeek denVTydnu = datumNarozeni.getDayOfWeek();
        // EEEE kod pre den
        DateTimeFormatter formatovac = DateTimeFormatter.ofPattern("EEEE", new Locale("cs"));
        String nazevDne = formatovac.format(denVTydnu);
        txtDenNarozeni.setText(nazevDne);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labDatum = new JLabel();
        txtDen = new JTextField();
        labOddelovac1 = new JLabel();
        txtMesiac = new JTextField();
        labOddelovac2 = new JLabel();
        txtRok = new JTextField();
        btnVypocitaj = new JButton();
        labDen = new JLabel();
        txtDenNarozeni = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DenNarozeni-GUI");
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
            "[fill]" +
            "[fill]",
            // rows
            "[fill]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labDatum ----
        labDatum.setText("Datum narodenia:");
        labDatum.setFont(labDatum.getFont().deriveFont(labDatum.getFont().getStyle() | Font.BOLD, labDatum.getFont().getSize() + 8f));
        contentPane.add(labDatum, "cell 0 0 5 1");

        //---- txtDen ----
        txtDen.setColumns(2);
        contentPane.add(txtDen, "cell 0 0 5 1");

        //---- labOddelovac1 ----
        labOddelovac1.setText(".");
        contentPane.add(labOddelovac1, "cell 5 0");

        //---- txtMesiac ----
        txtMesiac.setColumns(2);
        contentPane.add(txtMesiac, "cell 6 0");

        //---- labOddelovac2 ----
        labOddelovac2.setText(".");
        contentPane.add(labOddelovac2, "cell 7 0");

        //---- txtRok ----
        txtRok.setColumns(4);
        contentPane.add(txtRok, "cell 8 0");

        //---- btnVypocitaj ----
        btnVypocitaj.setText("Prepocitaj");
        btnVypocitaj.addActionListener(e -> priStisknutiVypocitaj(e));
        contentPane.add(btnVypocitaj, "cell 0 1 9 1,alignx center,growx 0");

        //---- labDen ----
        labDen.setText("Den, kedy ste sa narodili:");
        labDen.setFont(labDen.getFont().deriveFont(labDen.getFont().getStyle() | Font.BOLD, labDen.getFont().getSize() + 7f));
        contentPane.add(labDen, "cell 0 2 5 1");

        //---- txtDenNarozeni ----
        txtDenNarozeni.setColumns(2);
        txtDenNarozeni.setEditable(false);
        contentPane.add(txtDenNarozeni, "cell 5 2 4 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }
}
