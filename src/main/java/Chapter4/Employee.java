package Chapter4;

public class Employee {
    String name;
    String surname;
    int birthYear;
    int seniority;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", seniority=" + seniority +
                '}';
    }
}
