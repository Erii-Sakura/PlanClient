package neuedu.pojo;

import com.neuedu.utlis.GameUtil;
import com.neuedu.utlis.MusicUtli;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DieBackGround extends Frame {
//    public void loadFrame() {
//        this.setTitle("飞机大战");
//        this.setSize(577, 970);
//        this.setVisible(true);
//        this.setBackground(Color.black);
//        this.setLocationRelativeTo(null);
//        /*窗口监听*/
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                //结束当前窗口（结束当前程序）
//                System.exit(0);
//            }
//        });
//    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(GameUtil.getImg("com/neuedu/imgs/over.png"),170,150,null);
    }

}