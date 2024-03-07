package Chapter37.lectures.lec2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PersonsOperator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joanna", "Dark", 30));
        people.add(new Person("Szymon", "Wajs", 25));
        people.add(new Person("Grzegorz", "Misiak", 55));
        people.add(new Person("Szymon", "Grzesik", 22));
        people.add(new Person("Patryk", "Nowak", 13));

        System.out.println(">>>>>> People");
        printList(people);

        //teraz chcemy zwiększyść wiek osób o 1
        for (Person person : people) {
            person.setAge(person.getAge() + 1);
        }

        System.out.println(">>>>>>>> People age + 1");
        printList(people);
        System.out.println("Moje rozwiązanie: ");
        consumeList(people);
        System.out.println("Rozwiązanie z kursu");
        consumeList1(people, (Person p) -> System.out.println(p));
        System.out.println("Kolene zadanie: Wypisz dorosłych ludzi");
        List<Person> adultPeople = filteredPeople(people);
        printList(adultPeople);
        System.out.println("Kolejne zadanie: odfiltrowanie imion Szymon");
        List<Person> szymonPeople = filterSzymonPeople(people);
        printList(szymonPeople);

    }

    private static List<Person> filterSzymonPeople(List<Person> people) {
        List<Person> szymonList = new ArrayList<>();
        for (Person person : people) {
            if(person.getFirstName().equals("Szymon")){
                szymonList.add(person);
            }
        }
        return szymonList;
    }

    private static List<Person> filteredPeople(List<Person> people) {
        List<Person> adultPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= 18) {
                adultPeople.add(person);
            }
        }
        return adultPeople;
    }

    public static void printList(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    //To jest mój pomysł
    public static void consumeList(List<Person> people) {
        people.forEach(person -> System.out.println(person));
    }

    //Pomysł z kursu
    private static <T> void consumeList1(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}
