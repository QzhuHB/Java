package pac;

import javax.swing.*;

public class App {
    private JPanel mainPanel;
    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,200,600,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
