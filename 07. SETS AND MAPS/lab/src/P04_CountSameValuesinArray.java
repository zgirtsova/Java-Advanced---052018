import java.util.*;

public class P04_CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        String[] arr = scan.nextLine().split(" ");
        Map<String, Integer> numbers = new HashMap<>();

        for (String num : arr) {
            if (!numbers.containsKey(num)) {
                numbers.put(num, 0);
            }

            numbers.put(num, numbers.get(num) + 1);

        }

        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.printf("%s - %d times%n", entry.getKey(), entry.getValue());
        }
    }
}