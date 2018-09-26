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
        public double Acreage(){
            return (this.length * this.width);
        }
        public double Radius(){
            double D = this.width * this.width + this.length * this.length;
            return D/2;
        }
        public static  void main(String[] args){
            Rectangle R = new Rectangle();
            Rectangle R1 = new Rectangle(4.5, 6.5);
            R.setLength(4.5);
            R.setWidth(3.5);
            System.out.println(R.Perimeter());
            System.out.println(R.Radius());

        }






    }




    class rectangular{
        private
            double height;
            double length;
            double width;
         public rectangular(double h, double l, double w) {
             this.height = h;
             this.length = l;
             this.width  = w;

         }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double getLength() {
            return length;
        }
        public void setHeight(double h){
             this.height = h;

        }
        public void setWidth(double w){
             this.width = w;

        }
        public void setLength(double l){
             this.height = l;
        }

        public double Capacity() {
            return this.height * this.length + this.width;
        }
        public double AroundAcreage(){
             return (2*this.height * (this.width+this.length));
        }
        public double FullAcreage(){
             return this.AroundAcreage() + 4*(this.length + this.width);
        }

        public static void main(String[] args) {
            rectangular R = new rectangular(1,2,2);
            R.setWidth(5);
            R.setHeight(6);
            R.setLength(7);
            System.out.println(R.FullAcreage());
        }

    }
class Teacher {
    private
    int age;
    String name;
    String subject;
   // int DayOfWork;

    // long  salary;
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;

    }

    public String getSubject(){
        return subject;
    }

    public void setAge(int a){
        this.age = a;
    }
    public void setName(String n){
        this.name = n;

    }

    public void Welcome(){
        System.out.println("Welcome to my class");
    }
    public void intro(){
        System.out.println("My name is " + this.name);
    }
    public void goodbye(){
        System.out.println("Good bye, see you again");
    }




}


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
