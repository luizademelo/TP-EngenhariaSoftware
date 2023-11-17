package com.sistema_esportivo;


import com.sistema_esportivo.Helpers.*;
import com.sistema_esportivo.Utils.MenuScreens;

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