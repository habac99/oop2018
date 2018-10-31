package week7.task1;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;

    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public String toString() {
        return left.toString()+ "x" + right.toString();
    }

    @Override
    public int evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }
}
