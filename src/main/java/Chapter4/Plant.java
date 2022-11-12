package Chapter4;

public class Plant {
    String name;
    String description;
    int waterUsage;

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", waterUsage=" + waterUsage +
                '}';
    }
}
