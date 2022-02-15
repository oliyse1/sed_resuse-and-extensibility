package ic.doc.strategy;

public class FibonacciSequence implements SequenceType {

  @Override
  public int calculateTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return calculateTerm(i - 1) + calculateTerm(i - 2);
  }

}
