package Chapter28.ex1;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Ania", 11);
        Pair<Integer, String> pair2 = new Pair<>(16, "Tomek");
        Pair<Integer, Integer> pair3 = new Pair<>(11, 12);


        printPair(pair1);
        printPair(pair2);
        printPair(pair3);
    }


    static <T, V> void printPair(Pair<T, V> pair){
        System.out.println("<" + pair.getT() + "," + pair.getV() + ">");
    }
}
