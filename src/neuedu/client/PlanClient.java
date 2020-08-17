package neuedu.client;

import com.neuedu.pojo.*;

import com.neuedu.utlis.FrameUtil;
import com.neuedu.utlis.MusicUtli;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class PlanClient extends FrameUtil {
    private BackGround backGround = new BackGround();
    private Hero hero = new Hero(this);
    private Mob1 mob=new Mob1();
    private Mob1_1 mob1_1=new Mob1_1();
    private Mob2 mob2=new Mob2();
    private Mob2_1 mob2_1=new Mob2_1();
    private Mob3 mob3=new Mob3();
    private Mob3_1 mob3_1=new Mob3_1();
    private Mob4 mob4=new Mob4();
    private Mob4_1 mob4_1=new Mob4_1();
    private Mob5 mob5=new Mob5();
    private Mob5_1 mob5_1=new Mob5_1();
    private  BigBoss bigBoss=new BigBoss(this);
    public List<BigBoss> bigBossss=new ArrayList<>();
    /*多个子弹*/
    public List<Bullit> bullits=new ArrayList<>();
    /*加载一个窗口*/
    public void loadFrame() {

//        MusicUtli.getMusic("F:\\FeiJiDaZhanJingXiu\\src\\com\\neuedu\\Music\\gameover.wav");
        super.loadFrame();
        /*键盘监听事件*/
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                hero.keyPress(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                hero.keyReleas(e);
            }
        });
    }


    @Override
    public void paint(Graphics g) {
        backGround.draw(g);
        hero.draw(g);
        hero.die(bigBoss);
        hero.die2(mob);
        hero.die3(mob1_1);
        hero.die4(mob2);
        hero.die5(mob2_1);
        hero.die6(mob3);
        hero.die7(mob3_1);
        hero.die8(mob4);
        hero.die9(mob4_1);
        hero.die10(mob5);
        hero.die11(mob5_1);
        mob.draw(g);
        mob2.draw(g);
        mob3.draw(g);
        mob4.draw(g);
        mob5.draw(g);
        mob1_1.draw(g);
        mob2_1.draw(g);
        mob3_1.draw(g);
        mob4_1.draw(g);
        mob5_1.draw(g);
        bigBoss.draw(g);
       for (int i=0;i<bullits.size();i++){
          Bullit bullit =bullits.get(i);
           bullit.draw(g);
           bullit.hit(bigBoss);
           bullit.hit1(mob);
           bullit.hit1_1(mob1_1);
           bullit.hit2(mob2);
           bullit.hit2_1(mob2_1);
           bullit.hit3(mob3);
           bullit.hit3_1(mob3_1);
           bullit.hit4(mob4);
           bullit.hit4_1(mob4_1);
           bullit.hit5(mob5);
           bullit.hit5_1(mob5_1);
       }
    }

    public static void main(String[] args) {
        new PlanClient().loadFrame();
    }
}
