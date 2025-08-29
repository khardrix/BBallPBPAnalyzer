package com.bball.analyzer;

public class Game {
    // Core metadata
    private String opponent;                        // OPNT
    private String date;                            // DATE (MMDDYYYY as string)
    private int location;                           // LCTN (1 = home, -1 = away)
    private int result;                             // RSLT (1 = win, -1 = loss)

    // Final scores
    private int teamScore;                          // TMSC
    private int opponentScore;                      // OPSC
    private int combinedScore;                      // CMSC
    private int differential;                       // FGDF

    // Full game time splits
    private double fullGameTeamLead;                // FGTL
    private double fullGameOpponentLead;            // FGOL
    private double fullGameTied;                    // FGTT

    // 1st quarter
    private int firstQuarterResult;                 // 1QRT
    private int firstQuarterTeamScore;              // 1QTS
    private int firstQuarterOpponentScore;          // 1QOS
    private int firstQuarterCombinedScore;          // 1QCS
    private int firstQuarterDifferential;           // 1QDF
    private double firstQuarterTeamLead;            // 1QTL
    private double firstQuarterOpponentLead;        // 1QOL
    private double firstQuarterTied;                // 1QTT

    // 2nd quarter
    private int secondQuarterResult;                // 2QRT
    private int secondQuarterTeamScore;             // 2QTS
    private int secondQuarterOpponentScore;         // 2QOS
    private int secondQuarterCombinedScore;         // 2QCS
    private int secondQuarterDifferential;          // 2QDF
    private double secondQuarterTeamLead;           // 2QTL
    private double secondQuarterOpponentLead;       // 2QOL
    private double secondQuarterTied;               // 2QTT

    // 3rd quarter
    private int thirdQuarterResult;                 // 3QRT
    private int thirdQuarterTeamScore;              // 3QTS
    private int thirdQuarterOpponentScore;          // 3QOS
    private int thirdQuarterCombinedScore;          // 3QCS
    private int thirdQuarterDifferential;           // 3QDF
    private double thirdQuarterTeamLead;            // 3QTL
    private double thirdQuarterOpponentLead;        // 3QOL
    private double thirdQuarterTied;                // 3QTT

    // 4th quarter
    private int fourthQuarterResult;                // 4QRT
    private int fourthQuarterTeamScore;             // 4QTS
    private int fourthQuarterOpponentScore;         // 4QOS
    private int fourthQuarterCombinedScore;         // 4QCS
    private int fourthQuarterDifferential;          // 4QDF
    private double fourthQuarterTeamLead;           // 4QTL
    private double fourthQuarterOpponentLead;       // 4QOL
    private double fourthQuarterTied;               // 4QTT

    // 1st half
    private int firstHalfResult;                    // 1HRT
    private int firstHalfTeamScore;                 // 1HTS
    private int firstHalfOpponentScore;             // 1HOS
    private int firstHalfCombinedScore;             // 1HCS
    private int firstHalfDifferential;              // 1HDF
    private double firstHalfTeamLead;               // 1HTL
    private double firstHalfOpponentLead;           // 1HOL
    private double firstHalfTied;                   // 1HTT

    // 2nd half
    private int secondHalfResult;                   // 2HRT
    private int secondHalfTeamScore;                // 2HTS
    private int secondHalfOpponentScore;            // 2HOS
    private int secondHalfCombinedScore;            // 2HCS
    private int secondHalfDifferential;             // 2HDF
    private double secondHalfTeamLead;              // 2HTL
    private double secondHalfOpponentLead;          // 2HOL
    private double secondHalfTied;                  // 2HTT


