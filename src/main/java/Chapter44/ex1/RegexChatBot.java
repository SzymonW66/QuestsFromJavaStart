package Chapter44.ex1;

public class RegexChatBot {
    public static void main(String[] args) {
        String testString1 = "Jaki jest wynik dodawania 2 do 5?";
        System.out.println(testString1);
        QuestionEvaluator evaluator = new MathAddQuestionEvaluator();
        if(evaluator.match(testString1)) {
            String result = evaluator.evaluate(testString1);
            System.out.println(result);
        }
    }
}
