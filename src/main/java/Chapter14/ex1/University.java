package Chapter14.ex1;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Szymon", "Wajs", 123455);

        System.out.println(Student.getCounter());
        Student student2 = new Student("Szymon1", "Wajs1", 8374593);

        System.out.println(Student.getCounter());
                            //>odniesienie do klasy
    }
}
