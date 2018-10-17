package week4.task2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double _width, double _height, String _color, boolean _filled){
        this.width= _width;
        this.length =_height;
        this.color = _color;
        this.filled = _filled;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;

    }
    public void setWidth(double _width){
        this.width = _width;


    }
    public void setLength(double _length){
        this.length = _length;
    }
    public double getPerimeter(){
        return 2*(this.length +this.width);

    }
    public double getArea(){
        return this.width * this.length;
    }

    public String toString(){
        return super.toString() +","+this.getLength() + " " + this.getWidth();

    }


}
