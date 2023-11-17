import static org.junit.Assert.*;
import org.junit.Test;

import com.sistema_esportivo.JsonHelper;

public class JsonHelperTest {
    
    @Test
    public void testJsonFileReading(){
        String path = "./src/test/resources/JsonFileExample.json"; 
        String result = JsonHelper.JsonFileToString(path); 
        System.out.println(result);
        assertTrue("O resultado da leitura está incorreto\n", result.length() > 0);
    }
}
