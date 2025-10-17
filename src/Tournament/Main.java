package Tournament;

public class Main {
    public static void main(String[] args) {
        Tournament t = new Tournament("RAHHH");

        FPSPlayer fps = new FPSPlayer("Chicken Curry", 20, 200, "Vandal");
        MOBAPlayer moba = new MOBAPlayer("GEATAYKA", 20, 230, "Reyna");

        t.addPlayer(fps);
        t.addPlayer(moba);

        t.showAllPlayers();
        t.startTournament();

        Player top = t.getTopPlayer();
        if(top != null){
            System.out.println("Top Player: " + top.getUsername() + " with Score: " + top.getScore());
        }
    }
}
