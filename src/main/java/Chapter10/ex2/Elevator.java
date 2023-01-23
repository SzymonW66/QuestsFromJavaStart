package Chapter10.ex2;

public class Elevator {
    final private int maxWeight = 400;
    Person[] people = new Person[4];
    private int peopleNumber = 0;

    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Elevator is full, please wait");
        }
    }

    void start() {
        if (weightIsCorrect()) {
            System.out.println("Elevator started");
        } else {
           int overload = getTotalWeight() - maxWeight;
            System.out.println("Elevator is overloaded above " + overload + " kg");
        }
    }


    private boolean weightIsCorrect() {
        return getTotalWeight() <= maxWeight;
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        if (people[0] != null) {
            totalWeight += people[0].getWeight();
        }
        if (people[1] != null) {
            totalWeight += people[1].getWeight();
        }
        if (people[2] != null) {
            totalWeight += people[2].getWeight();
        }
        if (people[3] != null) {
            totalWeight += people[3].getWeight();
        }
        return totalWeight;
    }

    void clear() {
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;
        peopleNumber = 0;
        System.out.println("Elevator is empty");
    }


}
