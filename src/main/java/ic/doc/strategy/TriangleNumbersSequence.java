package ic.doc.strategy;

// Defines the first terms to be one, other terms have each term equal to (i+1)(i+2)/2, where i is
// the index of the term in the sequence
public class TriangleNumbersSequence implements SequenceType {

  // Method which calculates the value at each position i in Triangle Numbers Sequence, where i >= 0
  @Override
  public int calculateTermValue(int i) {
    if (i < 1) {
      return 1;
    }
    return (i + 1) * (i + 2) / 2;
  }
}
