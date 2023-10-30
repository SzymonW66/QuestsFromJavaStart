package Chapter24.ex1;

public class ArraySorter {
    public static void main(String[] args) {
        Sortable sortable = new Sortable() {
            @Override
            public void sort(int[] tab) {
                for (int i = 0 ; i < tab.length; i++){
                    for (int j = 0; j < tab.length - i; j ++) {
                        if(tab[j-1] > tab[j]){
                            int temp = tab[j];
                            tab[j] = tab[j -1];
                        }
                    }
                }
            }
        };
        int[] tab = {10, 9, 8, 1, 2, 3, 6, 5, 4, 7};
        printArray(tab);
        sortable.sort(tab);
        printArray(tab);

    }

    private static void printArray(int[]array){
        for(int value: array) {
            System.out.println(value + "");
        }
        System.out.println();
    }

    private interface Sortable {
        void sort(int [] array);
    }
}
