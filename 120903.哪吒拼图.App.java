import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    int map[][]={
            {1,3,2},
            {4,7,6},
            {9,8,5},
            {11,10,0}
    };
    int cell=128;
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
        java.net.URL imgURL999 = App.class.getResource("img/foreground.png");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,384,512);
        myPanel.add(label_foreground);
        listimg(map);
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                //移动矩阵
                switch(e.getKeyCode())
                {
                    case KeyEvent.VK_UP:
                        new Zero().goDown(map);
                        listimg(map);
                        System.out.println("goUp");
                        break;
                    case KeyEvent.VK_DOWN:
                        new Zero().goUp(map);
                        listimg(map);
                        System.out.println("goDown");
                        break;
                    case KeyEvent.VK_LEFT:
                        new Zero().goRight(map);
                        listimg(map);
                        System.out.println("goLeft");
                        break;
                    case KeyEvent.VK_RIGHT:
                        new Zero().goLeft(map);
                        listimg(map);
                        System.out.println("goRight");
                        break;
                }
            }
        });
    }
    void listimg(int map[][]){
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(map[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
            }
        }
    }
    //显示窗体方法
    void go(){
        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,150,384,530);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);//禁止用户修改大小

    }
    public static void main(String[] args) {
        new App().go();
    }
}
