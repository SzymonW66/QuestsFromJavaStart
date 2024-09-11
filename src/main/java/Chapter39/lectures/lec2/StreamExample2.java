package Chapter39.lectures.lec2;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {

        Stream<Course> courseStream = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Googla", 299, "Marketing")
        );
        courseStream.forEach(System.out::println);

        long count = courseStream.count();
        System.out.println(count);

        Optional<Course> min = courseStream.min(Comparator.comparingDouble(Course::getPricing));
        Optional<Course> max = courseStream.max(Comparator.comparingDouble(Course::getPricing));

        min.ifPresent(System.out::println);
        max.ifPresent(System.out::println);

        boolean b = courseStream.anyMatch(course -> course.getPricing() < 100);
        System.out.println(b);
//trzeba pokomentowac żeby nie było paru peracji na jednym streamie, bo każdy sie zamyka po zorbieniu na nim lambdy czy czegoś

        boolean above10 = courseStream.allMatch(course -> course.getPricing() > 10);
        System.out.println(above10);

        courseStream.noneMatch(course -> course.getPricing() > 300);


        Course[] array = courseStream.toArray(Course[]::new);
        System.out.println(Arrays.toString(array));

        ArrayList<Course> collect = courseStream.collect(
                ArrayList<Course>::new,
                ArrayList::add,
                ArrayList::addAll
        );

        List<Course> collect1 = courseStream.collect(Collectors.toList());
        TreeSet<Course> treeSet = courseStream.collect(Collectors.toCollection(TreeSet::new)); //robi do prestetu

        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");

        String reduce = names.reduce("", (result, next) -> result + next + " ");
        System.out.println(reduce);


        Double reduce1 = courseStream.map(Course::getPricing).reduce(0.0, Double::sum);
        System.out.println(reduce1);


    }
}
