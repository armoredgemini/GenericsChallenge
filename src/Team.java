/**
 * Created by ac003588 on 9/12/2017.
 */
public abstract class Team {
/*   each team will have:
     name
     wins
     losses
     ties
     totalWins

     a method to play game (opponent, win, loss, tie)
          method will update self's win/loss/tie and opponent's win/loss/tie
*/

private String name;
private Integer wins = 0;
private Integer losses = 0;
private Integer ties = 0;
private Integer totalWins = 0;



public Team(String name) {
        this.name = name;
}



    public Integer getWins() {
        return wins;
    }

    public void addWin() {
        wins = wins + 1;
    }

    public Integer getLosses() {
        return losses;
    }

    public void addLoss() {
        this.losses = losses + 1;
    }

    public Integer getTies() {
        return ties;
    }

    public void addTie() {
        ties = ties + 1;
    }

    public Integer getTotalWins() {
        return totalWins;
    }

    public void setTotalWins() {
        totalWins = wins + ties;
    }

    public void playGame(Team opponent, String result) {
        if(result.equals("win")){
            this.addWin();
            opponent.addLoss();
        } else if(result.equals("loss")) {
            this.addLoss();
            opponent.addWin();
        } else {
            this.addTie();
            opponent.addTie();
        }
    }
}
