package Chapter42.ex1;

import java.util.*;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<Contact>();

    void addContact(Contact ccontact) {
        contacts.add(ccontact);
    }

    Optional<Contact> findByEmail(String email) {
        if(email == null)
            throw new NullPointerException("email cannot be null");
       for (Contact ccontact : contacts) {
           if(email.equals(ccontact.getEmail()))
               return Optional.of(ccontact);
       }
       return Optional.empty();
    }

    List<Contact> findByLastName(String lastName) {
        if(lastName == null)
            throw new NullPointerException("search text cannot be null");
        List<Contact> contacts = new ArrayList<Contact>();

        for(Contact ccontact : contacts) {
            if(ccontact.getLastName().contains(lastName))
                contacts.add(ccontact);
        }
        return contacts;
    }
}
