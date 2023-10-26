package Chapter22.ex2;

public class MaxCompetitorsException extends RuntimeException{
    private final int maxCompetitiors;

    public MaxCompetitorsException(int maxCompetitiors) {
        this.maxCompetitiors = maxCompetitiors;
    }

    public int getMaxCompetitiors() {
        return maxCompetitiors;
    }
}
