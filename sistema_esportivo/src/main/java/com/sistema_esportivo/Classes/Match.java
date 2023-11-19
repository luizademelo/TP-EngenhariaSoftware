package com.sistema_esportivo.Classes;


public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private String score; 

    public Match(Team home, Team away, String score){
        this.homeTeam = home;
        this.awayTeam = away;
        this.score = score; 
    }

    @Override
    public String toString(){
        return "Informações da Partida:\n" + "Time da casa: " + homeTeam.getName() +
        "\nTime Visitante: " + awayTeam.getName() +
        "\nPlacar Final: " + this.score; 
    }
    
    public Team getHomeTeam(){
        return this.homeTeam;
    }

    public Team getAwayTeam(){
        return this.awayTeam;
    }

    public String getScore(){
        return this.score; 
    }
}
