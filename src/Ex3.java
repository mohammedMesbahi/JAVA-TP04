import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
public class Ex3 {
    JFrame frame;
    JMenuBar menuBar;
    JMenu menu,submenu;
    JMenuItem New,Open,Save,Big,Small;
    JPanel pane ;
    JLabel label;
    JTextArea textArea;
    public Ex3() {

        frame = new JFrame("exemple");
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        submenu = new JMenu("Property");

        New = new JMenuItem("New");
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Big = new JMenuItem("Big");
        Small = new JMenuItem("Small");

        menu.add(New);
        menu.add(Open);
        menu.add(Save);

        menu.add(new JSeparator());

        submenu.add(Big);
        submenu.add(Small);

        menu.add(submenu);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        pane = new JPanel();

        textArea = new JTextArea("");
        textArea.setSize(100,100);
        textArea.setBackground(Color.lightGray);
        pane.add(textArea,BorderLayout.CENTER);
        frame.getContentPane().add(pane,BorderLayout.CENTER);

        MyActionListener actionListener = new MyActionListener();

        New.addActionListener(actionListener);
        Save.addActionListener(actionListener);
        Open.addActionListener(actionListener);
        Big.addActionListener(actionListener);
        Small.addActionListener(actionListener);

        frame.setVisible(true); // show the frame
        frame.setSize(500,500); // set size of the frame
        frame.setLocation(200,150);   // set the position of the frame

    }
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JMenuItem selectedItem = (JMenuItem) event.getSource();
            textArea.append(" " + selectedItem.getText());
        }
    }
    public static void main(String[] args) {
        new Ex3();
    }
}
