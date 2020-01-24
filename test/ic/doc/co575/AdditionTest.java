package ic.doc.co575;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;


public class AdditionTest {

  @Test
  public void evaluate_TwoNumbers() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    int expectedOutput = 7;
    int output = a.evaluate();
    final String errorMsg = String.format("Problem adding two whole numbers: %s", a);
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void evaluate_NestedAdditions() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    Addition b = new Addition(new NaturalNumber(1), new NaturalNumber(5));
    Addition c = new Addition(a, b);

    int expectedOutput = 13;
    int output = c.evaluate();
    final String errorMsg = String.format("Problem adding nested additions: %s", c);
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void compare_Addition() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    Addition b = new Addition(new NaturalNumber(1), new NaturalNumber(5));
    Addition c = new Addition(a, b);
    Addition d = new Addition(c, b);

    int expectedOutput = 1;
    int output = d.compareTo(c);
    final String errorMsg = String.format("Problem comparing additions.");
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void equals_Addition() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    Addition b = new Addition(new NaturalNumber(2), new NaturalNumber(5));

    boolean expectedOutput = true;
    boolean output = a.equals(b);
    final String errorMsg = String.format("Problem checking if additions are equal.");
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }
}
