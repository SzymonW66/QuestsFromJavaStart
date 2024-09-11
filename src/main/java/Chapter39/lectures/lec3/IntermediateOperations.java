package Chapter39.lectures.lec3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());

        Stream<Course1> courses = Stream.of(
                new Course1(1L, "Java", 199, "Programowanie"),
                new Course1(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course1(3L, "Zarządzenie zespołem", 159, "Biznes"),
                new Course1(4L, "Tajniki Google", 299, "Marketing"),
                new Course1(5L, "Python", 199, "Programowanie")
        );
        Stream<Course1> expenssiveCourses = courses.filter(course -> course.getPricing() > 200);
        expenssiveCourses.forEach(System.out::println);

        Course1[] cheapCourses = {
                new Course1(1L, "Java", 49, "Programowanie"),
                new Course1(2L, "Sztuka pisania", 79, "Rozwój osobisty"),
        };
        Course1[] expensiveCourses = {
                new Course1(3L, "Tajniki Google", 299, "Marketing"),
                new Course1(4L, "Python od podstaw", 169, "Programowanie")
        };

        Stream.of(cheapCourses, expensiveCourses)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        IntStream.iterate(0, n -> n + 1)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());



        Stream<Course1> courses2 = Stream.of(
                new Course1(1L, "Java", 199, "Programowanie"),
                new Course1(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course1(1L, "Java", 199, "Programowanie"),
                new Course1(3L, "Tajniki Google", 299, "Marketing"),
                new Course1(1L, "Java", 199, "Programowanie")
        );

        Stream<Course1> uniqueStream = courses2.distinct();
        uniqueStream.forEach(System.out::println);

        Stream<Course1> courses3 = Stream.of(
                new Course1(1L, "Java", 249, "Programowanie"),
                new Course1(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course1(3L, "Java od podstaw", 159, "Programowanie"),
                new Course1(4L, "Tajniki Google", 299, "Marketing")
        );

        courses3.map(Course1::getName)
                .filter(name -> name.toLowerCase().contains("java"))
                .peek(course -> System.out.println("Filtered stream: " + course))
                .collect(Collectors.toList());

        Stream<Course1> courses4 = Stream.of(
                new Course1(1L, "Java", 199, "Programowanie"),
                new Course1(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course1(1L, "Java", 199, "Programowanie"),
                new Course1(3L, "Tajniki Google", 299, "Marketing"),
                new Course1(1L, "Java", 199, "Programowanie")
        );

        Stream<Course1> sorted = courses4.sorted(Comparator.comparing(Course1::getPricing));
        sorted.forEach(System.out::println);

    }
}
