package ic.doc.strategy;

// Defines the first two terms to be one, other terms have each term equal to the sum of the
// previous two
public class FibonacciSequence implements SequenceType {

  // Method which calculates the value of position i in Fibonacci Sequence, for i >= 0
  @Override
  public int calculateTermValue(int i) {
    if (i < 2) {
      return 1;
    }
    return calculateTermValue(i - 1) + calculateTermValue(i - 2);
  }
}
