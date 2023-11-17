package com.sistema_esportivo;

import static com.sistema_esportivo.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MatchHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Match> matches = new ArrayList<>();

    private static void matchsJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode matchesArray = jsonArray.get("data").get("match");

            for (JsonNode element : matchesArray) {

                String home_name = element.get("home_name").asText();
                String away_name = element.get("away_name").asText();
                String score = element.get("score").asText();

                Team home = TeamHelper.getTeamByName(home_name);
                Team away = TeamHelper.getTeamByName(away_name);

                Match match = new Match(home, away, score);
                matches.add(match); 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de partidas");
        }
    }
    
    public static void loadAllMatches() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/paginaJogos1.json");
        matchsJsonToList(json);
    }

    public static void printAllMatches(){
        for(Match match : matches){
            print(match.toString());
            printLine(); 
        }
    }
}
