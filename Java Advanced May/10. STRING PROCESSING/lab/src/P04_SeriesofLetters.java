import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_SeriesofLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String pattern = "([a-zA-Z ])\\1*";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(line);

        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}
