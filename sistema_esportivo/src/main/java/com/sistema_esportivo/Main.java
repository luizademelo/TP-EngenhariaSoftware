package com.sistema_esportivo;



public class Main{

    public static void main(String[] args){

        TeamHelper.loadAllTeams(); 
        MatchHelper.loadAllMatches(); 
        StandingsHelper.loadStandings();
        StadiumHelper.loadAllStadiums();
        RuleHelper.loadAllrules();
        GroupHelper.loadAllgroups();
        PlayerHelper.loadAllPlayers();
        MenuScreens.initialMenu();
    }
}