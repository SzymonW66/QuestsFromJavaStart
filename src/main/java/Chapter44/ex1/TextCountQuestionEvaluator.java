package Chapter44.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCountQuestionEvaluator implements QuestionEvaluator {
    private static final Pattern PATTERN = Pattern.compile(
            "[Ii]le znaków ma tekst \"(?<text>.*)\"\\??"
    );

    @Override
    public String evaluate(String input) {
        Matcher matcher = PATTERN.matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("No Match");
        }
        String text = matcher.group("text");
        int textLength = text.length();
        int whitespace = text.replaceAll("\\S", "").length();
        int nonWhitespace = textLength - whitespace;
        return "Tekst ma %d znaków (czarne: %d, białe %d)".formatted(textLength, nonWhitespace, whitespace);
    }

    @Override
    public boolean match(String input) {
        return PATTERN.matcher(input).matches();
    }
}
