package Chapter18.ex2;

public class GameSimulator {
    public static void main(String[] args) {
        Attacker character1 = new Attacker("Joe", 150, 100, 100, 0.2);
        Attacker character2 = new Attacker("Martha", 100, 100, 100, 0.2);
        Defender character3 = new Defender("Kris", 100, 100, 100, 0.2);
        Attacker character4 = new Attacker("Matt", 100, 100, 100, 0.2);
        Attacker character5 = new Attacker("Martha", 100, 100, 100, 0.2);
        Defender character6 = new Defender("Belly", 100, 100, 100, 0.2);

        Team team1 = new Team("TeamOne", character1, character2, character4);
        Team team2 = new Team("TeamTwo", character3, character6, character5);
        BattleSimulator.fight(team1, team2);
    }
}
