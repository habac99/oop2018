package week4.task1;

public class Main {
    public static void main(String[] a){
        HoaQua hq = new HoaQua();
        Tao T = new Tao();
        Cam C1 = new Cam();
        CamThanhPhong C2 = new CamThanhPhong();
        CamSanh C3 = new CamSanh();
        hq.setAmount(100);
        hq.setDate("23/11/2018");
        T.setWeight(12.4);
        T.setOrigin("Viet Nam");
        C1.setKind("fhf");
        C1.setOrigin("Viet nam");
        C2.setQuantity(123.5);
        C3.setStatus("Tuoi");
        hq.info();
        T.Weight();
        C1.info();
        C2.info();
        C3.getStatus();


    }
}
