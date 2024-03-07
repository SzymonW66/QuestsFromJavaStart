package Chapter37.lectures.lec1;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {

    //f(x) = x*x;
    //f(2) = 4;
    //(int x) -> x*x;
    //(int x) -> return x*x;
    //x -> x*x nie każde wyrażnienie musi mieć ()
    // x -> { if (x > 0) return x*x; else return 0;}  niekiedy jednak trzeba użyć bardziej skomplikowanych wyrążeń i {}

    public static void main(String[] args) {
        String original = "   WIELKI NAPIS   ";
        String changed  = original.toLowerCase().trim();
        String changed1 = lowerCaseTrim(original);
        Function<String, String> functions = new Function<String, String>() {
            @Override
            public String apply(String source) {
                return source.toLowerCase().trim();
            }
        };

        Function<String, String> function1 = source -> source.toLowerCase().trim();


        Consumer <String> consumer = (String s) -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        consumer.accept(original);

        System.out.println(function1.apply(original));
        System.out.println(functions.apply(original));
        System.out.println(changed);
        System.out.println(changed1);

        String [] firstNames = {"Piotek", "Szymon", "Michał"};
        String [] lastNames = {"Gulp", "Wajs", "Sztos"};
        int [] ages = {22, 33, 44};

        Random rand = new Random();

        Supplier<Person> personSupplier = () -> {
            String firstName = firstNames[rand.nextInt(firstNames.length)];
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            int age  = ages[rand.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };
        Person person1 = personSupplier.get();
        System.out.println(personSupplier.get());
        System.out.println(personSupplier.get());
        System.out.println(personSupplier.get());
        System.out.println(personSupplier.get());

    }
//String source -> return String - poszukać takiego interfejsu funkcyjnego
    static String lowerCaseTrim (String source){
        return source.toLowerCase().trim();
    }

    int personAge = 19;
    Predicate<Integer> checkIfAdult = (Integer age) -> age <= 18;
    boolean check1 = checkIfAdult.test(personAge);
    //////////////////

    String [] firstNames = {"Piotek", "Szymon", "Michał"};
    String [] lastNames = {"Gulp", "Wajs", "Sztos"};
    int [] ages = {22, 33, 44};

    Random rand = new Random();

    Supplier<Person> personSupplier = () -> {
       String firstName = firstNames[rand.nextInt(firstNames.length)];
       String lastName = lastNames[rand.nextInt(lastNames.length)];
       int age  = ages[rand.nextInt(ages.length)];
        return new Person(firstName, lastName, age);
    };






}
