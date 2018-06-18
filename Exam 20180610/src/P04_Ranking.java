import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P04_Ranking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> contests = new HashMap<>();
        Map<String, Map<String, Integer>> users = new TreeMap<>();


        for (String input = reader.readLine(); !input.equals("end of contests"); input = reader.readLine()) {
            String[] inputLine = input.split(":");
            contests.put(inputLine[0], inputLine[1]);
        }

        for (String input = reader.readLine(); !input.equals("end of submissions"); input = reader.readLine()) {
            String[] inputLine = input.split("=>");
            String contest = inputLine[0];
            String password = inputLine[1];
            String username = inputLine[2];
            int points = Integer.parseInt(inputLine[3]);

            if (!(contests.containsKey(contest) && password.equals(contests.get(contest)))) {
                continue;
            }


            if (users.containsKey(username)) {
                if (users.get(username).containsKey(contest)) {
                    int oldPoints = users.get(username).get(contest);
                    if (points > oldPoints) {
                        users.get(username).put(contest, points);
                    }
                } else {
                    users.get(username).put(contest, points);
                }
            } else {
                users.put(username, new LinkedHashMap<>());
                users.get(username).put(contest, points);
            }
        }

        StringBuilder sb = new StringBuilder();
        // total BULLSHIT:

        Map<String, Integer> usersPoints = new HashMap<>(users.size());
        users.entrySet().stream().forEach( (Map.Entry<String, Map<String, Integer>> kvp) -> {
            long points = kvp.getValue()
                    .values()
                    .stream()
                    .mapToLong(Long::valueOf)
                    .sum();
            usersPoints.put(kvp.getKey(), (int)points);
        });
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";
        for (String s : usersPoints.keySet()) {
            if (usersPoints.get(s) > maxPoints) {
                winner = s;
                maxPoints = usersPoints.get(s);
            }
        }


        System.out.printf("Best candidate is %s with total %d points.%n", winner, maxPoints);
        System.out.println("Ranking:");

        users
                .entrySet()
                .stream()
                .forEach(kvp -> {
                    sb.append(kvp.getKey()).append(System.lineSeparator());

                    kvp.getValue().entrySet().stream()
                            .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                            .forEach(nestedKvp ->
                            {
                                sb.append(String.format("#  %s -> %d%n", nestedKvp.getKey(), nestedKvp.getValue()));
                            });

                });




        System.out.println(sb);

    }
}
