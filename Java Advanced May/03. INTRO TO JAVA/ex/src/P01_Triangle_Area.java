import sun.applet.Main;

import java.util.Locale;
import java.util.Scanner;

public class P01_Triangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double aX = scan.nextDouble();
        double aY = scan.nextDouble();
        double bX = scan.nextDouble();
        double bY = scan.nextDouble();
        double cX = scan.nextDouble();
        double cY = scan.nextDouble();


        double triangleArea = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
        int area = (int)(triangleArea);

        System.out.println(area);
    }
}
