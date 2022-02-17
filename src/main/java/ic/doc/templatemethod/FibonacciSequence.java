package ic.doc.templatemethod;

// Defines the first two terms to be one, other terms have each term equal to the sum of the
// previous two. Inherits Sequence class.
public class FibonacciSequence extends Sequence {

  // Method which calculates the value of index i in Fibonacci Sequence, for i >= 0
  @Override
  int calculateTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return calculateTerm(i - 1) + calculateTerm(i - 2);
  }
}
