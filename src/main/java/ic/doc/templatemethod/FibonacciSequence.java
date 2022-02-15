package ic.doc.templatemethod;

public class FibonacciSequence extends Sequence {

    @Override
    int calculateTerm(int i) {
      if (i < 2) {
        return 1;
      }
      return term(i - 1) + term(i - 2);
    }

}
