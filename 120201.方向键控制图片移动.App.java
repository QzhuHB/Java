import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//飞机
public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_plane=new JLabel();
    int zy=10;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-zy,128,128);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    label_plane.setBounds(label_plane.getX()-zy,label_plane.getY(),128,128);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    label_plane.setBounds(label_plane.getX()+zy,label_plane.getY(),128,128);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+zy,128,128);
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        myPanel.setLayout(null);
        java.net.URL imgURL1 = App.class.getResource("img/plane.png");
        label_plane.setIcon(new ImageIcon(imgURL1));
        label_plane.setBounds(190,500,128,128);
        myPanel.add(label_plane);

        myPanel.setLayout(null);
        java.net.URL imgURL2 = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL2));
        label_background.setBounds(0,0,512,720);
        myPanel.add(label_background);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("飞机");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
