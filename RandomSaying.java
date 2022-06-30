import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomSaying {
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
            int num=random.nextInt(30);
            if(num==1)
                tf.setText("一个人的价值,应该看他贡献什么,而不应当看他取得什么。——爱因斯坦");
            else if(num==2)
                tf.setText("共同的事业,共同的斗争,可以使人们产生忍受一切的力量。——奥斯特洛夫斯基");
            else if(num==3)
                tf.setText("能克服困难的⼈，可使困难化为良机。——丘吉尔");
            else if(num==4)
                tf.setText("纸上得来终觉浅，绝知此事要躬⾏。——陆游");
            else if(num==5)
                tf.setText("千磨万击还坚韧，任尔东南西北风。——郑板桥");
            else if(num==6)
                tf.setText("不经巨大的困难，不会有伟大的事业。——伏尔泰");
            else if(num==7)
                tf.setText("苦难磨炼一些人，也毁灭另一些人。——富勒");
            else if(num==8)
                tf.setText("改变你的想法，你就改变了自己的世界。——文森特·皮尔");
            else if(num==9)
                tf.setText("不要等待，时机永远不会恰到好处。——拿破仑·希尔");
            else if(num==10)
                tf.setText("你相信什么，你就成为什么样的人。——奥普拉·温弗瑞");
            else if(num==11)
                tf.setText("生命不可能有两次，但许多人连一次也不善于度过。——吕凯特");
            else if(num==12)
                tf.setText("人的一生是短的，但如果卑劣地过这一生，就太长了。——莎士比亚");
            else if(num==13)
                tf.setText("我的努力求学没有得到别的好处，只不过是愈来愈发觉自己的无知。——笛卡儿");
            else if(num==14)
                tf.setText("生活的道路一旦选定，就要勇敢地走到底，决不回头。——左拉");
            else if(num==15)
                tf.setText("生命是一条艰险的峡谷，只有勇敢的人才能通过。——米歇潘");
            else if(num==16)
                tf.setText("要么你主宰生活，要么你被生活主宰。——吉姆·罗恩");
            else if(num==17)
                tf.setText("不幸可能成为通向幸福的桥梁。——日本谚语");
            else if(num==18)
                tf.setText("人生就是学校。在那里，与其说好的教师是幸福，不如说好的教师是不幸。——海贝尔");
            else if(num==19)
                tf.setText("今天应做的事没有做，明天再早也是耽误了。——裴斯泰洛齐");
            else if(num==20)
                tf.setText("决定一个人的一生，以及整个命运的，只是一瞬之间。——歌德");
            else if(num==21)
                tf.setText("浪费时间是一桩大罪过。——卢梭");
            else if(num==22)
                tf.setText("既然我已经踏上这条道路，那么，任何东西都不应妨碍我沿着这条路走下去。——康德");
            else if(num==23)
                tf.setText("你活了多少岁不算什么，重要的是你是如何度过这些岁月的。——亚伯拉罕·林肯");
            else if(num==24)
                tf.setText("你热爱生命吗？那么别浪费时间，因为时间是组成生命的材料。——富兰克林");
            else if(num==25)
                tf.setText("书籍把我们引入最美好的社会，使我们认识各个时代的伟大智者。——史美尔斯");
            else if(num==26)
                tf.setText("当一个人用工作去迎接光明，光明很快就会来照耀着他。——冯学峰");
            else if(num==27)
                tf.setText("如果你能做梦，你就能实现它。——吉格·金克拉");
            else if(num==28)
                tf.setText("学问是异常珍贵的东西，从任何源泉吸收都不可耻。——阿卜·日·法拉兹");
            else if(num==29)
                tf.setText("对于不屈不挠的人来勿问成功的秘诀为何，且尽全力做你应该做的事吧。——美华纳说，没有失败这回事。——俾斯麦");
            else if(num==30)
                tf.setText("勿问成功的秘诀为何，且尽全力做你应该做的事吧。——美华纳");
            }

        }

    public static  void main(String[] args){
        new RandomSaying().init();
    }
}
