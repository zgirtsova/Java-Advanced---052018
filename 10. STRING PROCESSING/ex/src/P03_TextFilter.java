import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P03_TextFilter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            text = text.replaceAll(bannedWord, new String(new char[bannedWord.length()]).replace('\0', '*'));
        }
        System.out.println(text);
    }
}
