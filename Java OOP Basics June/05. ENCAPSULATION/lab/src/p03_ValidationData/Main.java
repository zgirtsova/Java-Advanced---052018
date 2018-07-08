package p03_ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        int count = Integer.parseInt(reader.readLine());
        while (count-- > 0) {
            String[] info = reader.readLine().split("\\s+");

            Person person = null;

            try {
                person = new Person(info[0], info[1],
                        Integer.parseInt(info[2]), Double.parseDouble(info[3]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            if (person != null) {
                people.add(person);
            }
        }

        double bonus = Double.parseDouble(reader.readLine());
        people.forEach(person -> {
            person.increaseSalary(bonus);
            System.out.println(person);
        });
    }
}
