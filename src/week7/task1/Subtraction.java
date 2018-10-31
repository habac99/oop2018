package week7.task1;

public class Subtraction extends  BinaryExpression {
    private Expression left;
    private  Expression right;
    public Subtraction(){}
    public Subtraction(Expression ex1, Expression ex2){
        this.left= ex1;
        this.right = ex2;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() +"-"+ right.toString();
    }

    @Override
    public int evaluate() {
        return this.left.evaluate() - this.right.evaluate();
    }
}
