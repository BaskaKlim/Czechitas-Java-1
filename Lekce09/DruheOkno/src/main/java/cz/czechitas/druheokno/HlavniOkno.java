package cz.czechitas.druheokno;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labJmeno;
    JTextField txtJmeno;
    JButton btnPozdravit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStiskuTlacitkaPozdravit(ActionEvent e) {
        String jmeno = txtJmeno.getText();
       // System.out.println("Pozdravujem Ta");
        JOptionPane.showMessageDialog(this,"Pozdravujem Ta pozemstan " + jmeno);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labJmeno = new JLabel();
        txtJmeno = new JTextField();
        btnPozdravit = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DruheOkno");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[grow,fill]" +
            "[fill]",
            // rows
            "[fill]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labJmeno ----
        labJmeno.setText("Zadajte svoje jmeno");
        contentPane.add(labJmeno, "cell 0 0");

        //---- txtJmeno ----
        txtJmeno.setColumns(20);
        contentPane.add(txtJmeno, "cell 1 0");

        //---- btnPozdravit ----
        btnPozdravit.setText("Pozdrav");
        btnPozdravit.addActionListener(e -> priStiskuTlacitkaPozdravit(e));
        contentPane.add(btnPozdravit, "cell 2 0");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
