import static org.junit.Assert.*;
import org.junit.Test;

import com.sistema_esportivo.Stadium;


public class StadiumTest {
    
    @Test
    public void testStadiumCreation() {
        Stadium team = new Stadium("Cidade", "Nome", "Capacidade");
        assertEquals("O objeto Stadium não foi criado corretamente", team.getCity(), "Cidade");
        assertEquals("O objeto Stadium não foi criado corretamente", team.getStadium_name(), "Nome");
        assertEquals("O objeto Stadium não foi criado corretamente", team.getCapacity(), "Capacidade");
    }

}
