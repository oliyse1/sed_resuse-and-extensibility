package ic.doc.templatemethod;

import java.util.Iterator;

// Abstract class which represents a sequence of integers which can be iterated through
public abstract class Sequence implements Iterable<Integer> {

  // Method to calculate the value at each position i in sequence, calls calculateTerm
  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    return calculateTerm(i);
  }

  // Implemented in derived classes
  abstract int calculateTerm(int i);

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
