package com.sistema_esportivo;

import static com.sistema_esportivo.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RuleHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Rule> rules = new ArrayList<>();

    private static void rulesJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode rulesArray = jsonArray.get("data");

            for (JsonNode element : rulesArray) {
                String title = element.get("titulo").asText();
                String description = element.get("descricao").asText();

                Rule rule = new Rule(title, description);
                rules.add(rule);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de estádios");
        }
    }

    public static void loadAllrules() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/rules.json");
        rulesJsonToList(json);
    }

    public static void printAllrules() {
        for (Rule rule : rules) {
            print(rule.toString());
            printLine();
        }
    }
}
