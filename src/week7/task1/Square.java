package week7.task1;

public class Square extends Expression {

    private  Expression expression;

    public Square(){}
    public Square(Expression ex){
        this.expression = ex;
    }
    @Override
    public String toString() {
        return String.valueOf(this.expression) + "^2";
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate()*this.expression.evaluate();
    }
}
