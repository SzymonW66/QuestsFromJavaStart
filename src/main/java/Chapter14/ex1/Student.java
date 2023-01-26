package Chapter14.ex1;

public class Student {
    private String name;
    private String lastName;
    private int index;
    private static int counter = 0;

    public Student(String name, String lastName, int index) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getCounter() {
        return counter;
    }

}
