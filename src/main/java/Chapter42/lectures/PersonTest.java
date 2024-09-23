package Chapter42.lectures;

import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Jan", "Kowalski"));
        db.add(new Person(3, "Jan", "Kowalski"));

        Person person1 = db.findById(1);
        System.out.println(person1.getFirstName());

        Person person2 = db.findById(22);
        System.out.println(person2.getFirstName());
        //NULL POINTER EXCEPTION
        //1
        try {
            System.out.println(person2.getLastName());
        } catch (NullPointerException e){
            System.err.println("Pusta referencja");
        }

        //2
        if(person2 != null){
            System.out.println(person2.getFirstName());
        }
        else
            System.out.println("Brak osoby o id 55");

        //3 OPTIONAL
        Optional<Object> empty = Optional.empty();
        Optional.of(new Person(11, "Jan", "Kowalski"));
        Optional.ofNullable(person2);


        Optional<Person> personOptional = db.findByIdOptional(2);
        if(personOptional.isPresent())
            System.out.println(personOptional.get().getLastName());


        Optional<Person> personOptional2 = db.findByIdOptional(2);
        personOptional2.ifPresent(south -> System.out.println(south.getFirstName()));

    }
}
