
import java.util.*;

public class P03_Formatting_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        String aToHex = Integer.toHexString(a).toUpperCase();

        String aToBinary = Integer.toBinaryString( (1 << 10) | a ).substring( 1 );

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", aToHex, aToBinary, b, c);

        //////////////Another way:

        int aa = scan.nextInt();
        double bb = scan.nextDouble();
        double cc = scan.nextDouble();
        scan.nextLine();

        String part1 = String.format("%-10X", aa);
        String part2 = String.format("%10s", Integer.toBinaryString(aa)).replace(' ', '0');
        String part3 = String.format("%10.2f", bb);
        String part4 = String.format("%-10.3f", cc);

        System.out.printf("|%s|%s|%s|%s|%n", part1, part2, part3, part4);

    }
}
