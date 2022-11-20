package Chapter5.ex1;

public class Bank {
    public static void main(String[] args) {
    Person person = new Person();
    person.firstName = "John";
    person.lastName = "Krasinski";
    person.pesel = "189273891027389127";


    BankAccount bankAccount1 = new BankAccount();
    bankAccount1.owner = person;
    bankAccount1.balance = 1000.00;

    Credit credit1 = new Credit();
    credit1.borrower = person;
    credit1.cashBorrowerd = 1000.00;
    credit1.interestRate = 0.05;
    credit1.termMonths = 12;
    credit1.cashReturned = 500;

    Adress adress1 = new Adress();
    adress1.city = "New York";
    adress1.houseNumber = "10";
    adress1.street = "Liberty";
    adress1.zipCode = "50-555";

    person.address = adress1;
    person.registeredAddress = adress1;

    Person person2 = new Person();
    person2.firstName = "Thomas";
    person2.lastName = "Edison";
    person2.pesel = "1231556677";

    BankAccount bankAccount2 = new BankAccount();
    bankAccount2.balance = 6000.00;
    bankAccount2.owner = person2;

    Credit credit2 = new Credit();
    credit2.borrower = person2;
    credit2.interestRate = 0.05;
    credit2.cashBorrowerd = 10000;
    credit2.cashReturned = 2000;
    credit2.termMonths = 24;

    Adress adress2 = new Adress();
    adress2.city = "London";
    adress2.houseNumber = "100";
    adress2.street = "Baking Street";
    adress2.zipCode = "658";

    Adress adress3 = new Adress();
    adress3.city = "Wroclaw";
    adress3.houseNumber = "100/1";
    adress3.street = "Legnicka";
    adress3.zipCode = "658";

    person2.registeredAddress = adress2;
    person2.address = adress3;

        System.out.println("Osoba 1:");
        System.out.println(person.firstName + " " + person.lastName);
        System.out.println("mieszka w miejscowości: " + person.address.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.address.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount2.balance);
    }

    }

