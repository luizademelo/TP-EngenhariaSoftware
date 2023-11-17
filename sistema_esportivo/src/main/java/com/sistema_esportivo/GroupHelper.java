package com.sistema_esportivo;

import static com.sistema_esportivo.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GroupHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Group> groups = new ArrayList<>();

    private static void groupsJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode groupsArray = jsonArray.get("data");

            for (JsonNode element : groupsArray) {
                String title = element.get("group").asText();
                JsonNode teamsArray = element.get("teams");
                List<String> teams = new ArrayList<>(); 
                for(JsonNode team : teamsArray){
                    teams.add(team.asText()); 
                }

                Group group = new Group(title, teams);
                groups.add(group);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de grupos");
        }
    }

    public static void loadAllgroups() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/groups.json");
        groupsJsonToList(json);
    }

    public static void printAllgroups() {
        for (Group group : groups) {
            print(group.toString());
            printLine();
        }
    }
}
