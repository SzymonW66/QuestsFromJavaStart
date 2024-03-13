package Chapter38.lectures.lec2;
@FunctionalInterface
public interface PersonSupplier {
    Person get(String[]fn , String[] ln, int[] a);
}
