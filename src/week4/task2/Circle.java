package week4.task2;

public class Circle extends Shape {
    double radius = 1.0;
    double PI = Math.PI;

    public Circle() {

    }

    public Circle(double _radius) {
        this.radius = _radius;
    }

    public Circle(double _radius, String _color, boolean _filled) {
        this.radius = _radius;
        this.color = _color;
        this.filled = _filled;
    }

    public double getRadius() {
        return radius;

    }

    public void setRadius(double _radius) {
        radius = _radius;


    }

    public double getArea() {
        return radius * radius * PI;

    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }

   public String toString(){
       return super.toString() +","+this.getRadius();
   };
}
