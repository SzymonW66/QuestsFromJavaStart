package Chapter22.ex2;

public class Participant {
    private String firstName;
    private String lastName;
    private String documnetId;
    private int age;

    public Participant(String firstName, String lastName, String documnetId, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documnetId = documnetId;
       setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumnetId() {
        return documnetId;
    }

    public void setDocumnetId(String documnetId) {
        this.documnetId = documnetId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Age has to be positive number");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documnetId='" + documnetId + '\'' +
                ", age=" + age +
                '}';
    }
}
