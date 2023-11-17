package com.sistema_esportivo;

import static com.sistema_esportivo.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StadiumHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Stadium> stadiums = new ArrayList<>();

    private static void stadiumsJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode stadiumsArray = jsonArray.get("data");

            for (JsonNode element : stadiumsArray) {
                String city = element.get("City").asText();
                String stadium_name = element.get("Stadium").asText();
                String capacity = element.get("Capacity").asText();


                Stadium stadium = new Stadium(city, stadium_name, capacity);
                stadiums.add(stadium);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de estádios");
        }
    }

    public static void loadAllStadiums() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/stadiums.json");
        stadiumsJsonToList(json);
    }

    public static void printAllStadiums() {
        for (Stadium stadium : stadiums) {
            print(stadium.toString());
            printLine();
        }
    }
}
