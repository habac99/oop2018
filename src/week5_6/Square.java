package week5_6;

import java.awt.*;
import java.util.Random;

public class Square extends Rectangle {
    private int size;


    /**
     * khỏi tạo hình vuông
     */
    public  Square(){
        Random ran  = new Random();
        this.size   = ran.nextInt(70);
        this.coord.setX(ran.nextInt(30));
        this.coord.setY(ran.nextInt(30));
        this.vel.setX( ran.nextInt(7));
        this.vel.setY( ran.nextInt(7));
        this.color   = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));

    }

    /**
     *
     * @return độ dài cạnh
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size đọ dài muốn đưa vào
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * di chuyển
     */
    @Override
    public void move() {
        super.move();
    }
}
