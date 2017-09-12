/**
 * Created by ac003588 on 9/12/2017.
 */
public class Main {
/*

Create 4 Teams
Create League
Add Teams to League
Add incompatible team to League
Play 4 games
print teams

 */


    public static void main(String[] args) {


        Team broncos = new Football("Denver Broncos");
        Team cowboys = new Football("Dallas Cowboys");
        Team dolphins = new Football("Miani Dolphins");
        broncos.playGame(dolphins, "win");
        broncos.playGame(cowboys, "loss");
        broncos.playGame(dolphins, "loss");
        System.out.println(broncos.getWins());
        System.out.println(dolphins.getWins());
        System.out.println(cowboys.getWins());
        System.out.println();
    }

}
