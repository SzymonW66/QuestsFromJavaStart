package Chapter19.ex1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Asus", "12345"));
        dataStore.add(new Computer("Asus", "12345"));
        dataStore.add(new Computer("Asus2", "123452"));
        dataStore.add(new Computer("Asus3", "123453"));
        dataStore.add(new Computer("Asus4", "123454"));
        dataStore.add(new Computer("Asus5", "123455"));


        Computer computerToFind = new Computer("Asus", "12345");

        int computerFund = dataStore.checkAvalibility(computerToFind);
        System.out.println("Liczba komputerów " + computerToFind + " wynosi " + computerFund);

        System.out.println("Wszystkie dostępne komputery");

        for (Computer c: dataStore.getComputers()) {
            System.out.println(c);
        }

    }
}
