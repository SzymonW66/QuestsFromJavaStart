package Chapter22.ex2;

import java.util.Arrays;

public class Competiton {
    private String name;
    private Participant[] participants;
    private int ageLimits;
    private int size;

    public Competiton(String name, int maxParticipants, int ageLimits){
        this.name = name;
        if (ageLimits < 0)
            throw new IllegalArgumentException("ageLimit has to be positive number");
        this.participants = new Participant[maxParticipants];
    }


   void addParticipant (Participant participant){
       if (participant.getAge() < ageLimits)
           throw new AgeViolationException(ageLimits);
       if(participants.length == size){
           throw new MaxCompetitorsException(size);
       }
       checkDuplicate(participant);
       participants[size] = participant;
       size++;
   }

    private void checkDuplicate(Participant participant) {
        for(int i = 0; i < size; i++){
            if (participants[i].getDocumnetId().equals(participant.getDocumnetId())){
                throw new DuplicateException(participant);
            }
        }
    }

    boolean hasFreeSpot(){
       return size < participants.length;
   }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Zawody")
                .append(name)
                .append("\n")
                .append("Liczba uczestników").append(size);
        for (int i = 0; i < size; i ++){
            stringBuilder.append("\n");
            stringBuilder.append(">");
            stringBuilder.append(participants[i].toString());
        }
        return stringBuilder.toString();
    }
}
