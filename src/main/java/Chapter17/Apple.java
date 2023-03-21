package Chapter17;

public class Apple extends Fruit {
    private String variety;
    public static final String TYPE = "jabłkowaty";

    public Apple(int weightInGrams, String variety) {
        super(weightInGrams, TYPE);
        this.variety = variety;

    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + variety;
    }
}
