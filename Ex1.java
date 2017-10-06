package sectiunea16.exercitii;

import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame{
    public static void main(String[] args) {
        new Ex1();
    }

    public Ex1() {
        this.setTitle("Prima fereastra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        JPanel myPanel = new JPanel();

        // Label nou
        JLabel myLabel = new JLabel("User Name");
        myPanel.add(myLabel);

        //TextField
        JTextField myTextField = new JTextField("Username:");
        myTextField.setColumns(30);
        myPanel.add(myTextField);

        //TextArea
         JTextArea myTextArea = new JTextArea(10,30);
         myTextArea.setText("Aici putem scrie un text mai lung ca sa vedem daca apare scrollbar");
         myPanel.add(myTextArea);

         // ScrollPane
        JScrollPane myScrollPane = new JScrollPane(myTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        myPanel.add(myScrollPane);
        this.add(myPanel);

        // Buton nou
        JButton myButton = new JButton("Apasa-ma");
        myPanel.add(myButton);
        this.setVisible(true);

    }

}
