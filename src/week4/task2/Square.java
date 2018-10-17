package week4.task2;

public class Square extends Rectangle {
    private double side = 1.0;
    public Square(){

    }
    public Square (double _side){
        this.side = _side;

    }
    public Square(double _side, String _color, boolean _filled){
        this.side = _side;
        this.color = _color;
        this.filled= _filled;
    }

    public double getSide()
    {
        return this.side;

    }
    public void setSide(double _side){
        this.side = side;

    }

    public String toString(){
        return this.getColor() +","+this.isFilled()+","+ this.side;
    }
}
