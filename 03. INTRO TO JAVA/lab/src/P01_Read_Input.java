import java.util.Scanner;

public class P01_Read_Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//.useLocale(Locale.ENGLISH);

        String firstWord = scan.next("\\w+");
        String secondWord = scan.next("\\w+");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.nextLine();
        String end = scan.nextLine();
        int sum = num1 + num2 + num3;
        System.out.println(firstWord + " " + secondWord + " " + end + " " + sum);

    }
}
