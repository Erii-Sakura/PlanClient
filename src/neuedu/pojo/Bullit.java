package neuedu.pojo;


import com.neuedu.client.PlanClient;
import com.neuedu.utlis.ImgUtil;

import java.awt.*;

public class Bullit {
    private Image image;
   private int x;
    private int y;
    private int speed;
    private Direction dir;
    private int  width;
    private int  height;
    private PlanClient mxc;
    public boolean live=true;
    public Bullit(int x,int y,Direction dir,PlanClient mxc) {
        this.mxc=mxc;
        this.x=x;
        this.y=y;
        this.speed=30;
        this.dir=dir;
        if (this.dir==Direction.RIGHT){
            this.image= ImgUtil.getImage("zidan");
        }else if (this.dir==Direction.LEFT){
            this.image= ImgUtil.getImage("zidan");
        }else if (this.dir==Direction.UPWARD){
            this.image= ImgUtil.getImage("zidan");
        }else if (this.dir==Direction.DOWN){
            this.image= ImgUtil.getImage("zidan");
        }
        this.width=image.getWidth(null);
        this.height=image.getHeight(null);
    }
    public void draw(Graphics g){
        if(live){
            g.drawImage(this.image,x,y,null);
        }
        movie();
    }


    public void movie(){
        y-=speed;
    }
    //获取子弹图片的矩形
    public Rectangle getRectangle(){
        return new Rectangle(x,y,width,height);
    }

    public boolean hit(BigBoss bigBoss){
        if (this.getRectangle().intersects(bigBoss.getRectangle())){
            this.live=false;
            bigBoss.hp-=7;
            if (bigBoss.hp<=0){
                bigBoss.live=false;
            }
        }
        return false;
    }
    public boolean hit1(Mob1 mob1){
        if (this.getRectangle().intersects(mob1.getRectangle())){
            this.live=false;
            mob1.hp1-=7;
            if (mob1.hp1<=0){
                mob1.live=false;
            }

        }
        return false;
    }
    public boolean hit1_1(Mob1_1 mob1_1){
        if (this.getRectangle().intersects(mob1_1.getRectangle())){
            this.live=false;
            mob1_1.hp1_1-=7;
            if (mob1_1.hp1_1<=0){
                mob1_1.live=false;
            }
        }
        return false;
    }
    public boolean hit2(Mob2 mob2){
        if (this.getRectangle().intersects(mob2.getRectangle())){
            this.live=false;
            mob2.hp2-=7;
            if (mob2.hp2<=0){
                mob2.live=false;
            }
        }
        return false;
    }
    public boolean hit2_1(Mob2_1 mob2_1){
        if (this.getRectangle().intersects(mob2_1.getRectangle())){
            this.live=false;
            mob2_1.hp2_1-=7;
            if (mob2_1.hp2_1<=0){
                mob2_1.live=false;
            }
        }
        return false;
    }
    public boolean hit3(Mob3 mob3){
        if (this.getRectangle().intersects(mob3.getRectangle())){
            this.live=false;
            mob3.hp3-=7;
            if (mob3.hp3<=0){
                mob3.live=false;
            }

        }
        return false;
    }
    public boolean hit3_1(Mob3_1 mob3_1){
        if (this.getRectangle().intersects(mob3_1.getRectangle())){
            this.live=false;
            mob3_1.hp3_1-=7;
            if (mob3_1.hp3_1<=0){
                mob3_1.live=false;
            }

        }
        return false;
    }
    public boolean hit4(Mob4 mob4){
        if (this.getRectangle().intersects(mob4.getRectangle())){
            this.live=false;
            mob4.hp4-=7;
            if (mob4.hp4<=0){
                mob4.live=false;
            }

        }
        return false;
    }
    public boolean hit4_1(Mob4_1 mob4_1){
        if (this.getRectangle().intersects(mob4_1.getRectangle())){
            this.live=false;
            mob4_1.hp4_1-=7;
            if (mob4_1.hp4_1<=0){
                mob4_1.live=false;
            }

        }
        return false;
    }
    public boolean hit5(Mob5 mob5){
        if (this.getRectangle().intersects(mob5.getRectangle())){
            this.live=false;
            mob5.hp5-=7;
            if (mob5.hp5<=0){
                mob5.live=false;
            }

        }
        return false;
    }
    public boolean hit5_1(Mob5_1 mob5_1){
        if (this.getRectangle().intersects(mob5_1.getRectangle())){
            this.live=false;
            mob5_1.hp5_1-=7;
            if (mob5_1.hp5_1<=0){
                mob5_1.live=false;
            }

        }
        return false;
    }
}
