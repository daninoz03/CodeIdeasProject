package UdemyJavaCourse.Section10.GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    public ArrayList<T> teams = new ArrayList<>();

    public boolean addTeamToLeague(T team) {
        if (teams.contains(team)) {
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printTeamsInAscendingOrder() {

        Collections.sort(teams);

        for (T team : teams) {
            System.out.println(team.getName() + " : " + team.getRanking());
        }
    }

}
