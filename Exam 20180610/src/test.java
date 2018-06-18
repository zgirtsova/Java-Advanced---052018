import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        String input = scan.nextLine();
        String replaceAll = input.replaceAll("[^f]+", "");
        System.out.println(replaceAll);
    }
}
