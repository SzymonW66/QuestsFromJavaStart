package Chapter44.ex1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodayQuestionEvaluator implements QuestionEvaluator{
    private static final Pattern PATTERN = Pattern.compile(
            "[Jj]aki dziś dzień tygodnia\\??"
    );

    @Override
    public String evaluate(String input) {
        Matcher matcher = PATTERN.matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("No Match");
        }
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String displayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("PL"));
        return "Dziś jest " + displayName;
    }

    @Override
    public boolean match(String input) {
        return PATTERN.matcher(input).matches();
    }
}
