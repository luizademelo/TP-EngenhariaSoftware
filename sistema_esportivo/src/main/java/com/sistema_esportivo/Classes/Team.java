package com.sistema_esportivo.Classes;

public class Team {
    private String id;
    private String name;
    private Coach coach;
    private String stadium;
    private String location;
    private int goalsScored;
    private int goalsConceded;

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
        return  "Nome do Time: " + this.name + "\n" +
                "Informações do Técnico: " + "\n" + this.coach.toString() + "\n" +
                "Estádio: " + this.stadium + "\n" +
                "Gols marcados: " + this.goalsScored + "\n" +
                "Gols sofridos: " + this.goalsConceded + "\n";
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
    public Coach getCoach() { return this.coach; }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }
    public void setCoach(Coach c) { this.coach = c; }
}