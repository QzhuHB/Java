import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//小蝌蚪找妈妈
public class App2 {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel son=new JLabel();
    JLabel mother=new JLabel();
    JTextArea textArea=new JTextArea();
    int zy=64;
    //构造方法
    public App2() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    son.setBounds(son.getX(),son.getY()-zy,60,60);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    son.setBounds(son.getX()-zy,son.getY(),60,60);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    son.setBounds(son.getX()+zy,son.getY(),60,60);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    son.setBounds(son.getX(),son.getY()+zy,60,60);
                }
                if (son.getX()==mother.getX() && son.getY()==mother.getY()){
                    textArea.setBounds(0,300,1024,100);
                    textArea.setText("闯关成功！");
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL1 = App2.class.getResource("img/son.png");
        son.setIcon(new ImageIcon(imgURL1));
        son.setBounds(192,192,64,64);
        myPanel.add(son);

        java.net.URL imgURL2 = App2.class.getResource("img/mother.png");
        mother.setIcon(new ImageIcon(imgURL2));
        mother.setBounds(0,0,64,64);
        myPanel.add(mother);

        textArea.setText("闯关成功！");
        textArea.setBounds(1500,900,1024,100);
        textArea.setBackground(Color.pink);
        textArea.setForeground(Color.yellow);
        textArea.setFont(new Font("",Font.BOLD,30));
        myPanel.add(textArea);

        myPanel.setLayout(null);
        java.net.URL imgURL3 = App.class.getResource("img/background2.png");
        label_background.setIcon(new ImageIcon(imgURL3));
        label_background.setBounds(0,0,1024,768);
        myPanel.add(label_background);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("小蝌蚪找妈妈");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,768);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App2().go();
    }
}
