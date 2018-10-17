//package week5_6;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Circle extends  JPanel {
//    double radius = 1.0;
//    double PI = Math.PI;
//    double coordX, coordY, velX,velY;
//
//    public Circle() {
//
//    }
//    public Circle(double _radius,double cX, double cY) {
//
//        this.radius = _radius;
//        this.coordX = cX;
//        this.coordY = cY;
//    }
//
//
//    /**
//     *
//     * @return độ dài bán kính
//     */
//    public double getRadius() {
//        return radius;
//
//    }
//
//    /**
//     * hàm trả về bán kính
//     * @param _radius bán kính
//     */
//    public void setRadius(double _radius) {
//        radius = _radius;
//
//
//    }
//
////    /**
////     *
////     * @param y vận tốc theo y
////     */
////    @Override
////    public void setVelY(double y) {
////        super.setVelY(y);
////    }
////
////    /**
////     *
////     * @param x vận tốc theo x
////     */
////    @Override
////    public void setVelX(double x) {
////        super.setVelX(x);
////    }
////
////    /**
////     *
////     * @return toạ độ theo x
////     */
////    @Override
////    public double getCoordX() {
////        return super.getCoordX();
////    }
////
////    /**
////     *
////     * @return toạ độ theo y
////     */
////    @Override
////    public double getCoordY() {
////        return super.getCoordY();
////    }
////
////    /**
////     *
////     * @return vận tốc theo x
////     */
////    @Override
////    public double getVelX() {
////        return super.getVelX();
////    }
////
////    /**
////     *
////     * @return vận tốc theo y
////     */
////    @Override
////    public double getVelY() {
////        return super.getVelY();
////    }
////
////    /**
////     *
////     * @param y toạ đọ theo y
////     */
////    @Override
////    public void SetCoordY(double y) {
////        super.SetCoordY(y);
////    }
////
////    /**
////     *
////     * @param x toạ đọ theo x
////     */
////    @Override
////    public void SetCoordX(double x) {
////        super.SetCoordX(x);
////    }
//    public void move(){
//        if (coordX>  550 || coordX <0){
//            velX = -velX;
//        }
//        if (coordY>  350 || coordY <0){
//            velY = -velY;
//        }
//        coordX+=velX;
//        coordY+=velY;
//    }
//
////    public void paint (Graphics g){
////        super.paint(g);
////        g.setColor(Color.red);
////        g.fillOval(coordX,coordY, 50, 50);
////
////    }
//}
//
//
//
