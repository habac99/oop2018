package week4.task1;

/**
 * class Camthanhphong ke thua tu class cam
 * Quantity : san luong
 */

public class CamThanhPhong extends Cam {

    private double      Quantity;

    public void setQuantity(double _Quantity){
        this.Quantity = _Quantity;
    }
    public Double getQuantity(){
        return this.Quantity;
    }

    public void info(){
        System.out.println("San luon la" + this.getQuantity());

    }



}
