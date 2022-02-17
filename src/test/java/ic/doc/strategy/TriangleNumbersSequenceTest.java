package ic.doc.strategy;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TriangleNumbersSequenceTest {

  final TriangleNumbersSequence triangleNumbersSequence = new TriangleNumbersSequence();
  final Sequence sequence = new Sequence(triangleNumbersSequence);

  // Test to check that the first term of the sequence has value 1
  @Test
  public void definesFirstTermToBeOne() {

    assertThat(sequence.term(0), is(1));
  }

  // Test to check that for terms other than the first terms, other terms have each term equal to
  // (i+1)(i+2)/2, where i is the index of the term in the sequence
  @Test
  public void definesSubsequentTermsToBeAsRequired() {
    assertThat(sequence.term(1), is(3));
    assertThat(sequence.term(2), is(6));
    assertThat(sequence.term(3), is(10));
    assertThat(sequence.term(4), is(15));
  }

  // Test to check that the sequence is undefined for negative terms
  @Test
  public void isUndefinedForNegativeIndices() {

    try {
      sequence.term(-1);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
    }
  }

  // Test to check that the sequence can be iterated through
  @Test
  public void canBeIteratedThrough() {
    assertThat(sequence, beginsWith(1, 3, 6, 10, 15));
  }
}
