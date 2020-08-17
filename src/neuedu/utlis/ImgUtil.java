package neuedu.utlis;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImgUtil {
    public static   final Map<String, Image> maps=new HashMap<>();
    static {
        //英雄机
        maps.put("hero",GameUtil.getImg("com/neuedu/imgs/hero/hero0.png"));
        maps.put("zidan",GameUtil.getImg("com/neuedu/imgs/hero/zidan1-1.png"));
        //怪物1
        maps.put("guaiwu",GameUtil.getImg("com/neuedu/imgs/boss.png"));
        //怪物2
        maps.put("guaiwu2",GameUtil.getImg("com/neuedu/imgs/boss2.png"));
        //怪物3
        maps.put("guaiwu3",GameUtil.getImg("com/neuedu/imgs/boss3.png"));
        //怪物4
        maps.put("guaiwu4",GameUtil.getImg("com/neuedu/imgs/boss4.png"));
        //怪物5
        maps.put("guaiwu5",GameUtil.getImg("com/neuedu/imgs/boss5.png"));
        //大怪物
        maps.put("daguaiwu",GameUtil.getImg("com/neuedu/imgs/BigBoss1.png"));
        //死怪物
        maps.put("siguaiwu",GameUtil.getImg("com/neuedu/imgs/die/die0.png"));
    }
    public static Image getImage(String key){
        return maps.get(key);
    }
}
