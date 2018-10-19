package week5_6;

import java.awt.*;
import java.util.Random;

public  class Shape {
    protected Color color;
    protected Point coord = new Point();
    protected Point vel   = new Point();




    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
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


