package Chapter20.ex1;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSouce;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSouce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSouce = tomatoSouce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tomatoSouce=" + tomatoSouce +
                ", cheese=" + cheese +
                ", mushrooms=" + mushrooms +
                ", ham=" + ham +
                '}';
    }


}
