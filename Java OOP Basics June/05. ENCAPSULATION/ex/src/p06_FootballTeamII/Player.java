package p06_FootballTeamII;

import java.util.List;
import java.util.Map;

public class Player {

    private static final List<String> PLAYER_STATS = List.of("Endurance", "Sprint", "Dribble", "Passing", "Shooting");

    private String name;
    private Team team;
    private List<Double> stats;
    private double skillLevel;

    public Player(String name, Team team, List<Double> stats) {
        this.setName(name);
        this.setTeam(team);
        this.setStats(stats);
        this.setSkillLevel();
    }

    private void setSkillLevel() {
        if (this.stats.size() > 0) {
            this.skillLevel = this.stats.stream().mapToDouble(x -> x).average().getAsDouble();
        }
    }

    public double getSkillLevel() {
        return this.skillLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.matches("\\s+")) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setTeam(Team team) {
        this.team = team;
    }

    private void setStats(List<Double> stats) {
        for (int i = 0; i < stats.size(); i++) {
            if (stats.get(i) < 0 || stats.get(i) > 100) {
                throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", PLAYER_STATS.get(i)));
            }
        }
        this.stats = stats;
    }
}
