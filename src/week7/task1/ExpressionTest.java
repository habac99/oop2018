package week7.task1;

public class ExpressionTest {
    public static void main(String[] ag){
        Numeral ten = new Numeral(10);
        Numeral one = new Numeral(1);
        Numeral two = new Numeral(2);
        Numeral three = new Numeral(3);
        Square sq = new Square(ten);
        Subtraction sub = new Subtraction(sq,one);
        Multiplication mul  = new Multiplication(two, three);
        Addition add = new Addition(sub, mul);
        Square sq2 = new Square(add);
        System.out.println(sq2.evaluate());

        try{
            int a = 45/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}
