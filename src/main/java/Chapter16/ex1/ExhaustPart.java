package Chapter16.ex1;

public class ExhaustPart extends Part {
    private boolean isEURO5;

    public ExhaustPart(int id, String producer, String model, String serial, boolean isEURO5) {
        super(id, producer, model, serial);
        this.isEURO5 = isEURO5;
    }

    public boolean isEURO5() {
        return isEURO5;
    }

    public void setEURO5(boolean EURO5) {
        isEURO5 = EURO5;
    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "isEURO5=" + isEURO5 +
                '}';
    }
}
