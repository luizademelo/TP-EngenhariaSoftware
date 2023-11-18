import static org.junit.Assert.*;
import org.junit.Test;

import com.sistema_esportivo.Classes.Stadium;


public class StadiumTest {
    
    @Test
    public void testStadiumCreation() {
        Stadium team = new Stadium("Cidade", "Nome", "Capacidade");
        assertEquals("A cidade do estádio não foi criado corretamente", team.getCity(), "Cidade");
        assertEquals("O nome do estádio não foi criado corretamente", team.getName(), "Nome");
        assertEquals("A capacidade do estádio não foi criado corretamente", team.getCapacity(), "Capacidade");
    }

}
