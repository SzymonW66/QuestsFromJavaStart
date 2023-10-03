package Chapter19.ex1;

import java.util.Objects;

public class Computer {
    private String producer;
    private String model;


    public Computer(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(getProducer(), computer.getProducer()) && Objects.equals(getModel(), computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducer(), getModel());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
