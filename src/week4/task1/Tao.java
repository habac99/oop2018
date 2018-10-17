package week4.task1;

public class Tao extends HoaQua {
    private double weight;
    private String origin;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setOrigin(String _origin){
        this.origin = _origin;
    }
    public String getOrigin(){
        return this.origin;
    }

    public void origin(){
        System.out.println("Duoc nhap tu" + this.getOrigin());
    }
    public void Weight(){
        System.out.print("Khoi luon nhap la " + this.getWeight());
    }

}