    // --- Constructors, getters, setters ---
    public Game(String opponent, String date, int location, int result,
                int teamScore, int opponentScore, int combinedScore, int differential,
                double fullGameTeamLead, double fullGameOpponentLead, double fullGameTied,
                int firstQuarterResult, int firstQuarterTeamScore, int firstQuarterOpponentScore,
                int firstQuarterCombinedScore, int firstQuarterDifferential,
                double firstQuarterTeamLead, double firstQuarterOpponentLead, double firstQuarterTied,
                int secondQuarterResult, int secondQuarterTeamScore, int secondQuarterOpponentScore,
                int secondQuarterCombinedScore, int secondQuarterDifferential, double secondQuarterTeamLead,
                double secondQuarterOpponentLead, double secondQuarterTied, int thirdQuarterResult,
                int thirdQuarterTeamScore, int thirdQuarterOpponentScore, int thirdQuarterCombinedScore,
                int thirdQuarterDifferential, double thirdQuarterTeamLead, double thirdQuarterOpponentLead,
                double thirdQuarterTied, int fourthQuarterResult, int fourthQuarterTeamScore,
                int fourthQuarterOpponentScore, int fourthQuarterCombinedScore, int fourthQuarterDifferential,
                double fourthQuarterTeamLead, double fourthQuarterOpponentLead, double fourthQuarterTied,
                int firstHalfResult, int firstHalfTeamScore, int firstHalfOpponentScore,
                int firstHalfCombinedScore, int firstHalfDifferential, double firstHalfTeamLead,
                double firstHalfOpponentLead, double firstHalfTied, int secondHalfResult,
                int secondHalfTeamScore, int secondHalfOpponentScore, int secondHalfCombinedScore,
                int secondHalfDifferential, double secondHalfTeamLead, double secondHalfOpponentLead,
                double secondHalfTied) {
        this.opponent = opponent;
        this.date = date;
        this.location = location;
        this.result = result;
        this.teamScore = teamScore;
        this.opponentScore = opponentScore;
        this.combinedScore = combinedScore;
        this.differential = differential;
        this.fullGameTeamLead = fullGameTeamLead;
        this.fullGameOpponentLead = fullGameOpponentLead;
        this.fullGameTied = fullGameTied;
        this.firstQuarterResult = firstQuarterResult;
        this.firstQuarterTeamScore = firstQuarterTeamScore;
        this.firstQuarterOpponentScore = firstQuarterOpponentScore;
        this.firstQuarterCombinedScore = firstQuarterCombinedScore;
        this.firstQuarterDifferential = firstQuarterDifferential;
        this.firstQuarterTeamLead = firstQuarterTeamLead;
        this.firstQuarterOpponentLead = firstQuarterOpponentLead;
        this.firstQuarterTied = firstQuarterTied;
        this.secondQuarterResult = secondQuarterResult;
        this.secondQuarterTeamScore = secondQuarterTeamScore;
        this.secondQuarterOpponentScore = secondQuarterOpponentScore;
        this.secondQuarterCombinedScore = secondQuarterCombinedScore;
        this.secondQuarterDifferential = secondQuarterDifferential;
        this.secondQuarterTeamLead = secondQuarterTeamLead;
        this.secondQuarterOpponentLead = secondQuarterOpponentLead;
        this.secondQuarterTied = secondQuarterTied;
        this.thirdQuarterResult = thirdQuarterResult;
        this.thirdQuarterTeamScore = thirdQuarterTeamScore;
        this.thirdQuarterOpponentScore = thirdQuarterOpponentScore;
        this.thirdQuarterCombinedScore = thirdQuarterCombinedScore;
        this.thirdQuarterDifferential = thirdQuarterDifferential;
        this.thirdQuarterTeamLead = thirdQuarterTeamLead;
        this.thirdQuarterOpponentLead = thirdQuarterOpponentLead;
        this.thirdQuarterTied = thirdQuarterTied;
        this.fourthQuarterResult = fourthQuarterResult;
        this.fourthQuarterTeamScore = fourthQuarterTeamScore;
        this.fourthQuarterOpponentScore = fourthQuarterOpponentScore;
        this.fourthQuarterCombinedScore = fourthQuarterCombinedScore;
        this.fourthQuarterDifferential = fourthQuarterDifferential;
        this.fourthQuarterTeamLead = fourthQuarterTeamLead;
        this.fourthQuarterOpponentLead = fourthQuarterOpponentLead;
        this.fourthQuarterTied = fourthQuarterTied;
        this.firstHalfResult = firstHalfResult;
        this.firstHalfTeamScore = firstHalfTeamScore;
        this.firstHalfOpponentScore = firstHalfOpponentScore;
        this.firstHalfCombinedScore = firstHalfCombinedScore;
        this.firstHalfDifferential = firstHalfDifferential;
        this.firstHalfTeamLead = firstHalfTeamLead;
        this.firstHalfOpponentLead = firstHalfOpponentLead;
        this.firstHalfTied = firstHalfTied;
        this.secondHalfResult = secondHalfResult;
        this.secondHalfTeamScore = secondHalfTeamScore;
        this.secondHalfOpponentScore = secondHalfOpponentScore;
        this.secondHalfCombinedScore = secondHalfCombinedScore;
        this.secondHalfDifferential = secondHalfDifferential;
        this.secondHalfTeamLead = secondHalfTeamLead;
        this.secondHalfOpponentLead = secondHalfOpponentLead;
        this.secondHalfTied = secondHalfTied;
    }


