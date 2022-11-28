package Chapter6.ex3;

public class Product {
    String name;
    String producer;

    Product (String name,String producer){
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
