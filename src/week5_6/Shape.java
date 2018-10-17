package week5_6;

/**
 * coordX : toạ đọ theo x
 * coordY : toạ đọ theo y
 * velX   : vận tốc theo x
 * velY   : vận tốc theo y
 */
public class Shape {

     protected double coordX, coordY;
     protected double  velX, velY;


    public Shape() {
    }


    /**
     * hàm đặt toạ độ theo x
     * @param x toạ đọ theo x
     */
    public void SetCoordX(double x){
        coordX = x;
    }

    /**
     * hàm đặt toạ độ theo y
     *  @param y toạ đọ theo y
     */
    public void SetCoordY(double y){
        coordY = y;
    }

    /**
     *
     * @return toạ độ theo x
     */
    public double getCoordX(){
        return  this.coordX;
    }

    /**
     *
     * @return toạ độ theo y
     */
    public double getCoordY(){
        return this.coordY;
    }

    /**
     * hàm đặt vận tốc theo x
     * @param x vận tốc theo x
     */
    public void setVelX(double x){
        velX = x;
    }
    /**
     * hàm đặt vận tốc theo y
     * @param y vận tốc theo y
     */
    public void setVelY(double y){
        velY = y;
    }

    /**
     *
     * @return vận tốc theo x
     */
    public double getVelX(){
        return  this.velX;
    }

    /**
     *
     * @return vận tốc theo y
     */
    public double getVelY(){
        return this.velY;
    }


}

