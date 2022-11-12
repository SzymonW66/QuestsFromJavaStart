package Chapter4;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Simon";
        employee1.surname = "Waks";
        employee1.birthYear = 2000;
        employee1.seniority = 3;

        System.out.println(employee1.toString());

        employee2.name = "John";
        employee2.surname = "Kennedy";
        employee2.birthYear = 1969;
        employee2.seniority = 10;

        System.out.println(employee2.toString());

        employee3.name = "Mark";
        employee3.surname = "Cukierberg";
        employee3.birthYear = 1899;
        employee3.seniority = 50;

        System.out.println(employee3.toString());
    }
}
