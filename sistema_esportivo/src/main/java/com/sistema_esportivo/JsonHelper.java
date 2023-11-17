package com.sistema_esportivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonHelper {
    
    public static String JsonFileToString(String filePath){
        try{
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath))); 
            return jsonContent; 
        }catch(IOException e){
            System.out.println("Não foi possível ler o arquivo");
            e.printStackTrace(); 
        }
        return ""; 
    }

}
