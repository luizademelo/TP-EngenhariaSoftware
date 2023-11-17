package com.sistema_esportivo;

public class Team {
    private String id;
    private String name;
    private String stadium;
    private String location;
    private int rank;
    private int goals_scored;
    private int goals_conceded;

    public Team() {
        super();
    }

    public Team(String id, String name, String stadium, String location) {
        this.id = id;
        this.name = name;
        this.stadium = stadium;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Nome do time: " + this.name + "\nEstádio: " + this.stadium + "\n"
                + "Gols marcados: " + this.goals_scored + "\n" + "Gols sofridos: " + this.goals_conceded + "\n";
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getStadium() {
        return this.stadium;
    }

    public String getLocation() {
        return this.location;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public void setGoals_conceded(int goals_conceded) {
        this.goals_conceded = goals_conceded;
    }
}