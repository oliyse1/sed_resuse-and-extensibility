package ic.doc.templatemethod;

public class TriangleNumbersSequence extends Sequence {

    @Override
    int calculateTerm(int i) {
        if (i < 1) {
            return 1;
        }
        return (i + 1) * (i + 2) / 2;
    }

}

