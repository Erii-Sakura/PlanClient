package neuedu.pojo;

import com.neuedu.utlis.GameUtil;

import java.awt.*;

public class BackGround {
    /*设置背景图*/
    private Image image;
    private int x;
    private int y;
    public BackGround() {
        this.image = GameUtil.getImg("com/neuedu/imgs/bgimg.png");
        this.x = 0;
        this.y = 0;
    }

    public void draw(Graphics g) {
        g.drawImage(this.image, x, y, null);
    }
}
