package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
        private int numer;
        private int denom;
        public int  getNum(){
            return numer;
        }
        public int  getDen(){
            return denom;
        }
        public void setNum(int num){
            numer = num;


        }
        public void setDen(int den){
            denom = den;

        }

        public Fraction(){};



    public Fraction(int numerator, int denominator) {
        this.numer = numerator;
        this.denom = denominator;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public Fraction simplify(Fraction F){
        int a = Math.abs(F.numer);
        int b = Math.abs(F.denom);
        while(a!=b)
        {
            if (a>b ) a=a-b;
            else b=b-a;

        }

        F.numer = F.numer/a;
        F.denom = F.denom/a;
        return F;
    }


    public Fraction add(Fraction other) {
            Fraction result = new Fraction();
            result.numer = this.numer * other.denom + this.denom * other.numer;
            result.denom = this.denom * other.denom;
            return result;

        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        //return null;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction();
        result.numer = this.numer * other.denom - this.denom * other.numer;
        result.denom = this.denom * other.denom;
        return result.simplify(result);
        //return result;

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

        Fraction result = new Fraction();
        result.numer = this.numer * other.numer;
        result.denom = this.denom * other.denom;
        return result.simplify(result);

    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới

        Fraction result = new Fraction();
        result.numer = this.numer * other.denom;
        result.denom = this.denom * other.numer;
        return result.simplify(result);

    }

    public boolean equals(Object Obj)
    {
        if(Obj == null) return false;
        if(!( Obj instanceof Fraction)) return false;
        return true;

    }

    public  void Print(Fraction F){
            System.out.println(F.numer + " / " + F.denom);
    }

    public static void main(String[] args){
             Fraction a,b;
             Fraction F = new Fraction();
             a = new Fraction(2,3);
             b = new Fraction(4,8);
             //F.Print(a.add(b));
             //F.Print(a.subtract(b));
            // F.Print(a.multiply(b));
             F.Print(a.divide(b));

    }
}
