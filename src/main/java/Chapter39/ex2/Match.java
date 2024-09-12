package Chapter39.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Match {
    public static void main(String[] args) {
        Stream<MatchResult> results = Stream.of(
                new MatchResult("Polska", "Irlandia", 2, 0),
                new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Włochy", "Polska", 2, 1),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Anglia", "Francja", 3, 0),
                new MatchResult("Polska", "Portugalia", 1, 0),
                new MatchResult("Brazylia", "Niemcy", 3, 3)
        );
        printAllResultsSorted(results);
        printAllResultsSorted2(results);

    }

    private static void printAllResultsSorted(Stream<MatchResult> results) {
        results.sorted(
                (result1, result2) -> {
                    int result1Difference = result1.getHostGoals() - result1.getGuestGoals();
                    int result2Difference = result2.getHostGoals() - result2.getGuestGoals();
                    return Integer.compare(result1Difference, result2Difference);
                }
        ).forEach(System.out::println);
    }

    private static void printAllResultsSorted2(Stream<MatchResult> results) {
        results.sorted(Comparator.comparing(MatchResult::getGoalDifference).reversed())
                .forEach(System.out::println);
    }

    private static List<MatchResult> getResultsWithTeam(Stream<MatchResult> results, String team) {
        return results.filter(result -> result.containsTeam(team))
                .collect(Collectors.toList());
    }

    private static long countDistinctTeams(Stream<MatchResult> results) {
        return results.map(MatchResult::getTeamsNames)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
    }

    private static int numberOfGoals(Stream<MatchResult> results) {
        return results.mapToInt(MatchResult::sumOfGoals)
                .sum();
    }


}
