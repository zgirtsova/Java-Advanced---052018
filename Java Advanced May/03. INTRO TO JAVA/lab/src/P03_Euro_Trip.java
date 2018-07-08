import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class P03_Euro_Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double qty = scan.nextDouble();
        double pricePerKilo = 1.2;

        BigDecimal exchangeRate = BigDecimal.valueOf(4210500000000.0);
        BigDecimal priceInLv = new BigDecimal(qty * pricePerKilo);

        BigDecimal wurstInMarks = exchangeRate.multiply(priceInLv);

        System.out.printf("%.2f marks", wurstInMarks);



    }
}
