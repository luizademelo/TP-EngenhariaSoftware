package com.sistema_esportivo;

import java.util.List;

public class Group {
    
    private String group;
    private List<String> teams;

    public Group(String group, List<String> teams){
        this.group = group; 
        this.teams = teams;
    }

    public String toString(){
        return this.group + "\nTimes do grupo: \n" + this.teams.toString() + "\n";  
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<String> getTeams() {
        return this.teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

}
