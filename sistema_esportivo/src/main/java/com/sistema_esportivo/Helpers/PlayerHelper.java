package com.sistema_esportivo.Helpers;

import static com.sistema_esportivo.Utils.IOMethods.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema_esportivo.Classes.Player;

public class PlayerHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Player> players = new ArrayList<>();
    private static Map<String, List<Player>> nationalTeams = new HashMap<String, List<Player>>();

    private static void playersJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode nations = jsonArray.get("data");
            for(JsonNode nationElement : nations) {
                String nation = nationElement.get("nationalTeam").asText();
                JsonNode players = nationElement.get("players");
                List<Player> allPlayers = new ArrayList<>();
                for(JsonNode playersElement : players) {
                    String name = playersElement.get("name").asText();
                    String age = playersElement.get("age").asText();
                    String nationality = playersElement.get("nationality").asText();
                    String position = playersElement.get("position").asText();
                    String club = playersElement.get("club").asText();
                    String shirtNumber = playersElement.get("shirtNumber").asText();
                    String goalsScored = playersElement.get("goalsScored").asText();
                    String assists = playersElement.get("assists").asText();

                    Player p = new Player(name, age, nationality, position, club, shirtNumber, goalsScored, assists);
                    allPlayers.add(p);
                }

                nationalTeams.put(nation, allPlayers);
            }
        } catch (Exception e) {
            e.printStackTrace();
            print("Não foi possível ler o arquivo de jogadores");
        }
    }

    public static void loadAllPlayers() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/player.json");
        playersJsonToList(json);
    }

    public static void printAllPlayers() {
        for (Map.Entry<String, List<Player>> map : nationalTeams.entrySet()) {
            print(map.getKey());
            printLine();
            for(Player p : map.getValue())
                print(p.toString());
        }
    }
}
