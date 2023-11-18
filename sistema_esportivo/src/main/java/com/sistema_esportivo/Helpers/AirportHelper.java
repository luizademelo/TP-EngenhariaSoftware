package com.sistema_esportivo.Helpers;

import static com.sistema_esportivo.Utils.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema_esportivo.Classes.Airport;

public class AirportHelper {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Airport> airports = new ArrayList<>();

    private static void airportsJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode stadiumsArray = jsonArray.get("data");

            for (JsonNode element : stadiumsArray) {
                String airportName = element.get("Airport").asText();
                String city = element.get("City").asText();
                String icaoCode = element.get("ICAO").asText();


                Airport airport = new Airport(airportName, city, icaoCode);
                airports.add(airport);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de estádios");
        }
    }

    public static void loadAllAirports() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/airports.json");
        airportsJsonToList(json);
    }

    public static void printAllAirports() {
        for (Airport airport : airports) {
            print(airport.toString());
            printLine();
        }
    }

}