    // Getters
    public String getOpponent() { return opponent; }
    public String getDate() { return date; }
    public int getLocation() { return location; }
    public int getResult() { return result; }
    public int getTeamScore() { return teamScore; }
    public int getOpponentScore() { return opponentScore; }
    public int getCombinedScore() { return combinedScore; }
    public int getDifferential() { return differential; }
    public double getFullGameTeamLead() { return fullGameTeamLead; }
    public double getFullGameOpponentLead() { return fullGameOpponentLead; }
    public double getFullGameTied() { return fullGameTied; }
    public int getFirstQuarterResult() { return firstQuarterResult; }
    public int getFirstQuarterTeamScore() { return firstQuarterTeamScore; }
    public int getFirstQuarterOpponentScore() { return firstQuarterOpponentScore; }
    public int getFirstQuarterCombinedScore() { return firstQuarterCombinedScore; }
    public int getFirstQuarterDifferential() { return firstQuarterDifferential; }
    public double getFirstQuarterTeamLead() { return firstQuarterTeamLead; }
    public double getFirstQuarterOpponentLead() { return firstQuarterOpponentLead; }
    public double getFirstQuarterTied() { return firstQuarterTied; }
    public int getSecondQuarterResult() { return secondQuarterResult; }
    public int getSecondQuarterTeamScore() { return secondQuarterTeamScore; }
    public int getSecondQuarterOpponentScore() { return secondQuarterOpponentScore; }
    public int getSecondQuarterCombinedScore() { return secondQuarterCombinedScore; }
    public int getSecondQuarterDifferential() { return secondQuarterDifferential; }
    public double getSecondQuarterTeamLead() { return secondQuarterTeamLead; }
    public double getSecondQuarterOpponentLead() { return secondQuarterOpponentLead; }
    public double getSecondQuarterTied() { return secondQuarterTied; }
    public int getThirdQuarterResult() { return thirdQuarterResult; }
    public int getThirdQuarterTeamScore() { return thirdQuarterTeamScore; }
    public int getThirdQuarterOpponentScore() { return thirdQuarterOpponentScore; }
    public int getThirdQuarterCombinedScore() { return thirdQuarterCombinedScore; }
    public int getThirdQuarterDifferential() { return thirdQuarterDifferential; }
    public double getThirdQuarterTeamLead() { return thirdQuarterTeamLead; }
    public double getThirdQuarterOpponentLead() { return thirdQuarterOpponentLead; }
    public double getThirdQuarterTied() { return thirdQuarterTied; }
    public int getFourthQuarterResult() { return fourthQuarterResult; }
    public int getFourthQuarterTeamScore() { return fourthQuarterTeamScore; }
    public int getFourthQuarterOpponentScore() { return fourthQuarterOpponentScore; }
    public int getFourthQuarterCombinedScore() { return fourthQuarterCombinedScore; }
    public int getFourthQuarterDifferential() { return fourthQuarterDifferential; }
    public double getFourthQuarterTeamLead() { return fourthQuarterTeamLead; }
    public double getFourthQuarterOpponentLead() { return fourthQuarterOpponentLead; }
    public double getFourthQuarterTied() { return fourthQuarterTied; }
    public int getFirstHalfResult() { return firstHalfResult; }
    public int getFirstHalfTeamScore() { return firstHalfTeamScore; }
    public int getFirstHalfOpponentScore() { return firstHalfOpponentScore; }
    public int getFirstHalfCombinedScore() { return firstHalfCombinedScore; }
    public int getFirstHalfDifferential() { return firstHalfDifferential; }
    public double getFirstHalfTeamLead() { return firstHalfTeamLead; }
    public double getFirstHalfOpponentLead() { return firstHalfOpponentLead; }
    public double getFirstHalfTied() { return firstHalfTied; }
    public int getSecondHalfResult() { return secondHalfResult; }
    public int getSecondHalfTeamScore() { return secondHalfTeamScore; }
    public int getSecondHalfOpponentScore() { return secondHalfOpponentScore; }
    public int getSecondHalfCombinedScore() { return secondHalfCombinedScore; }
    public int getSecondHalfDifferential() { return secondHalfDifferential; }
    public double getSecondHalfTeamLead() { return secondHalfTeamLead; }
    public double getSecondHalfOpponentLead() { return secondHalfOpponentLead; }
    public double getSecondHalfTied() { return secondHalfTied; }


