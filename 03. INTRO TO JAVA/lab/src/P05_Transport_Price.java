import java.util.Locale;
import java.util.Scanner;

public class P05_Transport_Price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double kmTravelled = Double.parseDouble(scan.nextLine());
        String dayNight = scan.nextLine();
        double cost = 0;
        final double TAXI_DAY_TARRIF = 0.79;
        final double TAXI_NIGHT_TARRIF = 0.90;
        final double TAXI_INITIAL_TAX = 0.70;
        final double BUS_TARIFF = 0.09; //at least 20 km
        final double TRAIN_TARIFF = 0.06; //at least 100 km

        if (kmTravelled > 0 && kmTravelled < 20) {
            if (dayNight.equals("day")) {
                cost = kmTravelled * TAXI_DAY_TARRIF + TAXI_INITIAL_TAX;
            } else {
                cost = kmTravelled * TAXI_NIGHT_TARRIF + TAXI_INITIAL_TAX;
            }
        }
        else if (kmTravelled >= 20 && kmTravelled < 100 ) {
            cost = kmTravelled * BUS_TARIFF;
        }
        else {
            cost = kmTravelled * TRAIN_TARIFF;
        }

        System.out.printf("%.2f", cost);

    }
}
