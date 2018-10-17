package week4.task2;

public class Shape {
    String color = "red";
    boolean filled = true;

    public Shape() {
    }

    public Shape(String _color, Boolean _filled) {
        this.filled = _filled;
        this.color = _color;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setColor(String _color) {
        this.color = _color;
    }

    public void setFilled(Boolean _filled) {
        this.filled = _filled;
    }

    public String toString() {
        return this.getColor() + "," + this.isFilled();

    }
}

