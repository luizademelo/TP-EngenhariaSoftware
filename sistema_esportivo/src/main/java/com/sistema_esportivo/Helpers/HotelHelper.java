package com.sistema_esportivo.Helpers;

import static com.sistema_esportivo.Utils.IOMethods.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema_esportivo.Classes.Hotel;

public class HotelHelper {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Hotel> hotels = new ArrayList<>();

    private static void hotelsJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode stadiumsArray = jsonArray.get("data");

            for (JsonNode element : stadiumsArray) {
                String city = element.get("City").asText();
                String hotelName = element.get("Hotel").asText();
                String stars = element.get("Stars").asText();
                String price = element.get("Price").asText();

                Hotel hotel = new Hotel(hotelName, city, stars, price);
                hotels.add(hotel);
            }

        } catch (Exception e) {
            e.printStackTrace();
            print("Não foi possível ler o arquivo de hotéis");
        }
    }

    public static void loadAllHotels() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/hotels.json");
        hotelsJsonToList(json);
    }

    public static void printAllHotels() {
        for (Hotel hotel : hotels) {
            print(hotel.toString());
            printLine();
        }
    }
}
