package p01_ListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final String END_PROGRAM = "END";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ListIterator<String> listIterator = null;

        String line;
        while (!END_PROGRAM.equalsIgnoreCase(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Create":
                    String[] elements = Arrays.stream(tokens, 1, tokens.length).toArray(String[]::new);
                    listIterator = new ListIterator<>(elements);
                    break;
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "Print":
                    try {
                        listIterator.print();
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
            }
        }
    }
}
