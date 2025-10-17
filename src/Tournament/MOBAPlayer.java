package Tournament;
public class MOBAPlayer extends Player{
    private String mainHero;

    public MOBAPlayer(String username,int level, int score, String mainHero){
        super(username,level,score);
        this.mainHero=mainHero;
    }

    @Override
    public void play(){
        System.out.println("MOBA Player: "+getUsername()+" is using "+mainHero);
        System.out.println(getUsername()+" hits a "+getScore()+" at level "+getLevel());
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Main Hero: "+mainHero);
    }
}
