package com.sistema_esportivo.Classes;

import com.sistema_esportivo.Basics.BasicLocation;

public class Airport extends BasicLocation {

    private String icaoCode;

    public Airport(String airportName, String city, String code) {
        this.name = airportName;
        this.city = city;
        this.icaoCode = code;
    }

    @Override
    public String toString() {
        return  "   Nome do Aeroporto: " + name + '\n' +
                "   Cidade: " + city + '\n' +
                "   Código ICAO: " + icaoCode + '\n';
    }
    public String getIcaoCode() { return this.icaoCode; }
    public void setIcaoCode(String icao) { this.icaoCode = icao; }

}
