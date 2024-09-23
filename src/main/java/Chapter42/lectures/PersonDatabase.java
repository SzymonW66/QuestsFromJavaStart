package Chapter42.lectures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
    private List<Person> people = new ArrayList<Person>();

    public void add(Person person) {
        if(person == null)
            throw new NullPointerException("Cannot add null reference");
        if(findById(person.getId()) != null)
            throw new IllegalArgumentException("Object with such id already exists");
        people.add(person);
    }

    public void addOptional(Person person) {
        if(person == null)
            throw new NullPointerException("Cannot add null reference");
        if(findByIdOptional(person.getId()).isPresent())
            throw new IllegalArgumentException("Object with such id already exists");
        people.add(person);
    }

    Person findById(int id) {
        for(Person person : people) {
            if(person.getId() == id)
                return person;
        }
        return null;
    }

    Optional<Person> findByIdOptional(int id) {
        for(Person person : people) {
            if(person.getId() == id)
                return Optional.of(person);
        }
       return Optional.empty();
    }
}