    // Setters
    public void setOpponent(String opponent) { this.opponent = opponent; }
    public void setDate(String date) { this.date = date; }
    public void setLocation(int location) { this.location = location; }
    public void setResult(int result) { this.result = result; }
    public void setTeamScore(int teamScore) { this.teamScore = teamScore; }
    public void setOpponentScore(int opponentScore) { this.opponentScore = opponentScore; }
    public void setCombinedScore(int combinedScore) { this.combinedScore = combinedScore; }
    public void setDifferential(int differential) { this.differential = differential; }
    public void setFullGameTeamLead(double fullGameTeamLead) { this.fullGameTeamLead = fullGameTeamLead; }
    public void setFullGameOpponentLead(double fullGameOpponentLead) {
        this.fullGameOpponentLead = fullGameOpponentLead; }
    public void setFullGameTied(double fullGameTied) { this.fullGameTied = fullGameTied; }
    public void setFirstQuarterResult(int firstQuarterResult) { this.firstQuarterResult = firstQuarterResult; }
    public void setFirstQuarterTeamScore(int firstQuarterTeamScore) {
        this.firstQuarterTeamScore = firstQuarterTeamScore; }
    public void setFirstQuarterOpponentScore(int firstQuarterOpponentScore) {
        this.firstQuarterOpponentScore = firstQuarterOpponentScore; }
    public void setFirstQuarterCombinedScore(int firstQuarterCombinedScore) {
        this.firstQuarterCombinedScore = firstQuarterCombinedScore; }
    public void setFirstQuarterDifferential(int firstQuarterDifferential) {
        this.firstQuarterDifferential = firstQuarterDifferential; }
    public void setFirstQuarterTeamLead(double firstQuarterTeamLead) {
        this.firstQuarterTeamLead = firstQuarterTeamLead; }
    public void setFirstQuarterOpponentLead(double firstQuarterOpponentLead) {
        this.firstQuarterOpponentLead = firstQuarterOpponentLead; }
    public void setFirstQuarterTied(double firstQuarterTied) { this.firstQuarterTied = firstQuarterTied; }
    public void setSecondQuarterResult(int secondQuarterResult) { this.secondQuarterResult = secondQuarterResult; }
    public void setSecondQuarterTeamScore(int secondQuarterTeamScore) {
        this.secondQuarterTeamScore = secondQuarterTeamScore; }
    public void setSecondQuarterOpponentScore(int secondQuarterOpponentScore) {
        this.secondQuarterOpponentScore = secondQuarterOpponentScore; }
    public void setSecondQuarterCombinedScore(int secondQuarterCombinedScore) {
        this.secondQuarterCombinedScore = secondQuarterCombinedScore; }
    public void setSecondQuarterDifferential(int secondQuarterDifferential) {
        this.secondQuarterDifferential = secondQuarterDifferential; }
    public void setSecondQuarterTeamLead(double secondQuarterTeamLead) {
        this.secondQuarterTeamLead = secondQuarterTeamLead; }
    public void setSecondQuarterOpponentLead(double secondQuarterOpponentLead) {
        this.secondQuarterOpponentLead = secondQuarterOpponentLead; }
    public void setSecondQuarterTied(double secondQuarterTied) { this.secondQuarterTied = secondQuarterTied; }
    public void setThirdQuarterResult(int thirdQuarterResult) { this.thirdQuarterResult = thirdQuarterResult; }
    public void setThirdQuarterTeamScore(int thirdQuarterTeamScore) {
        this.thirdQuarterTeamScore = thirdQuarterTeamScore; }
    public void setThirdQuarterOpponentScore(int thirdQuarterOpponentScore) {
        this.thirdQuarterOpponentScore = thirdQuarterOpponentScore; }
    public void setThirdQuarterCombinedScore(int thirdQuarterCombinedScore) {
        this.thirdQuarterCombinedScore = thirdQuarterCombinedScore; }
    public void setThirdQuarterDifferential(int thirdQuarterDifferential) {
        this.thirdQuarterDifferential = thirdQuarterDifferential; }
    public void setThirdQuarterTeamLead(double thirdQuarterTeamLead) {
        this.thirdQuarterTeamLead = thirdQuarterTeamLead; }
    public void setThirdQuarterOpponentLead(double thirdQuarterOpponentLead) {
        this.thirdQuarterOpponentLead = thirdQuarterOpponentLead; }
    public void setThirdQuarterTied(double thirdQuarterTied) { this.thirdQuarterTied = thirdQuarterTied; }
    public void setFourthQuarterResult(int fourthQuarterResult) { this.fourthQuarterResult = fourthQuarterResult; }
    public void setFourthQuarterTeamScore(int fourthQuarterTeamScore) {
        this.fourthQuarterTeamScore = fourthQuarterTeamScore; }
    public void setFourthQuarterOpponentScore(int fourthQuarterOpponentScore) {
        this.fourthQuarterOpponentScore = fourthQuarterOpponentScore; }
    public void setFourthQuarterCombinedScore(int fourthQuarterCombinedScore) {
        this.fourthQuarterCombinedScore = fourthQuarterCombinedScore; }
    public void setFourthQuarterDifferential(int fourthQuarterDifferential) {
        this.fourthQuarterDifferential = fourthQuarterDifferential; }
    public void setFourthQuarterTeamLead(double fourthQuarterTeamLead) {
        this.fourthQuarterTeamLead = fourthQuarterTeamLead; }
    public void setFourthQuarterOpponentLead(double fourthQuarterOpponentLead) {
        this.fourthQuarterOpponentLead = fourthQuarterOpponentLead; }
    public void setFourthQuarterTied(double fourthQuarterTied) { this.fourthQuarterTied = fourthQuarterTied; }
    public void setFirstHalfResult(int firstHalfResult) { this.firstHalfResult = firstHalfResult; }
    public void setFirstHalfTeamScore(int firstHalfTeamScore) { this.firstHalfTeamScore = firstHalfTeamScore; }
    public void setFirstHalfOpponentScore(int firstHalfOpponentScore) {
        this.firstHalfOpponentScore = firstHalfOpponentScore; }
    public void setFirstHalfCombinedScore(int firstHalfCombinedScore) {
        this.firstHalfCombinedScore = firstHalfCombinedScore; }
    public void setFirstHalfDifferential(int firstHalfDifferential) {
        this.firstHalfDifferential = firstHalfDifferential; }
    public void setFirstHalfTeamLead(double firstHalfTeamLead) { this.firstHalfTeamLead = firstHalfTeamLead; }
    public void setFirstHalfOpponentLead(double firstHalfOpponentLead) {
        this.firstHalfOpponentLead = firstHalfOpponentLead; }
    public void setFirstHalfTied(double firstHalfTied) { this.firstHalfTied = firstHalfTied; }
    public void setSecondHalfResult(int secondHalfResult) { this.secondHalfResult = secondHalfResult; }
    public void setSecondHalfTeamScore(int secondHalfTeamScore) { this.secondHalfTeamScore = secondHalfTeamScore; }
    public void setSecondHalfOpponentScore(int secondHalfOpponentScore) {
        this.secondHalfOpponentScore = secondHalfOpponentScore; }
    public void setSecondHalfCombinedScore(int secondHalfCombinedScore) {
        this.secondHalfCombinedScore = secondHalfCombinedScore; }
    public void setSecondHalfDifferential(int secondHalfDifferential) {
        this.secondHalfDifferential = secondHalfDifferential; }
    public void setSecondHalfTeamLead(double secondHalfTeamLead) { this.secondHalfTeamLead = secondHalfTeamLead; }
    public void setSecondHalfOpponentLead(double secondHalfOpponentLead) {
        this.secondHalfOpponentLead = secondHalfOpponentLead; }
    public void setSecondHalfTied(double secondHalfTied) { this.secondHalfTied = secondHalfTied; }
}
