package Chapter29.ex1;

public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.addPerson(new Person("Ania", "Kowalińska", "123456"));
        personDatabase.addPerson(new Person("Szymon", "Wajs", "54321"));
        personDatabase.addPerson(new Person("Adam", "Paitek", "94949494949"));
        Person person = personDatabase.get(1);
        System.out.println(person);
        System.out.println(personDatabase);
        personDatabase.removePerson(person);
        System.out.println(personDatabase);
    }
}
