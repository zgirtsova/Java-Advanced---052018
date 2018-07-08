import java.util.*;
import java.util.function.Function;

public class P04_AddVAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        List<Double> numbers = new ArrayList<>();

        for (String s : input){
            numbers.add(Double.parseDouble(s));
        }

        Function<Double, Double> addVat = x -> x * 1.20;

        System.out.println("Prices with VAT:");

        for(Double d: numbers){
            System.out.println(String.format("%1$.2f", addVat.apply(d)));
        }
    }
}
