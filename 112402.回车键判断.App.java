import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    public App() {
        textArea_A.setBounds(100,100,256,50);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.yellow);
        myPanel.add(textArea_B);
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("朱浩杰")||textArea_A.getText().equals("穹碧")){
                        textArea_B.append("正确\n");
                        textArea_A.setText("");
                    }else{
                        textArea_B.append("错误\n");
                        textArea_A.setText("");
                    }

                }
            }
        });
    }
    void go(){
        JFrame frame = new JFrame("我是谁");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
