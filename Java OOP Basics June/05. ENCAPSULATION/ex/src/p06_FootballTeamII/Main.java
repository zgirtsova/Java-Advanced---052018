package p06_FootballTeamII;

import p06_FootballTeamII.Team;
import p06_FootballTeamII.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Team> teams = new HashMap<>();
        for (String line = reader.readLine(); !line.equals("END"); line = reader.readLine()) {
            String[] tokens = line.split(";");
            String command = tokens[0];
            String teamName = tokens[1];
            Team team;
            try {
                switch (command) {
                    case "Team":
                        teams.putIfAbsent(teamName, new Team(teamName));
                        break;
                    case "Add":
                        team = teams.get(teamName);
                        if (team == null) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                            break;
                        }
                        List<Double> stats = new ArrayList<>();
                        for (int i = 3; i < 8; i++) {
                            stats.add(Double.parseDouble(tokens[i]));
                        }
                        String playerToAdd = tokens[2];
                        Player player = new Player(playerToAdd, team, stats);
                        team.addPlayer(player);
                        break;
                    case "Remove":
                        String playerToRemove = tokens[2];
                        team = teams.get(teamName);
                        team.removePlayer(playerToRemove);
                        break;
                    case "Rating":
                        team = teams.get(teamName);
                        if (team == null) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                            break;
                        }
                        System.out.printf("%s - %.0f%n", teamName, team.getRating());
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
