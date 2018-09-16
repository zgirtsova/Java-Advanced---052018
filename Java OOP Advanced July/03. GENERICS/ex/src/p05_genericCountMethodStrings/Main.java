package p05_genericCountMethodStrings;

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

        List<Box<String>> boxes = new ArrayList<>();

        int numberOfStrings = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfStrings; i++) {
            String line = reader.readLine();
            boxes.add(new Box<>(line));
        }

        long result = countOfGreaterElements(boxes, reader.readLine());
        System.out.println(result);
    }

    private static <T extends Comparable<T>> long countOfGreaterElements(List<Box<T>> list, T element) {
        return list.stream()
                .filter(e -> e.compareTo(new Box<>(element)) > 0)
                .count();
    }
}
