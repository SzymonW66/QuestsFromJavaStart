package Chapter18.ex1;

import java.awt.*;
import java.util.ArrayList;

public class Hospital {
    private static final int MAX_EMPLOYERS = 3;
    private int employeesNumber= 0;
ArrayList<Person> hospitalCrew = new ArrayList<>(MAX_EMPLOYERS-1);

void addCrewMember(Person person){
    hospitalCrew.add(person);
    employeesNumber++;
}

String getInfo() {
    return hospitalCrew.toString();
}

}
