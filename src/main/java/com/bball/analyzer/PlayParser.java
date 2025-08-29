package com.bball.analyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayParser {

    private final Map<String, PlayerStats> playerStatsMap = new HashMap<>();
    private static final Pattern FEET_PATTERN = Pattern.compile("(\\d+)-foot"); // e.g., "26-foot jumper"

    /** Parse one play-by-play line and update player stats. */
    public void parsePlay(String playDescription) {
        if (playDescription == null || playDescription.trim().isEmpty()) return; // Java 8: no isBlank()
        String lower = playDescription.toLowerCase();

        // IMPORTANT: order matters
        if (lower.contains("free throw")) {
            handleFreeThrow(lower);
        } else if (lower.contains("rebound")) {
            handleRebound(lower);
        } else if (lower.contains("turnover")) {
            handleTurnover(lower);
        } else if (lower.contains("makes") || lower.contains("misses")) { // field goals (NOT free throws)
            handleFieldGoal(lower);
        } else if (lower.contains("foul")) {
            handleFoul(lower);
        }
        // (We’ll add assists, blocks-on-shot, substitutions, etc. once we see your exact PBP format.)
    }

    // ---- Handlers ----

    /** Field goals: detects distance (>=22ft = 3PT in WNBA) and common shot keywords. */
    private void handleFieldGoal(String text) {
        if (text.contains("free throw")) return; // guard, though parse order already prevents this

        String scorer = extractLeadingName(text);
        boolean made = text.contains("makes");

        // Explicit 3PT markers
        if (containsAny(text, "3-pt", "3pt", "three-pointer", "three point")) {
            getStats(scorer).addShotAttempt(made, true);
            return;
        }

        // Distance-based shot
        Integer feet = extractDistanceFeet(text);
        if (feet != null) {
            boolean isThree = feet >= 22;
            getStats(scorer).addShotAttempt(made, isThree);
            return;
        }

        // Common 2PT shot descriptors (assume 2 unless explicitly 3 or distance says 3)
        if (containsAny(text, "layup", "dunk", "hook", "fadeaway", "tip", "jumper", "runner", "floater")) {
            getStats(scorer).addShotAttempt(made, false);
        }
    }

    /** Free throws: increments FTA, and FTM/points if made. */
    private void handleFreeThrow(String text) {
        String shooter = extractLeadingName(text);
        boolean made = text.contains("makes");
        getStats(shooter).addFreeThrow(made);
    }

    /** Rebounds: tries to distinguish ORB/DRB; skips team rebounds for now. */
    private void handleRebound(String text) {
        String player = extractLeadingName(text);
        if ("team".equals(player)) return; // skip team rebounds here (optional: track separately)
        boolean offensive = text.contains("offensive rebound");
        boolean defensive = text.contains("defensive rebound");
        if (offensive)      getStats(player).addRebound(true);
        else /* default DRB */ getStats(player).addRebound(false);
    }

    /** Turnovers: simple count; (optional) skip team TO lines. */
    private void handleTurnover(String text) {
        String player = extractLeadingName(text);
        if ("team".equals(player)) return; // skip team TOs (optional)
        getStats(player).addTurnover();
    }

    /** Fouls: simple count (shooting/offensive/etc. can be specialized later). */
    private void handleFoul(String text) {
        String player = extractLeadingName(text);
        if ("team".equals(player)) return;
        getStats(player).addFoul();
    }

    // ---- Utilities ----

    private PlayerStats getStats(String playerName) {
        // FIX: use the correct constructor new PlayerStats(playerName)
        return playerStatsMap.computeIfAbsent(playerName, name -> new PlayerStats(name));
    }

    /** Very naive name grabber: assumes the player’s name starts the line (before the first space). */
    private String extractLeadingName(String text) {
        String[] parts = text.trim().split("\\s+");
        return parts.length == 0 ? "unknown" : parts[0];
    }

    /** Extracts "##-foot" distance if present; returns null if not found. */
    private Integer extractDistanceFeet(String text) {
        Matcher m = FEET_PATTERN.matcher(text);
        if (m.find()) {
            try {
                return Integer.parseInt(m.group(1));
            } catch (NumberFormatException ignored) { }
        }
        return null;
    }

    private boolean containsAny(String text, String... needles) {
        for (String s : needles) if (text.contains(s)) return true;
        return false;
    }

    /** Expose the map so Main (or tests) can inspect the stats. */
    public Map<String, PlayerStats> getPlayerStatsMap() {
        return playerStatsMap;
    }

    public void printAllStats() {
        for (PlayerStats stats : playerStatsMap.values()) {
            System.out.println(stats);
        }
    }
}
