import java.util.*;

public class P01_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double sideA = scan.nextDouble();
        double sideB = scan.nextDouble();
        System.out.printf("%.2f", sideA * sideB);
    }
}
