import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex4 {
    JFrame frame;
    JPanel pane;
    JLabel label;
    JMenuBar menuBar;
    JMenu menuFile;
    JMenu menuOption;
    JTextArea textArea;
    JButton button;
    JWindow window;
    JPanel windowsPane;
    JTextArea windowsTextArea;
    JScrollPane scroll;
    public Ex4() {
        frame = new JFrame("EXERCISE 4");
        frame.setSize(300, 600);
        pane = new JPanel( new BorderLayout(10, 10));
        label = new JLabel("MAIN FRAME");
        menuBar = new JMenuBar();
        menuFile = new JMenu("FILE");
        menuOption = new JMenu("OPTION");
        menuBar.add(menuFile);
        menuBar.add(menuOption);
        textArea = new JTextArea(20, 20);
        textArea.setLineWrap(true);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        button = new JButton("Send");
        button.addActionListener(new MyActionListener());
        pane.add(label, BorderLayout.NORTH);
        pane.add(scrollableTextArea, BorderLayout.CENTER);
        pane.add(button, BorderLayout.SOUTH);
        window = new JWindow(frame);
        window.setSize(200, 200);
        window.setLocation(400, 0);
        windowsTextArea = new JTextArea(20, 20);
        windowsTextArea.setEditable(false);
        windowsTextArea.setLineWrap(true);
        windowsPane = new JPanel();
        windowsPane.add(windowsTextArea);
        scroll = new JScrollPane(windowsPane);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        window.getContentPane().add(scroll);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(pane,
                BorderLayout.CENTER);
        frame.show();
    }
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            windowsTextArea.setText(textArea.getText());
            window.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Ex4();
    }
}
