package neuedu.utlis;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    /*读取图片*/
    public static Image getImg(String imgPth) {
        URL url = GameUtil.class.getClassLoader().getResource(imgPth);
        BufferedImage image = null;
        try {
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}