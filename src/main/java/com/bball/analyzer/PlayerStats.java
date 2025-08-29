package com.bball.analyzer;

public class PlayerStats {
    private String playerName;

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

    public PlayerStats(String playerName) {
        this.playerName = playerName;

        // ADDED BY ME
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
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
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        // ADDED BY ME
    }

    // --- Getters ---
    public String getPlayerName() { return playerName; }
    public int getPoints() { return points; }
    public int getFGA() { return fga; }
    public int getFGM() { return fgm; }
    public int getThreePA() { return threePA; }
    public int getThreePM() { return threePM; }
    public int getFTA() { return fta; }
    public int getFTM() { return ftm; }
    public int getTRB() { return trb; }
    public int getORB() { return orb; }
    public int getDRB() { return drb; }
    public int getAssists() { return assists; }
    public int getSteals() { return steals; }
    public int getBlocks() { return blocks; }
    public int getTurnovers() { return turnovers; }
    public int getFouls() { return fouls; }
    public int getMinutes() { return minutes; }

    // Percentages (computed on the fly)
    public double getFGPercent() {
        return fga == 0 ? 0.0 : (double) fgm / fga * 100.0;
    }

    public double getThreePPercent() {
        return threePA == 0 ? 0.0 : (double) threePM / threePA * 100.0;
    }

    public double getFTPercent() {
        return fta == 0 ? 0.0 : (double) ftm / fta * 100.0;
    }

    // --- Update Methods ---
    public void addPoints(int value) { this.points += value; }

    public void addShotAttempt(boolean made, boolean isThree) {
        fga++;
        if (made) {
            fgm++;
            addPoints(isThree ? 3 : 2);
        }
        if (isThree) {
            threePA++;
            if (made) threePM++;
        }
    }

    public void addFreeThrow(boolean made) {
        fta++;
        if (made) {
            ftm++;
            addPoints(1);
        }
    }

    public void addRebound(boolean offensive) {
        trb++;
        if (offensive) orb++;
        else drb++;
    }

    public void addAssist() { assists++; }
    public void addSteal() { steals++; }
    public void addBlock() { blocks++; }
    public void addTurnover() { turnovers++; }
    public void addFoul() { fouls++; }

    public void addMinutes(int min) { minutes += min; }

    @Override
    public String toString() {
        return playerName + " -> Pts: " + points +
                ", FGM/FGA: " + fgm + "/" + fga +
                ", 3PM/3PA: " + threePM + "/" + threePA +
                ", FTM/FTA: " + ftm + "/" + fta +
                ", Reb: " + trb + " (ORB: " + orb + ", DRB: " + drb + ")" +
                ", Ast: " + assists +
                ", TO: " + turnovers +
                ", PF: " + fouls +
                String.format(" | FG%%: %.1f, 3P%%: %.1f, FT%%: %.1f",
                        getFGPercent(), getThreePPercent(), getFTPercent());
    }
}
