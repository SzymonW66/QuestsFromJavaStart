package Chapter13.ex2;

public class Patient {
    private String name;
    private String lastName;
    private String pesel;

    public Patient(String name, String lastName, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
