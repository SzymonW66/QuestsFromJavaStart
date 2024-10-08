package Chapter44.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathAddQuestionEvaluator implements QuestionEvaluator {
    private static final Pattern PATTERN = Pattern.compile(
            "[Jj]aki jest wynik dodawania (?<a>\\d) do (?<b>\\d)\\??"
    );

    @Override
    public String evaluate(String input) {
        Matcher matcher = PATTERN.matcher(input);
        if(!matcher.matches()) {
            throw new IllegalArgumentException("Input is not a valid math expression");
        }
        int a = Integer.parseInt(matcher.group("a"));
        int b = Integer.parseInt(matcher.group("b"));
        int sum = a + b;
        return "Wynik dodawania %d + %d = %d".formatted(a, b, sum);
    }

    @Override
    public boolean match(String input) {
        return PATTERN.matcher(input).matches();
    }
}
