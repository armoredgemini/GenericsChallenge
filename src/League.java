import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 * Created by ac003588 on 9/12/2017.
 */

// League object will take T objects, which will be of type team

public class League<T extends Team> {

    /*
    each league will have:
    a list of teams
    a method to print the teams, which will print them in sorted order


    https://stackoverflow.com/questions/2535124/how-to-sort-an-arraylist-of-objects-by-a-property

      Collections.sort(teams, new Comparator<Team>() {
        @Override public int compare(Team t1, Team t2) {
            return t1.totalWins - t2.totalWins; // Ascending
        }


    each league can only have same type of teams
    public class League<T extends Team> implements Comparable<Team<T>>
    comparable will use a custom compareTo



     */

    private ArrayList<T> teams = new ArrayList<>();

    public boolean addTeam(T team) {
        if(teams.add(team)) {
            System.out.println("Team " + team.getName() + " added to League");
            return true;
        }
        return false;
    }
    public ArrayList<T> displayTeams() {
        ArrayList names = new ArrayList();
        Collections.sort(teams, (t1, t2) -> t2.getWins() - t1.getWins());
        for(Team t : teams ) {
            names.add(t.getName());
        }
        return names;


    }

}
