package Chapter17;

public class Fruit {
    private int weightInGrams;
    private String type;

    public Fruit(int weightInGrams, String type) {
        this.weightInGrams = weightInGrams;
        this.type = type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String getInfo() {
       return "Ten owoc: " + getType() + getWeightInGrams();
    }


}
