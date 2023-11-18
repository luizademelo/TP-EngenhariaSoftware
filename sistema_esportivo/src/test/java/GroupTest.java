import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sistema_esportivo.Classes.Group;

public class GroupTest {
    
    @Test
    public void testGroupCreation(){
        List<String> teams = new ArrayList<String>(); 
        teams.add("Brazil"); 
        Group group = new Group("Grupo A", teams);
        assertTrue("O objeto grupo não foi criado corretamente", group.getGroup().equals("Grupo A")); 
    }
}
