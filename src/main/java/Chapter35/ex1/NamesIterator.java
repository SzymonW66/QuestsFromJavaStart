package Chapter35.ex1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();

        people.put("Kowalski", new Person("Jan", "Kowalski", 23));
        people.put("Wajs", new Person("Szymon", "Wajs", 23));
        people.put("Kolega", new Person("Antoni", "Kolega", 60));
        people.put("Kosidlo", new Person("Patrycja", "Kosidlo", 23));

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
     }
}
