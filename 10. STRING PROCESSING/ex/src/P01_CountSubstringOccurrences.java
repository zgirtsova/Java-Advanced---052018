import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine().toLowerCase();
        String str = reader.readLine().toLowerCase();

        int counter = 0;
        int index = text.indexOf(str);

        while (index != -1) {
            counter++;
            index = text.indexOf(str, index + 1);
        }
        System.out.println(counter);

//        Not working code - takes too much memory in judge

//
//        Pattern pattern = Pattern.compile(str);
//        Matcher matcher = pattern.matcher(text);
//        int count = 0;
//        while (matcher.find()) {
//            count++;
//        }
//        System.out.println(count);
    }
}
