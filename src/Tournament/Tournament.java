package Tournament;
import java.util.ArrayList;


public class Tournament {
    private String tournamentName;
    private ArrayList<Player> players = new ArrayList<>();

    public Tournament(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    void addPlayer(Player p){
        players.add(p);
    }

    void showAllPlayers() {
        System.out.println("--- Player List ---");
        for (Player p : players) {
            p.displayInfo();
            System.out.println();
        }
    }

    void startTournament() {
        System.out.println("\n--- Tournament Started: " + tournamentName + " ---");
        for (Player p : players) {
            p.play();
            System.out.println();
        }
    }

    Player getTopPlayer() {
        if(players.isEmpty()) return null;
        Player top = players.get(0);
        for(Player p : players){
            if(p.getScore() > top.getScore()){
                top = p;
            }
        }
        return top;
    }
}
