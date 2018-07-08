import java.util.*;

public class P10_Extract_bit_from_Integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        int num = scan.nextInt();
        int bitPos = scan.nextInt();

        int mask = num >> bitPos;
        int result = 1 & mask;

        System.out.println(result);

    }
}
