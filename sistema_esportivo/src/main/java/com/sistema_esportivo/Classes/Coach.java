package com.sistema_esportivo.Classes;

import com.sistema_esportivo.Basics.BasicPerson;

public class Coach extends BasicPerson {

    private String coachingTeamSince;
    private String titlesWon;
    private String nationalTeam;

    public Coach(String name, String age, String nationality, String coachingSince, String titles, String team) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.coachingTeamSince = coachingSince;
        this.titlesWon = titles;
        this.nationalTeam = team;
    }

    public String getCoachingTeamSince() { return this.coachingTeamSince; }
    public void setCoachingTeamSince(String coachingSince) { this.coachingTeamSince = coachingSince; }

    public String getTitlesWon() { return this.titlesWon; }
    public void setTitlesWon(String titles) { this.titlesWon = titles; }
    public String getNationalTeam() { return this.nationalTeam; }
    public void setNationalTeam(String team) { this.nationalTeam = team; }

    @Override
    public String toString() {
        return  "   Nome do Técnico: " + name + '\n' +
                "   Idade: " + age + '\n' +
                "   Nacionalidade: " + nationality + '\n' +
                "   Treinador da Seleção desde: " + coachingTeamSince + '\n' +
                "   Títulos Vencidos: " + titlesWon;
    }

}
