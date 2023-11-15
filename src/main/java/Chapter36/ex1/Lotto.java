package Chapter36.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final int NO_OF_NUMBERS = 49;
    static final int MAX_NUMBERS = 6;

    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> lottoResult;

    Lotto() {
        generate();
        randomize();
    }

    private void randomize() {
        Collections.shuffle(numbers);
        lottoResult = numbers.subList(0, 6);
    }

    private void generate() {
        for (int i = 0; i <= NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    int checkResult(List<Integer> userNumbers) {
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoResult.contains(userNumbers.get(i))) {
                found++;
            }
        }
        return found;
    }
}
