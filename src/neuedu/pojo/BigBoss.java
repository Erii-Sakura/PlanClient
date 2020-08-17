package neuedu.pojo;

import com.neuedu.client.PlanClient;
import com.neuedu.utlis.ImgUtil;

import java.awt.*;

public class BigBoss extends Thread {
    private Image image;
    public int x;
    public int y;
    private double speed =1;
    private int width;
    private int height;
    public boolean live=true;
    private PlanClient mxc;
    public BloodBar bb;
    public long hp=Constant.BIGBOSS_HP;
    public BigBoss(PlanClient mxc) {
        this.mxc=mxc;
        this.x = 0;
        this.y = 0;
        this.image = ImgUtil.getImage("daguaiwu");
        this.width=image.getWidth(null);
        this.height=image.getHeight(null);
        System.out.println(x);
        System.out.println(y);
        this.bb=new BloodBar(this.x,this.y,this.width);

    }

    public void draw(Graphics g) {
        if (live){
            g.drawImage(this.image, x, y, null);
            bb.draw1(g);
        }else {
            this.width=0;
            this.height=0;
        }
        movie();
    }

    public void movie() {
        x+=speed;
        y+=speed;
        if (y>=437) {
            y=400;
            if (x>=577){
                x=(int) Math.round(Math.random() * 500);
                y=0;
            }
        }
    }
    public Rectangle getRectangle(){
        return new Rectangle(x,y,width,height);
    }
    class BloodBar{
        int x1;
        int y1;
        int width1;
        int height1;
        public BloodBar(int x1,int y1,int width1){
            this.x1=10;
            this.y1=40;
            this.width1=500;
            this.height1=10;
        }
        public void draw1(Graphics g){
            g.setColor(Color.red);
            g.drawRect(x1,y1,width1,height1);
            g.setColor(Color.green);
            g.fillRect(x1,y1,width1,height1);
        }
    }
}