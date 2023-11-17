package com.sistema_esportivo.Classes;

import com.sistema_esportivo.Basics.BasicLocation;

public class Stadium extends BasicLocation {

    private String capacity;

    public Stadium(String city, String stadium_name, String capacity) {
        this.city = city;
        this.name = stadium_name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  "Nome do Estádio: " + name + '\n' +
                "Cidade: " + city + '\n' +
                "Capacidade:" + capacity + '\n'; 
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
