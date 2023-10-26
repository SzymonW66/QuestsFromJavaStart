package Chapter22.ex2;

public class DuplicateException extends RuntimeException{
    private Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
