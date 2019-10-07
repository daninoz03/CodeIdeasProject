package UdemyJavaCourse.Section10.GenericsChallenge;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LeagueTest {

    @Test
    public void shouldSortLeagueInOrder() {
        // given
        League<Team<FootballPlayer>> footballLeague = new League<>();

        Team<FootballPlayer> manU = new Team<>("ManU", 5, 7, 2);
        Team<FootballPlayer> liverpool = new Team<>("LiverPool", 5, 7, 3);
        Team<FootballPlayer> leeds = new Team<>("Leeds", 1, 7, 1);

        footballLeague.addTeamToLeague(manU);
        footballLeague.addTeamToLeague(liverpool);
        footballLeague.addTeamToLeague(leeds);

        // when
        footballLeague.printTeamsInAscendingOrder();

        // then
        Assert.assertEquals(footballLeague.teams.get(0), liverpool);
        Assert.assertEquals(footballLeague.teams.get(1), manU);
        Assert.assertEquals(footballLeague.teams.get(2), leeds);
    }
}
