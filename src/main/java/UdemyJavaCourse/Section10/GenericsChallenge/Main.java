package UdemyJavaCourse.Section10.GenericsChallenge;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>();
        Team<FootballPlayer> manU = new Team<>("manU", 5, 3,2);
        manU.addPlayer(new FootballPlayer("Dan"));
        Team<FootballPlayer> liverpool = new Team<>("Liverpool", 8,2,0);
        liverpool.addPlayer(new FootballPlayer("Bob"));
        Team<FootballPlayer> leeds = new Team<>("Leeds",4,4,2);
        leeds.addPlayer(new FootballPlayer("Paul"));
        footballLeague.addTeamToLeague(manU);
        footballLeague.addTeamToLeague(liverpool);
        footballLeague.addTeamToLeague(leeds);

        League<Team<BasketballPlayer>> basketballLeague = new League<>();
        Team<BasketballPlayer> utahJazz = new Team<>("Utah Jazz",5,2,3);
        utahJazz.addPlayer(new BasketballPlayer("Karl Malone"));
        Team<BasketballPlayer> chicagoBulls = new Team<>("Chicago Bulls",6,3,1);
        chicagoBulls.addPlayer(new BasketballPlayer("Scottie Pippin"));
        Team<BasketballPlayer> denverNuggets = new Team<>("Denver Nuggets",2,7,1);
        denverNuggets.addPlayer(new BasketballPlayer("Random Guy"));
        // Not allowed
        //footballLeague.addTeamToLeague(utahJazz);
        basketballLeague.addTeamToLeague(utahJazz);
        basketballLeague.addTeamToLeague(chicagoBulls);
        basketballLeague.addTeamToLeague(denverNuggets);

        League<Team<BaseballPlayer>> baseballLeague = new League<>();
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs",5,4,1);
        chicagoCubs.addPlayer(new BaseballPlayer("Blowie Johnson"));
        Team<BaseballPlayer> bostonRedsox = new Team<>("Boston Redsox",2,7,1);
        bostonRedsox.addPlayer(new BaseballPlayer("Babe Ruth"));
        Team<BaseballPlayer> sanFranGiants = new Team<>("SanFran Giants",8,2,0);
        sanFranGiants.addPlayer(new BaseballPlayer("Homerun Homer"));
        // Not allowed
        //baseballLeague.addTeamToLeague(manU);
        baseballLeague.addTeamToLeague(chicagoCubs);
        baseballLeague.addTeamToLeague(bostonRedsox);
        baseballLeague.addTeamToLeague(sanFranGiants);

        footballLeague.printTeamsInAscendingOrder();
        System.out.println("------------------------");
        basketballLeague.printTeamsInAscendingOrder();

        System.out.println("------------------------");
        baseballLeague.printTeamsInAscendingOrder();
    }
}
