package Chapter34.ex1;

public enum Option {
    ADD(0, "Dodaj zadanie"),
    TAKE(1, "Zrób kolejne zadanie"),
    EXIT(2, "Wyjście");

    int option;
    String description;

    Option(int option, String description) {
        this.option = option;
        this.description = description;
    }

    static Option createFromInt(int option) {
        return values()[option];
    }

    @Override
    public String toString() {
        return "Option{" +
                "option=" + option +
                ", description='" + description + '\'' +
                '}';
    }
}
