package Chapter44.ex1;

public class QuestionEvaluatorFacade {
    private static final QuestionEvaluator[] EVALUATORS = {
            new MathAddQuestionEvaluator(),
            new TextCountQuestionEvaluator(),
            new TodayQuestionEvaluator()
    };

    static String evaluate(String input) {
        for (QuestionEvaluator evaluator : EVALUATORS) {
            if(evaluator.match(input)) {
                return evaluator.evaluate(input);
            }
        }
        throw new IllegalArgumentException("QuestionEvaluator for provided input not found");
    }
}
