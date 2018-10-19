package week5_6;

import java.awt.*;
import java.util.Random;

/**
 * Class Rectangle kế thừa lớp shape
 */

public class Rectangle extends Shape {
    private int width, length;



    /**
     * khởi tạo hình chữ nhật
     */
    public Rectangle(){
        Random ran= new Random();
        this.length = ran.nextInt(100);
        this.width  = ran.nextInt(80);
        this.coord.setX(ran.nextInt(30));
        this.coord.setY(ran.nextInt(30));
        this.vel.setX( ran.nextInt(7)+1);
        this.vel.setY( ran.nextInt(7)+1);
        this.color   = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));


    }

    /**
     *
     * @return chiều dài
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @return chiều rộng
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @param width chiều rộng muốn đưa vào
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @param length chiều dài muốn đưa vào
     */
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        super.move();
    }
}
