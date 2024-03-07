package Chapter37.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmailManager {
    public static void main(String[] args) {
        //stworzenie listy z przykładowymi mailami
        List<Email> emailList = createEmailList();
        //tylko wysłane emaile
        List<Email> sentEmails = filter(emailList, email -> email.isSent());
        //filtrowanie maili w których nadawca lub odbiorca ma wskazany adres email
        List<Email> bartEmails = filter(emailList, e -> e.getSender().equals("bart@example.com") || e.getRecipient().equals("bart@example.com"));


    }

    private static List<Email> filter(List<Email> emails, Predicate<Email> predicate){
        List<Email> filteredEmails = new ArrayList<>();
        for (Email email : emails) {
            if (predicate.test(email)){
                filteredEmails.add(email);
            }
        }
        return filteredEmails;
    }
    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}
