import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final String regex = "^IP=(?<ip>(\\d+\\.?)+|(.+:.+)\\b) .+ user=(?<username>\\w+)";
        final String string = "IP=192.23.30.40 message='Hello&derps.' user=destroyer\n"
                + "IP=192.23.30.41 message='Hello&yall.' user=destroyer\n"
                + "IP=192.23.30.40 message='Hello&hi.' user=destroyer\n"
                + "IP=192.23.30.42 message='Hello&Dudes.' user=destroyer\n"
                + "end\n";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}