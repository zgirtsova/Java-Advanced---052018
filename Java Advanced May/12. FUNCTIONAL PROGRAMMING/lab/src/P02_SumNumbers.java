import java.util.Scanner;
import java.util.function.Function;

public class P02_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");

        Function<String, Integer> parser = x -> Integer.parseInt(x);
        int sum = 0;

        for (String s : line) {
            sum += parser.apply(s);
        }

        System.out.println("Count = " + line.length);
        System.out.println("Sum = " + sum);
    }
}
