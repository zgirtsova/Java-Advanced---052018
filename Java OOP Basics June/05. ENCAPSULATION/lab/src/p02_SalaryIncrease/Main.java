package p02_SalaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();
        int lines = Integer.parseInt(reader.readLine());

        while(lines-- > 0) {
            String[] tokens = reader.readLine().split(" ");
            Person person = new Person(tokens[0], tokens[1],
                    Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
            people.add(person);
        }

        double bonus = Double.parseDouble(reader.readLine());

        people.forEach(x -> {
            x.increaseSalary(bonus);
            System.out.println(x);
        });
    }
}
