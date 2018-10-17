//package week5_6;
//
//public class Rectangle extends Shape {
//    private double width = 1.0;
//    private double length = 1.0;
//    public Rectangle(){
//
//    }
//    public Rectangle(double _width, double _height, double cX, double cY){
//        this.width= _width;
//        this.length =_height;
//        this.coordX = cX;
//        this.coordX= cY;
//    }
//    public double getWidth(){
//        return this.width;
//    }
//    public double getLength(){
//        return this.length;
//
//    }
//    public void setWidth(double _width){
//        this.width = _width;
//
//
//    }
//    public void setLength(double _length){
//        this.length = _length;
//    }
//
//    /**
//     *
//     * @return toạ độ theo x
//     */
//    @Override
//    public double getCoordX() {
//        return super.getCoordX();
//    }
//
//    /**
//     *
//     * @return toạ độ theo y
//     */
//    @Override
//    public double getCoordY() {
//        return super.getCoordY();
//    }
//
//    /**
//     *
//     * @return vận tốc theo x
//     */
//    @Override
//    public double getVelX() {
//        return super.getVelX();
//    }
//
//    /**
//     *
//     * @return vận tốc theo y
//     */
//
//    @Override
//    public double getVelY() {
//        return super.getVelY();
//    }
//
//    /**
//     *
//     * @param x toạ đọ theo x
//     */
//    @Override
//    public void SetCoordX(double x) {
//        super.SetCoordX(x);
//    }
//
//    /**
//     *
//     * @param y toạ đọ theo y
//     */
//
//    @Override
//    public void SetCoordY(double y) {
//        super.SetCoordY(y);
//    }
//
//    /**
//     *
//     * @param x vận tốc theo x
//     */
//    @Override
//    public void setVelX(double x) {
//        super.setVelX(x);
//    }
//
//    /**
//     *
//     * @param y vận tốc theo y
//     */
//    @Override
//    public void setVelY(double y) {
//        super.setVelY(y);
//    }
//    public void move(){
//        if(this.coordX > 540 || this.coordX < 0){
//            this.velX=-this.velX;
//        }
//        if(this.coordY > 4 || this.coordY < 0){
//            this.velY=-this.velY;
//        }
//        this.coordX += this.getVelX();
//        this.coordY += this.getVelY();
//    }
//}
