package UdemyJavaCourse.Section10.GenericsChallenge;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int won;
    private int lost;
    private int drew;
    private List<Player<T>> players = new ArrayList<>();
    private int ranking;

    public Team(String name, int won, int lost, int drew) {
        this.name = name;
        this.won = won;
        this.lost = lost;
        this.drew = drew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getDrew() {
        return drew;
    }

    public void setDrew(int drew) {
        this.drew = drew;
    }

    public void addPlayer(T player) {
        players.add(player);
    }

    public int getRanking() {
        return (this.getWon() * 3) + (this.getDrew() * 2) + (this.getLost());

    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getRanking() > team.getRanking()) {
            return -1;

        } else if (this.getRanking() < team.getRanking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
