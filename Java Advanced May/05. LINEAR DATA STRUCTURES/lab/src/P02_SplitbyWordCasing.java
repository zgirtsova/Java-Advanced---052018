import java.util.*;

public class P02_SplitbyWordCasing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("[\\\\,;:.!()\"\'/\\[\\] ]+");

        List<String> lowerCaseWords = new ArrayList<>();
        List<String> upperCaseWords = new ArrayList<>();
        List<String> mixedCaseWords = new ArrayList<>();

        for (String word : words) {
            if (word.trim().length() == 0) {
                continue;
            }
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    mixedCaseWords.add(word);
                    isMixed = true;
                    break;
                }
            }
            if (!isMixed) {
                if (word.toUpperCase().equals(word)) {
                    upperCaseWords.add(word);
                } else if (word.toLowerCase().equals(word)) {
                    lowerCaseWords.add(word);
                } else {
                    mixedCaseWords.add(word);
                }
            }
        }
        System.out.printf("Lower-case: %s%n", String.join(", ", lowerCaseWords));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixedCaseWords));
        System.out.printf("Upper-case: %s%n", String.join(", ", upperCaseWords));


    }
}