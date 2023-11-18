package com.sistema_esportivo.Classes;

import com.sistema_esportivo.Basics.BasicLocation;

public class Hotel extends BasicLocation {

    private String stars;
    private String price;

    public Hotel(String hotelName, String city, String stars, String price) {
        this.name = hotelName;
        this.city = city;
        this.stars = stars;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "   Nome do Hotel: " + name + '\n' +
                "   Cidade: " + city + '\n' +
                "   Avaliação (0-5 Estrelas): " + stars + '\n' +
                "   Preço da Diária: " + price + '\n';
    }

    public String getStars() { return this.stars; }
    public void setStars(String stars) { this.stars = stars; }

    public String getPrice() { return this.price; }
    public void setPrice(String price) { this.price = price; }
}
