package sectiunea16.exercitii;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3 extends JFrame{
    int buttonClicked = 0;
    JButton myButton;
    JTextArea myTextArea;

    public static void main(String[] args) {
        new Ex3();
    }

    public Ex3() {
        this.setTitle("Prima fereastra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        JPanel myPanel = new JPanel();

        // Buton nou
        myButton = new JButton("Apasa-ma");
        ListenForButton lbutton = new ListenForButton();
        myButton.addActionListener(lbutton);
        myPanel.add(myButton);

        //TextField
        JTextField myTextField = new JTextField("Username:");
        myTextField.setColumns(30);
        myPanel.add(myTextField);

        //TextArea
        myTextArea = new JTextArea(10,30);
        myTextArea.setText("Aici putem scrie un text mai lung ca sa vedem daca apare scrollbar");
        myPanel.add(myTextArea);

        // ScrollPane
        JScrollPane myScrollPane = new JScrollPane(myTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        myPanel.add(myScrollPane);
        this.add(myPanel);
        this.setVisible(true);
    }

    private class ListenForButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == myButton) {
                buttonClicked++;
                myTextArea.append("Am apasat butonul de " + buttonClicked + "ori\n");
            }
        }
    }
}
