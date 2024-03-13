package Chapter38.ex2;

public enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    boolean checkForEmployeeEmployment(Employee employee){
        return this == employee.getEmployment();
    }
}
