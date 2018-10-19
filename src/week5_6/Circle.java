package week5_6;
/**
 * class Circcle kế thừa Shape
 */

import java.awt.*;
import java.util.Random;

public class Circle extends Shape {
    private int radius;


    /**
     * hàm khởi tạo hình tròn
     */
    public Circle(){
        Random ran = new Random();
        this.radius = ran.nextInt(100);
        this.coord.setX(ran.nextInt(30));
        this.coord.setY(ran.nextInt(30));
        this.vel.setX( ran.nextInt(7));
        this.vel.setY( ran.nextInt(7));
        this.color   = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));


    }

    /**
     *
     * @return độ dài bán kính
     */
    public int getRadius() {
        return radius;
    }

    /**
     *
     * @param radius : độ dài bán kính muốn thiết lập
     */

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * hàm di chuyển
     */
    @Override
    public void move() {
        super.move();
    }
}
