package com.sistema_esportivo.Helpers;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema_esportivo.Classes.Team;

import static com.sistema_esportivo.Utils.IOMethods.*;

public class TeamHelper{

    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Team> teamList = new ArrayList<>();

    private static void teamsJsonToList(String json){
        try{

            JsonNode jsonArray = mapper.readTree(json);
            JsonNode dataArray = jsonArray.get("data");  

            for(JsonNode element : dataArray){
                String text = element.toString(); 
                Team team = mapper.readValue(text, Team.class); 
                teamList.add(team); 
            }


        }catch(Exception e){
            e.printStackTrace();
            print("Não foi possível ler o arquivo de times");
        }
    }

    public static void loadAllTeams(){

        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/todasAsSelecoes.json"); 
        teamsJsonToList(json); 
    }

    public static Team getTeamByName(String name){
        for(Team team : teamList){
            if(team.getName().equals(name)){
                return team; 
            }
        }
        System.out.println("Time " + name + " não encontrado");
        return null;
    }

    public static void printAllTeams(){
        for(Team team : teamList){
            print(team.toString());
        }
    }
}