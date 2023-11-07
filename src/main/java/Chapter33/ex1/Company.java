package Chapter33.ex1;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Emploee> emploees = new HashMap<>();

    boolean addEmployee(Emploee emploee) {
        String key = emploee.getFirstName() + " " + emploee.getLastName();
        if (emploees.containsKey(key)) {
            return false;
        }
        emploees.put(key, emploee);
        return true;
    }

    Emploee getEmployee(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return emploees.get(key);
    }
}
