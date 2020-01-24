package ic.doc.co575;

public abstract class BinaryExpression implements Expression {

  @Override
  public abstract int evaluate();

  @Override
  public abstract int depth();

  @Override
  public abstract String toString();

  @Override
  public int compareTo(Expression other) {

    if (this.evaluate() > other.evaluate()) {
      return 1;
    } else if (this.evaluate() < other.evaluate()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public boolean equals(Object other) {
    if (this.evaluate() == ((Expression) other).evaluate()) {
      return true;
    } else
      return false;
  }

}
