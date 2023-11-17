package com.sistema_esportivo;

import static com.sistema_esportivo.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PlayerHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Player> players = new ArrayList<>();

    private static void playersJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode playersArray = jsonArray.get("data");
            for(JsonNode element : playersArray) {
                String name = element.get("name").asText();
                String age = element.get("age").asText();
                String nationality = element.get("nationality").asText();
                String position = element.get("position").asText();
                String club = element.get("club").asText();
                String shirtNumber = element.get("shirtNumber").asText();
                String goalsScored = element.get("goalsScored").asText();
                String assists = element.get("assists").asText();

                Player p = new Player(name, age, nationality, position, club, shirtNumber, goalsScored, assists);
                players.add(p);
                }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de jogadores");
        }
    }

    public static void loadAllPlayers() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/player.json");
        playersJsonToList(json);
    }

    public static void printAllPlayers() {
        for (Player p : players) {
            print(p.toString());

        }
    }
}
