package com.sistema_esportivo.Helpers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema_esportivo.Classes.Coach;
import com.sistema_esportivo.Classes.Team;

import static com.sistema_esportivo.Utils.IOMethods.print;

public class CoachHelper {

    private static final ObjectMapper mapper = new ObjectMapper();

    private static void coachesJsonToData(String json) {
        try {

            JsonNode jsonArray = mapper.readTree(json);
            JsonNode dataArray = jsonArray.get("data");

            for (JsonNode data : dataArray) {

                String teamName = data.get("nationalTeam").asText();
                Team team = TeamHelper.getTeamByName(teamName);

                String name = data.get("name").asText();
                String age = data.get("age").asText();
                String nationality = data.get("nationality").asText();
                String coachingSince = data.get("coachingSince").asText();
                String titlesWon = data.get("titlesWon").asText();

                Coach coach = new Coach(name, age, nationality, coachingSince, titlesWon, teamName);

                team.setCoach(coach);
            }

        } catch (Exception e) {
            e.printStackTrace();
            print("Não foi possível ler o arquivo de técnicos");
        }
    }
    public static void loadAllCoaches(){

        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/coaches.json");
        coachesJsonToData(json);
    }

}
