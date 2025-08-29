package com.bball.analyzer;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private ArrayList<String> playerList = new ArrayList<>();   // keeps track of player objects already created

    // Scoring
    private int points;
    private int fga;   // Field Goal Attempts (includes 2-pt + 3-pt shots)
    private int fgm;   // Field Goals Made
    private int threePA;
    private int threePM;
    private int fta;   // Free Throw Attempts
    private int ftm;   // Free Throws Made

    // Rebounds
    private int trb;   // Total rebounds
    private int orb;   // Offensive rebounds
    private int drb;   // Defensive rebounds

    // Other stats
    private int assists;
    private int steals;
    private int blocks;
    private int turnovers;
    private int fouls;

    // Playing time
    private int minutes;   // Will require clock/sub tracking later

    public Player(String playerName) {
        this.playerName = playerName;
        this.points = 0;
        this.fga = 0;
        this.fgm = 0;
        this.threePA = 0;
        this.threePM = 0;
        this.fta = 0;
        this.ftm = 0;
        this.trb = 0;
        this.orb = 0;
        this.drb = 0;
        this.assists = 0;
        this.steals = 0;
        this.blocks = 0;
        this.turnovers = 0;
        this.fouls = 0;
        this.minutes = 0;

        playerList.add(playerName);
    }

    // Getter
    public ArrayList<String> getPlayerList() { return playerList; }
}
