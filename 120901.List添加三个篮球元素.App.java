import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
        label_list.add(new JLabel());
        label_list.add(new JLabel());
        label_list.add(new JLabel());
        java.net.URL imgURL1 = App.class.getResource("img/ball.png");
        label_list.get(0).setIcon(new ImageIcon(imgURL1));
        label_list.get(0).setBounds(100,0,100,80);
        label_list.get(1).setIcon(new ImageIcon(imgURL1));
        label_list.get(1).setBounds(100,100,100,80);
        label_list.get(2).setIcon(new ImageIcon(imgURL1));
        label_list.get(2).setBounds(100,200,100,80);
        for (int i = 0; i < label_list.size(); i++) {
            myPanel.add(label_list.get(i));
            System.out.println(label_list.size());
        }
    }
    void go(){
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new App().go();
    }
}
