package com.sistema_esportivo.Basics;

public class BasicLocation {

    protected String name;
    protected String city;

    @Override
    public String toString() {
        return  "   Nome do Local: " + name + '\n' +
                "   Cidade: " + city + '\n';
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String stadium_name) {
        this.name = stadium_name;
    }

}
