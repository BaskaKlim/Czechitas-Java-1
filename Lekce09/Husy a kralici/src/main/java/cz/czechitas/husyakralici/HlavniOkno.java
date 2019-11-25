package cz.czechitas.husyakralici;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labPocetHus;
    JTextField txtHusy;
    JLabel labPocetKralikov;
    JTextField txtKralici;
    JButton btnVypocitat;
    JLabel labPocetNoh;
    JTextField txtPocetNohov;
    JLabel labPocetHlav;
    JTextField txtPocetHlav;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void btnVypocitatPocetHlavANoh (ActionEvent e) {
        String pocetHusString = txtHusy.getText();
        int pocetHus = Integer.parseInt(pocetHusString);

        String pocetKralikovString = txtKralici.getText();
        int pocetKralikov = Integer.parseInt(pocetKralikovString);

        int pocetNoh = pocetHus * 2 + pocetKralikov * 4;
        int pocetHlav = pocetHus + pocetKralikov;
        // TODO: vypisanie do popup okna
        // JOptionPane.showMessageDialog(this,"pocet nohou je " + pocetNoh + " pocet hlav je " + pocetHlav);
        // TODO: vypisanie do text fieldu
        txtPocetNohov.setText(Integer.toString(pocetNoh));
        txtPocetHlav.setText(Integer.toString(pocetHlav));

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labPocetHus = new JLabel();
        txtHusy = new JTextField();
        labPocetKralikov = new JLabel();
        txtKralici = new JTextField();
        btnVypocitat = new JButton();
        labPocetNoh = new JLabel();
        txtPocetNohov = new JTextField();
        labPocetHlav = new JLabel();
        txtPocetHlav = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Husy a kralici");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[grow,fill]",
            // rows
            "[fill]" +
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

        //---- labPocetHus ----
        labPocetHus.setText("Pocet hus:");
        contentPane.add(labPocetHus, "cell 0 0");

        //---- txtHusy ----
        txtHusy.setColumns(20);
        contentPane.add(txtHusy, "cell 1 0");

        //---- labPocetKralikov ----
        labPocetKralikov.setText("Pocet kralikov:");
        contentPane.add(labPocetKralikov, "cell 0 1");
        contentPane.add(txtKralici, "cell 1 1");

        //---- btnVypocitat ----
        btnVypocitat.setText("Vypocitat");
        btnVypocitat.addActionListener(e -> btnVypocitatPocetHlavANoh(e));
        contentPane.add(btnVypocitat, "cell 1 2");

        //---- labPocetNoh ----
        labPocetNoh.setText("Pocet nohov:");
        contentPane.add(labPocetNoh, "cell 0 3");
        contentPane.add(txtPocetNohov, "cell 1 3");

        //---- labPocetHlav ----
        labPocetHlav.setText("Pocet hlav: ");
        contentPane.add(labPocetHlav, "cell 0 4");
        contentPane.add(txtPocetHlav, "cell 1 4");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
