package com.sistema_esportivo;

import com.sistema_esportivo.Basics.BasicPerson;

public class Player extends BasicPerson {

    private String position;
    private String club;
    private String shirtNumber;
    private String goalsScored;
    private String assists;

    public Player(String name, String age, String nationality, String position, String club, String shirtNumber, String goalsScored, String assists) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.club = club;
        this.shirtNumber = shirtNumber;
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    public String getPosition() { return this.position; }
    public void setPosition(String position) { this.position = position; }
    public String getClub() { return this.club; }
    public void setClub(String club) { this.club = club; }
    public String getShirtNumber() { return this.shirtNumber; }
    public void setShirtNumber(String number) { this.shirtNumber = number; }
    public String getGoalsScored() { return this.goalsScored; }
    public void setGoalsScored(String goals) { this.goalsScored = goals; }
    public String getAssists() { return this.assists; }
    public void setAssists(String assists) { this.assists = assists; }


    @Override
    public String toString() {
        return  "   Nome do Jogador: " + name + '\n' +
                "   Idade: " + age + '\n' +
                "   Nacionalidade: " + nationality + '\n' +
                "   Clube: " + club + '\n' +
                "   Posição: " + position + '\n' +
                "   Número da Camisa: " + shirtNumber + '\n' +
                "   Gols Marcados: " + goalsScored + '\n' +
                "   Assistências: " + assists + '\n';
    }
}
