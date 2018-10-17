package week4.task1;

public class HoaQua {
    protected double price;
    protected String importDate;
    protected int amount;

    public void setDate(String date){
        this.importDate = date;

    }

    public String getDate(){
        return importDate;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(Double _price){
        this.price = _price;
    }

    public void setAmount(int _amount){
        this.amount= _amount;

    }
    public int getAmount(){
        return amount;
    }

    public void info(){
        System.out.println("luong nhap la" + this.getAmount() + "Vao ngay" + this.getDate());
    }

}
