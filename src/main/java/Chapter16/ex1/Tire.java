package Chapter16.ex1;

public class Tire extends Part {
    private int size;
    private int width;

    public Tire(int id, String producer, String model, String serial, int size, int width) {
        super(id, producer, model, serial);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                ", width=" + width +
                '}';
    }
}
