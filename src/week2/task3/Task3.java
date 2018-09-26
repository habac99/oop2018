package week2.task3;
import java.math.*;
public class Task3 {
}
     class Rectangle{
        private
        double length;
        double width;
        double r ; // bk dg tròn ngoại tiếp
        public double getLength(){return length;}
        public double getWidth(){return width;}

        public Rectangle(double l, double w){
            this.width = w;
            this.length = l;

        }
        public Rectangle(){
            this.width = 0;
            this.length = 0;
        }
        public void setWidth(double w){
            this.width = w;
        }
        public void setLength(double l){
            this.length = l;

        }

        public  double Perimeter(){
            return ((this.length + this.width) *2);

        }
        public double Acreage(Rectangle R){
            return (R.getLength() * R.getWidth());
        }
        public double Radius(Rectangle R){
            double D = R.getWidth() * R.getWidth() + R.getLength() * R.getLength();
            return D/2;
        }
        public static  void main(String[] args){
            Rectangle R = new Rectangle();
            Rectangle R1 = new Rectangle(4.5, 6.5);
            R.setLength(4.5);
            R.setWidth(3.5);
            System.out.println(R.Perimeter());

        }






    }

     class Teacher{
        private
        int age;
        String name;
        String subject;
        int DayOfWork;
        long  salary;
    }


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
