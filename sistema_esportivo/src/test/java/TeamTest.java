import static org.junit.Assert.*;
import org.junit.Test;

import com.sistema_esportivo.Team;

public class TeamTest {

    @Test
    public void testTeamCreation() {
        Team team = new Team("4321", "Nome", "Estadio", "Local");
        assertEquals("O objeto Team não foi criado corretamente", team.getId(), "4321");
        assertEquals("O objeto Team não foi criado corretamente", team.getName(), "Nome");
        assertEquals("O objeto Team não foi criado corretamente", team.getStadium(), "Estadio");
        assertEquals("O objeto Team não foi criado corretamente", team.getLocation(), "Local");

    }
}
