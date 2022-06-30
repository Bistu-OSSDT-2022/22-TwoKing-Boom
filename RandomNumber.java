import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumber {
    Frame frame=new Frame("程序：随机一个名人名言");
    TextField tf=new TextField(50);
    Button ok = new Button("立即随机");
    public void init(){
        MyListener myListener=new MyListener();
        ok.addActionListener(myListener);
        frame.add(tf);
        frame.add(ok,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    public class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Random random=new Random();
            int num=random.nextInt(20);
            if(num==1)
                tf.setText("1");
            else if(num==2)
                tf.setText("2");
            else if(num==3)
                tf.setText("3");
            else if(num==4)
                tf.setText("4");
            else if(num==5)
                tf.setText("5");
            else if(num==6)
                tf.setText("6");
            else if(num==7)
                tf.setText("7");
            else if(num==8)
                tf.setText("8");
            else if(num==9)
                tf.setText("9");
            else if(num==10)
                tf.setText("10");
            else if(num==11)
                tf.setText("11");
            else if(num==12)
                tf.setText("12");
            else if(num==13)
                tf.setText("13");
            else if(num==14)
                tf.setText("14");
            else if(num==15)
                tf.setText("15");
            else if(num==16)
                tf.setText("16");
            else if(num==17)
                tf.setText("17");
            else if(num==18)
                tf.setText("18");
            else if(num==19)
                tf.setText("19");
            else if(num==20)
                tf.setText("20");
            }

        }

    public static  void main(String[] args){
        new RandomNumber().init();
    }
}
