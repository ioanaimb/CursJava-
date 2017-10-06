package sectiunea16.exercitii;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 extends JFrame{
    JLabel label1, label2;
    JTextField textField1, textField2;
    JButton myButton;
    double numar1, numar2, rezultat;
    JRadioButton aduna, scade, inmulteste, imparte;

    public static void main(String[] args) {
        new Ex2();
    }

    public Ex2() {
        this.setTitle("Aduna doua numere");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        JPanel myPanel = new JPanel();

        // Label1
        label1 = new JLabel("Primul numar");
        myPanel.add(label1);

        //TextField1
        textField1 = new JTextField("",5);
        myPanel.add(textField1);

        // Label1
        label2 = new JLabel("Al doilea numar");
        myPanel.add(label2);

        //TextField1
        textField2 = new JTextField("",5);
        myPanel.add(textField2);

        // Radiobuttons
        aduna = new JRadioButton("Adunare");
        scade = new JRadioButton("Scadere");
        inmulteste = new JRadioButton("Inmultire");
        imparte = new JRadioButton("Impartire");

        JPanel operPanel = new JPanel();
        Border operBorder = BorderFactory.createTitledBorder("Operatii");
        operPanel.setBorder(operBorder);

        ButtonGroup operation = new ButtonGroup();
        operation.add(aduna);
        operation.add(scade);
        operation.add(inmulteste);
        operation.add(imparte);

        operPanel.add(aduna);
        operPanel.add(scade);
        operPanel.add(inmulteste);
        operPanel.add(imparte);
        aduna.setSelected(true);
        myPanel.add(operPanel);

        // Buton nou
        myButton = new JButton("Calculeaza");
        ListenForButton lbutton = new ListenForButton();
        myButton.addActionListener(lbutton);
        myPanel.add(myButton);

        this.add(myPanel);
        this.setVisible(true);
    }

    private class ListenForButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== myButton) {
                numar1 = Double.parseDouble(textField1.getText());
                numar2 = Double.parseDouble(textField2.getText());
                if(aduna.isSelected()) {
                    rezultat = numar1 + numar2;
                } else if (scade.isSelected()) {
                    rezultat = numar1 - numar2;
                } else if (inmulteste.isSelected()) {
                    rezultat = numar1 * numar2;
                } else {
                    rezultat = numar1/numar2;
                }

               JOptionPane.showMessageDialog(Ex2.this, rezultat, "Rezultat",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}