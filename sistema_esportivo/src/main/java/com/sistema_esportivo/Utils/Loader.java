package com.sistema_esportivo.Utils;

import com.sistema_esportivo.Helpers.*;

public class Loader {

    public static void loadAllFunctions() {

        TeamHelper.loadAllTeams();
        MatchHelper.loadAllMatches();
        StandingsHelper.loadStandings();
        CoachHelper.loadAllCoaches();
        StadiumHelper.loadAllStadiums();
        RuleHelper.loadAllrules();
        GroupHelper.loadAllgroups();
        PlayerHelper.loadAllPlayers();
        AirportHelper.loadAllAirports();
        HotelHelper.loadAllHotels();
    }
}
