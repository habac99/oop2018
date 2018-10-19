package week5_6;

import java.awt.*;
import java.util.Random;

public  class Shape {
    protected Color color;
    protected Point coord = new Point();
    protected Point vel   = new Point();


    /**
     *
     * @return trả về màu
     */
    public Color getColor() {
        return color;
    }

    /**
     * đặt màu
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * di chuyển hình ảnh
     */
    public  void move(){
        if(coord.getX()<0 || coord.getX() > 500){
            vel.setX(-vel.getX());
        }
        if(coord.getY()<0 || coord.getY() > 500){
            vel.setY(-vel.getY());
        }
        coord.setX(coord.getX() + vel.getX());
        coord.setY(coord.getY() + vel.getY());
    }









}


