package Chapter23.ex2;

abstract class Employee {
    public static final int NO_OF_MONTHS = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return firstName + " " + lastName
                + ", wypłata miesięczna: " + getMonthlySalary()
                + ", wypłata roczna: " + getYearlySalary();
    }

    abstract double getYearlySalary();


    abstract double getMonthlySalary();

}
