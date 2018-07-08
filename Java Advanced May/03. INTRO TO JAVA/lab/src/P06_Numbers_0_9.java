import java.util.Locale;
import java.util.Scanner;

public class P06_Numbers_0_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int counter = 0;
        while (counter < 10) {
            System.out.printf("Number: %d%n", counter);
            counter++;
        }

    }
}
