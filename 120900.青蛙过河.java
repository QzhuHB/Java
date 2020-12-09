import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_frog1=new JLabel();
    JLabel label_score=new JLabel();
    JTextArea textArea_UserInput=new JTextArea();
    JLabel label_frog2=new JLabel();
    JLabel label_frog3=new JLabel();
    int  score=0;
    int scorc1=0;
    int SY=3;
    int num=1;
    int sp=0;

    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                JLabel label=num==1?label_frog1:num==2?label_frog2:label_frog3;
                textArea_UserInput.append(String.valueOf(e.getKeyChar()));
                if (textArea_UserInput.getText().contains("hello") && sp==0 ) {
                    label.setBounds(450, 250, 128, 128);
                    score++;
                    textArea_UserInput.setText("");
                    scorc1+=1;
                    label_score.setText("得分："+scorc1);
                    sp=1;
                }
                if(score==1){
                    if (textArea_UserInput.getText().contains("world")&&sp==1) {
                        label.setBounds(250, 80, 128, 128);
                        score++;
                        textArea_UserInput.setText("");
                        scorc1+=1;
                        label_score.setText("得分："+scorc1);
                        sp=2;
                    }
                }
                if (score==2){
                    if (textArea_UserInput.getText().contains("hi")&&sp==2) {
                        if (num==1){
                            label.setBounds(800, 0, 128, 128);
                        }else if (num==2){
                            label.setBounds(750, 0, 128, 128);
                        }else{
                            label.setBounds(700, 0, 128, 128);
                        }
                        score++;
                        textArea_UserInput.setText("");
                        scorc1+=1;
                        label_score.setText("得分："+scorc1);
                        num++;
                        sp=0;
                        SY--;
                    }
                }
                if (score==3){
                    label_score.setText("得分："+scorc1);
                    score=0;
                }
                if (SY==0){
                    label_score.setText("得分："+scorc1+"！你赢了");
                }
            }
        });
    }
    void go(){
        textArea_UserInput.setText("");
        textArea_UserInput.setBounds(0,0,300,50);
        myPanel.add(textArea_UserInput);
        java.net.URL imgURL = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1024,600);
        textArea_UserInput.setVisible(false);
        java.net.URL imgURL2 = App.class.getResource("img/frog.png");
        label_frog1.setIcon(new ImageIcon(imgURL2));
        java.net.URL imgURL3 = App.class.getResource("img/frog.png");
        label_frog2.setIcon(new ImageIcon(imgURL3));
        java.net.URL imgURL4 = App.class.getResource("img/frog.png");
        label_frog3.setIcon(new ImageIcon(imgURL4));
        label_frog1.setBounds(0,430,128,128);
        label_frog2.setBounds(0,430,128,128);
        label_frog3.setBounds(0,430,128,128);
        label_score.setFont(new Font("黑体",Font.BOLD,18));
        label_score.setText("得分："+scorc1);
        label_score.setBounds(0,0,200,50);
        myPanel.add(label_score);
        myPanel.add(label_frog1);
        myPanel.add(label_frog2);
        myPanel.add(label_frog3);
        myPanel.add(label_background);
        JFrame frame = new JFrame("青蛙过河");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,600);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
