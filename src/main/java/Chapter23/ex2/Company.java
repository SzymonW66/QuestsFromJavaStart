package Chapter23.ex2;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = createEmployess();
        double totalMonthSalaries = totalMonthlySalaries(employees);
        double totalYearlySalaries = totalYearlySalaries(employees);

        printEmployess(employees);
        System.out.println("Suma miesicznych wynagrodzeń " + totalMonthSalaries);
        System.out.println("Suma rocznych wynagrodzeń " + totalYearlySalaries);
    }

    private static Employee[] createEmployess() {
        Employee [] employees = new Employee[2];
        employees [0] = new FullTimeEmployee("Jan", "Kowalski", 5000);
        employees [1] = new PartTimeEmployee("Anna", "Borowska", 10, 80);
        return employees;
    }

    private static double totalYearlySalaries(Employee[] employees) {
        double totalYearlySalaries = 0;
        for (Employee employee : employees) {
            totalYearlySalaries += employee.getYearlySalary();
        }
        return totalYearlySalaries;
    }

    private static double totalMonthlySalaries(Employee[] employees) {
        double totalMonthlySalaries = 0;
        for (Employee employee : employees) {
            totalMonthlySalaries += employee.getMonthlySalary();
        }
        return totalMonthlySalaries;
    }


    private static void printEmployess(Employee[] employees) {
        System.out.println("Pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
