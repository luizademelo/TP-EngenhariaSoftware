package com.sistema_esportivo.Helpers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema_esportivo.Classes.Team;

public class StandingsHelper {
    private static final ObjectMapper mapper = new ObjectMapper();

    private static void standingsJsonToData(String json) {
        try {

            JsonNode jsonArray = mapper.readTree(json);
            JsonNode dataArray = jsonArray.get("data");
            JsonNode tableArray = dataArray.get("table");

            for (JsonNode table : tableArray) {

                String teamName = table.get("name").asText(); 
                Team team = TeamHelper.getTeamByName(teamName);

                int goals_scored = Integer.parseInt(table.get("goals_scored").asText());
                int goals_conceded = Integer.parseInt(table.get("goals_conceded").asText());
                
                team.setGoals_scored(goals_scored);
                team.setGoals_conceded(goals_conceded);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadStandings() {

        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/standings.json");
        standingsJsonToData(json);
    }
}
