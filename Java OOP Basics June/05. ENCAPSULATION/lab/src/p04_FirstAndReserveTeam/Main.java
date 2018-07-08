package p04_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> persons = new ArrayList<>();
        int inputs = Integer.parseInt(reader.readLine());

        while (inputs-- > 0) {
            String[] personData = reader.readLine().split("\\s+");

            try {
                Person person = new Person(personData[0], personData[1],
                        Integer.parseInt(personData[2]), Double.parseDouble(personData[3]));
                persons.add(person);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        Team team = new Team("Minior");
        for (Person person : persons) {
            team.addPlayer(person);
        }

        System.out.println(team);
    }
}
