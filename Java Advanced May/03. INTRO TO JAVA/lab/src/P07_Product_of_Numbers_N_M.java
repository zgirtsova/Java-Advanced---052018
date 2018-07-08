import java.math.BigDecimal;
import java.util.*;

public class P07_Product_of_Numbers_N_M {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BigDecimal result = new BigDecimal("1");
        int iterator = n;
        do {
            result = result.multiply(BigDecimal.valueOf(iterator));
            iterator++;
        } while (iterator <= m);

        System.out.printf("product[%d..%d] = %s", n, m, result);
    }
}
