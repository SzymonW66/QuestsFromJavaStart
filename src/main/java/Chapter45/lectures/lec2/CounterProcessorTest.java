package Chapter45.lectures.lec2;

import static Chapter45.lectures.lec2.CounterProcessor.COUNTER;

public class CounterProcessorTest {
    public static void main(String[] args) {
        String firstName = "Ala";
        int words = COUNTER."\{firstName} ma kota";
        System.out.println(words); //3
    }
}
