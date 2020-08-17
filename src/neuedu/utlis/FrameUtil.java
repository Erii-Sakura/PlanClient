package neuedu.utlis;

import com.neuedu.pojo.Constant;

import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameUtil extends Frame{
    public void loadFrame() {
        this.setTitle("飞机大战");
        this.setSize(577, 970);
        this.setVisible(true);
        this.setBackground(Color.black);
        this.setLocationRelativeTo(null);
        /*窗口监听*/
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //结束当前窗口（结束当前程序）
                System.exit(0);
            }
        });
        new MyThread().start();

    }

    // 解决图片闪烁的问题，用双缓冲方法解决闪烁问题
    Image backImg = null;

    // 重写update()方法，在窗口的里层添加一个虚拟的图片
    @Override
    public void update(Graphics g) {
        if (backImg == null) {
            // 如果虚拟图片不存在，创建一个和窗口一样大小的图片
            backImg = createImage(Constant.GAME_WIDTH, Constant.GAMR_HEIGHT);
        }
        // 获取到虚拟图片的画笔
        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.WHITE);
        backg.fillRect(0, 0, Constant.GAME_WIDTH, Constant.GAME_WIDTH);
        backg.setColor(c);
        // 调用虚拟图片的paint()方法，每50ms刷新一次
        paint(backg);
        g.drawImage(backImg, 0, 0, null);
    }
    /*多线程*/
    class MyThread extends Thread {
        @Override
        public void run() {
            for (; ; ) {
                repaint();
                /*时间延迟*/
                try {
                    Thread.sleep(70);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
