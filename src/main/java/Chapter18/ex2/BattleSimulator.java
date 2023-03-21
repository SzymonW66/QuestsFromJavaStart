package Chapter18.ex2;

public class BattleSimulator {
    static void fight (Team team1, Team team2) {
        double team2Energy = attack(team1, team2);
        double team1Energy = attack(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Team named: " + team1.getTeamName() + " win, with " + energyDiff + " more energy");
        }
        else if (energyDiff < 0) {
            System.out.println("Team named: " + team2.getTeamName() + " win, with " + (-energyDiff) + " more energy");
        }
        else
            System.out.println("Tie, both teams has same energy: " + team1Energy);

    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0) {
            return energy - attackPower;
        }
        else {
            return energy;
        }
    }
}
