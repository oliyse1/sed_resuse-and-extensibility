package ic.doc.strategy;

import java.util.Iterator;

// A sequence of integers which can be iterated through
public class Sequence implements Iterable<Integer> {

  private SequenceType sequenceType;

  // Object with interface SequenceType is passed into the constructor
  public Sequence(SequenceType sequenceType) {
    this.sequenceType = sequenceType;
  }

  // Method to calculate the value at each position i in sequence, calls sequence.calculateTermValue
  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    return sequenceType.calculateTermValue(i);
  }

  public Iterator<Integer> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      return term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }
}
