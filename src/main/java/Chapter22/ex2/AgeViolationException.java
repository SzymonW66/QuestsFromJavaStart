package Chapter22.ex2;

public class AgeViolationException extends RuntimeException{
    private final int ageAquired;

    public AgeViolationException(int ageAquired) {
        this.ageAquired = ageAquired;
    }

    public int getAgeAquired() {
        return ageAquired;
    }

}
