import java.util.*;

public class P11_Modify_a_Bit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        int num = scan.nextInt();
        int pos = scan.nextInt();
        int bit = scan.nextInt();
        int result = 0;

        if (bit == 0) {
            int mask = ~(1 << pos);
            result = num & mask;
        }
        else if (bit == 1) {
            int mask = 1 << pos;
            result = num | mask;
        }
        System.out.println(result);
    }
}
