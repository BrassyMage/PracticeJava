package Tournament;
public abstract class Player {
    private String username;
    private int level;
    private int score;

    public Player(String username, int level, int score){
        this.username = username;
        this.level = level;
        this.score = score;
    }
    
    public String getUsername(){
        return username;
    }

    public int getLevel(){
        return level;
    }
    
    public int getScore(){
        return score;
    }
    
    abstract void play();
    void displayInfo(){
        System.out.println("Username: " + username);
        System.out.println("Level: " + level);
        System.out.println("Score: " + score);
    }
}
