import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P11_ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (String input = reader.readLine(); !input.equals("END"); input = reader.readLine()) {
            sb.append(input).append(System.lineSeparator());
        }
        String text = sb.toString();
        String regex = "<a href=.+?>(.|\\r\\n)*?</a>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String match = matcher.group(0);
            String replacement = getReplacement(match);
            text = text.replace(match, replacement);
        }
        System.out.println(text);
    }

    private static String getReplacement(String match) {
        return match.replaceFirst("<a", "[URL")
                .replaceFirst(">", "]")
                .replaceFirst("</a>", "[/URL]");
    }
}
