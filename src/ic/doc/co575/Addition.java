package ic.doc.co575;

public class Addition extends BinaryExpression {

  private final Expression leftExpression;
  private final Expression rightExpression;

  public Addition(Expression left, Expression right) {
    leftExpression = left;
    rightExpression = right;
  }

  @Override
  public int evaluate() {
    return this.getLeft().evaluate() + this.getRight().evaluate();
  }

  @Override
  public int depth() {
    return this.getLeft().depth() + this.getRight().depth() + 1;
  }

  @Override
  public String toString() {
    return "(" + this.getRight().toString() + "+" + this.getLeft().toString() + ")";
  }

  public Expression getLeft() {
    return leftExpression;
  }

  public Expression getRight() {
    return rightExpression;
  }

}