package Chapter39.ex2;

public class MatchResult {
    private String host;
    private String guest;
    private int hostGoals;
    private int guestGoals;

    public MatchResult(String host, String guest, int hostGoals, int guestGoals) {
        this.host = host;
        this.guest = guest;
        this.hostGoals = hostGoals;
        this.guestGoals = guestGoals;
    }

    public boolean containsTeam(String team) {
        return host.equals(team) || guest.equals(team);
    }

    public String[] getTeamsNames(){
        return new String[]{host, guest};
    }

    public int sumOfGoals(){
        return hostGoals + guestGoals;
    }

    public int getGoalDifference(){
        return hostGoals - guestGoals;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public int getHostGoals() {
        return hostGoals;
    }

    public void setHostGoals(int hostGoals) {
        this.hostGoals = hostGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(int guestGoals) {
        this.guestGoals = guestGoals;
    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "host='" + host + '\'' +
                ", guest='" + guest + '\'' +
                ", hostGoals=" + hostGoals +
                ", guestGoals=" + guestGoals +
                '}';
    }
}
