package Chapter11.ex1;

public class MultidimensionalTab {
    public static void main(String[] args) {
        double [][] tab = new double[3][];
        double [] line1 = {1.0, 1.5, 2.0};
        double [] line2 = {1.5, 2.0, 2.5};
        double [] line3 = {2.0, 2.5, 3.0};

        tab [0] = line1;
        tab [1] = line2;
        tab [2] = line3;

        double result = (tab[0][0] * tab[1][1] * tab[2][2]) + (tab[0][2] * tab[1][1] * tab[2][0]);
        System.out.println(result);
        result = (tab[0][1]+tab[1][1]+tab[2][1]) * (tab[1][0]+tab[1][1]+tab[1][2]);
        System.out.println(result);
        result = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];
        System.out.println(result);
    }
}
