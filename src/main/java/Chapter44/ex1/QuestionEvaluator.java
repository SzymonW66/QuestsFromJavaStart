package Chapter44.ex1;

public interface QuestionEvaluator {
    /**
     * Metoda interpretuje przekazany tekst, wykonuje na nim operacje i zwraca tekstową odpowiedź
     * @param input - dowolny tekst
     * @return - wynik interpretacji przekazanego tekstu
     */
    String evaluate(String input);

    /**
     * Sprawdza, czy QuestionEvaluator jest w stanie przetworzyć wskazany tekst
     * @param input dowolny tekst
     * @return true jeżeli Evaluator jest w stanie przetworzyć przekazany tekst
     */
    boolean match(String input);
}
