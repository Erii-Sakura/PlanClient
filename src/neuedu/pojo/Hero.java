package neuedu.pojo;

import com.neuedu.client.PlanClient;
import com.neuedu.utlis.ImgUtil;
import com.neuedu.utlis.MusicUtli;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Hero{
    private int x;
    private int y;
    private int height;
    private int width;
    private Image image;
    private int speed = 10;
    private boolean left, right, upward, down,shoot;
    private Direction dir;
    private PlanClient mxc;
    private boolean live=true;
    public void  outofBind(){
        if (x<0){
            x = 0;
        }
        if (x>Constant.GAME_WIDTH  - width){
            x = Constant.GAME_WIDTH- width;
        }
        if (y<50){
            y=40;
        }
        if (y>Constant.GAMR_HEIGHT - height){
            y=Constant.GAMR_HEIGHT - height;
        }
    }
    public Hero(PlanClient mxc) {
        this.mxc=mxc;
        this.image = ImgUtil.getImage("hero");
        this.height = image.getHeight(null);
        this.width = image.getWidth(null);
        this.x = Constant.GAME_WIDTH /2 - width;
        this.y = Constant.GAMR_HEIGHT - height;
        this.dir = Direction.RIGHT;
    }

    public void draw(Graphics g) {

        if (live){
            if(shoot){
                shoot();
            }
            switch (this.dir) {
                case LEFT:
                    g.drawImage(this.image, x, y, null);
                    break;
                case RIGHT:
                    g.drawImage(this.image, x, y, null);
                    break;
                case UPWARD:
                    g.drawImage(this.image, x, y, null);
                    break;
                case DOWN:
                    g.drawImage(this.image, x, y, null);
                    break;
            }
        }else {

            this.width=0;
            this.height=0;

            DieBackGround   dieBackGround=  new DieBackGround();
            dieBackGround.paint(g);
                }
            }




    public void move() {
        if (right) {
            x += speed;
        } else if (left) {
            x -= speed;
        } else if (upward) {
            y -= speed;
        } else if (down) {
            y += speed;
        }
        outofBind();
    }

    public void keyPress(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_D:
                right = true;
                move();
                break;
            case KeyEvent.VK_A:
                left = true;
                move();
                break;
            case KeyEvent.VK_W:
                upward = true;
                move();
                break;
            case KeyEvent.VK_S:
                down = true;;
                move();
                break;
                case KeyEvent.VK_J:
                    shoot=true;
                    shoot();
                    break;
            case KeyEvent.VK_K:
                shoot=false;
                break;
        }
    }

    public void keyReleas(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_D:
                right = false;
                break;
            case KeyEvent.VK_A:
                left = false;
                break;
            case KeyEvent.VK_W:
                upward = false;
                break;
            case KeyEvent.VK_S:
                down = false;
                break;
            case KeyEvent.VK_K:
                shoot=false;
                break;
        }
    }
    public void shoot(){
        MusicUtli.getMusic("F:\\FeiJiDaZhanJingXiu\\src\\com\\neuedu\\Music\\bullet.wav");
        if (this.dir==Direction.RIGHT){
            Bullit bullit=new Bullit(x+width/2-2,y-50,this.dir,mxc);
            mxc.bullits.add(bullit);
        }else if (this.dir==Direction.LEFT){
            Bullit bullit=new Bullit(x+width/2-2,y-50,this.dir,mxc);
        }else if (this.dir==Direction.UPWARD){
            Bullit bullit=new Bullit(x+width/2-2,y-50,this.dir,mxc);
        }else if (this.dir==Direction.DOWN){
            Bullit bullit=new Bullit(x+width/2-2,y-50,this.dir,mxc);
        }
    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,width,height);
    }
    public boolean die(BigBoss bigBoss){
        if (this.getRectangle().intersects(bigBoss.getRectangle())){
            this.live=false;
            bigBoss.live=true;
        }
        return false;
    }
    public boolean die2(Mob1 mob1){
        if (this.getRectangle().intersects(mob1.getRectangle())){
            this.live=false;
            mob1.live=true;
        }
        return false;
    }
    public boolean die3(Mob1_1 mob1_1){
        if (this.getRectangle().intersects(mob1_1.getRectangle())){
            this.live=false;
            mob1_1.live=true;
        }
        return false;
    }
    public boolean die4(Mob2 mob2){
        if (this.getRectangle().intersects(mob2.getRectangle())){
            this.live=false;
            mob2.live=true;
        }
        return false;
    }
    public boolean die5(Mob2_1 mob2_1){
        if (this.getRectangle().intersects(mob2_1.getRectangle())){
            this.live=false;
            mob2_1.live=true;
        }
        return false;
    }
    public boolean die6(Mob3 mob3){
        if (this.getRectangle().intersects(mob3.getRectangle())){
            this.live=false;
            mob3.live=true;
        }
        return false;
    }
    public boolean die7(Mob3_1 mob3_1){
        if (this.getRectangle().intersects(mob3_1.getRectangle())){
            this.live=false;
            mob3_1.live=true;
        }
        return false;
    }
    public boolean die8(Mob4 mob4){
        if (this.getRectangle().intersects(mob4.getRectangle())){
            this.live=false;
            mob4.live=true;
        }
        return false;
    }
    public boolean die9(Mob4_1 mob4_1){
        if (this.getRectangle().intersects(mob4_1.getRectangle())){
            this.live=false;
            mob4_1.live=true;
        }
        return false;
    }
    public boolean die10(Mob5 mob5){
        if (this.getRectangle().intersects(mob5.getRectangle())){
            this.live=false;
            mob5.live=true;
        }
        return false;
    }
    public boolean die11(Mob5_1 mob5_1){
        if (this.getRectangle().intersects(mob5_1.getRectangle())){
            this.live=false;
            mob5_1.live=true;
        }
        return false;
    }
}

