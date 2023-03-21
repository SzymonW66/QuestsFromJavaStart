package Chapter16.ex1;

public class Part {
   private int id;
   private String producer;
   private String model;
   private String serial;

    public Part(int id, String producer, String model, String serial) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
