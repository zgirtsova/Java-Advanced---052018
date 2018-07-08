
import java.util.Locale;
import java.util.Scanner;

public class P03_Average_of_Three_Nums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double firstNum = scan.nextDouble();
        double secondNum = scan.nextDouble();
        double thirdNum = scan.nextDouble();

        double result = (firstNum + secondNum + thirdNum) / 3;
        System.out.printf("%.2f", result);




    }
}
