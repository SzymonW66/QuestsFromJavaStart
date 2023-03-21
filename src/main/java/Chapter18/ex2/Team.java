package Chapter18.ex2;

public class Team {
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private Person [] characters = new Person[3];

    public Team(String teamName, Person character1, Person character2, Person character3) {
        this.teamName = teamName;
        this.characters[0] = character1;
        this.characters[1] = character2;
        this.characters[2] = character3;
    }

    public Person[] getCharacters() {
        return characters;
    }

    public void setCharacters(Person[] characters) {
        this.characters = characters;
    }

    double attack(){
        double attack = 0;
        for (Person person: characters) {
            attack += person.totalAttack();
        }
        return attack;
    }

    double defense() {
        double defense = 0;
        for (Person person: characters) {
            defense += person.totalDefense();
        }
        return defense;
    }

    double energy() {
        double energy = 0;
        for (Person person: characters) {
            energy += person.getHP();
        }
        return energy;
    }
}
