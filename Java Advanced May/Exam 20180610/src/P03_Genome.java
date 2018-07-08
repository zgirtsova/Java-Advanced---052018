import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Genome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^(?<genome>[!@#$?a-z]+)=(?<length>\\d+)--(?<genes>\\d+)<<(?<name>\\w+)$");
        Map<String, Integer> map = new HashMap<>();

        String input = reader.readLine();

        while (!"Stop!".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String genome = matcher.group("genome");
                int nameLength = Integer.parseInt(matcher.group("length"));
                int genes = Integer.parseInt(matcher.group("genes"));
                String name = matcher.group("name");
                int realLength = isNameValid(genome);
                if (realLength != nameLength) {
                    System.out.println("different name length");
                    continue;
                }

                if (!map.containsKey(name)) {
                    map.put(name, genes);
                } else {
                    map.put(name, map.get(name) + genes);
                }

            }

            input = reader.readLine();
        }

        map.entrySet().stream()
                .sorted(Comparator.comparing(a -> a.getValue(),
                        Comparator.reverseOrder()))
                .forEach(kvp -> {
                    System.out.printf("%s has genome size of %d%n", kvp.getKey(), kvp.getValue());
                });

    }
    private static int isNameValid (String name) {
        String result = name.replaceAll("[!@#$?]", "");

        return result.length();
    }
}
