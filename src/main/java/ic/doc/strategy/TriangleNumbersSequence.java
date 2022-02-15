package ic.doc.strategy;

public class TriangleNumbersSequence implements SequenceType {

    @Override
    public int calculateTerm(int i) {
        if (i < 1) {
            return 1;
        }
        return (i + 1) * (i + 2) / 2;
    }

}

