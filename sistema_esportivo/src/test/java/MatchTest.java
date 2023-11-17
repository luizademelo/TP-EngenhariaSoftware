import static org.junit.Assert.*;
import org.junit.Test;

import com.sistema_esportivo.Match;
import com.sistema_esportivo.Team;

public class MatchTest {

    @Test
    public void testMatchCreation(){
        Team team1 = new Team("4321", "Nome", "Estadio", "Local");
        Team team2 = new Team("1234", "Nome2", "Estadio2", "Local2");
        Match match = new Match(team1, team2, "0 - 0"); 

        assertTrue("O objeto Match não foi criado corretamente", match.getHomeTeam().equals(team1)); 
        assertTrue("O objeto Match não foi criado corretamente", match.getAwayTeam().equals(team2));
        assertTrue("O objeto Match não foi criado corretamente", match.getScore().equals("0 - 0"));

    }
}
