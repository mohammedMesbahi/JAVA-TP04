import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//---------------------------------- Exercice 1 :
// Modifier le programme suivant pour que le label affiche le nombre
//d'appuis sur le bouton.
//----------------------------------  Exercice 2 :
//Modifier le programme précédent afin qu'un bouton incrémente le
//compteur et qu'un autre bouton le décrémente.
public class Ex1_2 {
    private JLabel label; // label To show the number of clicks
    JButton buttonPlus; // button to increment the counter
    JButton buttonMoins; // button to decrement the counter
    private Integer counter = 0;
    public Ex1_2() {
        JFrame frame = new JFrame("exemple"); // creating a Frame
        buttonPlus = new JButton("plus"); // creating a button
        buttonMoins= new JButton("moins");
        MyActionListener actionListener1 = new MyActionListener(); // creating an actionListener
        // adding actionlistener to the buttons
        buttonPlus.addActionListener(actionListener1);
        buttonMoins.addActionListener(actionListener1);
        // Creating a Label
        label = new JLabel(counter.toString());
        // creating a panel
        JPanel pane = new JPanel();

        // setting size of pane
        pane.setSize(500,500);
        // adding components into frame
        pane.add(buttonPlus);
        pane.add(buttonMoins);
        pane.add(label);

        frame.getContentPane().add(pane,BorderLayout.CENTER); // adding pan into frame
        frame.setVisible(true); // setting visibility of frame
        frame.setSize(500,500); // set size of the frame
        frame.setLocation(200,150);   // set the position of the frame
    }
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonPlus){
                counter++;
                label.setText(counter.toString());
            } else if (event.getSource() == buttonMoins){
                counter--;
                label.setText(counter.toString());
            }

        }
    }
    public static void main(String[] args) {
        new Ex1_2();
    }
}
