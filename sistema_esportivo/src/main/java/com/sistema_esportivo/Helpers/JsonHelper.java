package com.sistema_esportivo.Helpers;

import static com.sistema_esportivo.Utils.IOMethods.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonHelper {
    
    public static String JsonFileToString(String filePath){
        try{
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath))); 
            return jsonContent; 
        }catch(IOException e){
            print("Não foi possível ler o arquivo");
            e.printStackTrace(); 
        }
        return ""; 
    }

}
