package neuedu.pojo;

import com.neuedu.utlis.ImgUtil;

import java.awt.*;

public class Mob1_1 extends Thread {
    private Image image;
    private int x;
    private int y;
    public boolean live=true;
    private int width;
    private int height;
    private double speed =6 +  Math.round(Math.random());
    public BloodBar bb;
    public long hp1_1=Constant.MOB1_1;
    public Mob1_1() {
        this.x = (int) Math.round(Math.random() * 700);
        this.y = -10;
        this.image = ImgUtil.getImage("guaiwu");
        this.width=image.getWidth(null);
        this.height=image.getHeight(null);
        System.out.println(x);
        System.out.println(y);
        this.bb=new BloodBar(this.x,this.y,this.width);
    }

    public void draw(Graphics g) {
        if (live){
            g.drawImage(this.image, x, y, null);
            bb.draw3(g);
        }else {
            this.width=0;
            this.height=0;
        }
        movie();
    }

    public void movie() {
        y += speed;
        if (y>=970){
            y=0;
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
            this.x1=0;
            this.y1=0;
            this.width1=0;
            this.height1=0;
        }
        public void draw3(Graphics g){
            g.setColor(new Color(2,2,2));
            g.drawRect(x1,y1,width1,height1);
            g.setColor(new Color(2,2,2));
            g.fillRect(x1,y1,width1,height1);
        }
    }
}