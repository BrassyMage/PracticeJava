package Tournament;
 public class FPSPlayer extends Player {
    private String favoriteWeapon;

    public FPSPlayer(String username, int level, int score, String favoriteWeapon){
        super(username, level, score);
        this.favoriteWeapon = favoriteWeapon;
    }

    @Override
     public void play(){
        System.out.println("FPSPlayer: "+getUsername()+" is shooting with "+favoriteWeapon);
        System.out.println(getUsername()+" hits a "+getScore()+" at level "+getLevel());
    }

    @Override
     public void displayInfo(){
        super.displayInfo();
        System.out.println("Favorite Weapon:" +favoriteWeapon);
     }

}
