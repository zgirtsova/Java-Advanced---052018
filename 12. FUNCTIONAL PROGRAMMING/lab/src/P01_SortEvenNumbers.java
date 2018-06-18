import java.util.*;
import java.util.stream.Collectors;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n -> n %2 != 0);

        System.out.println(numbers.toString().substring(1, numbers.toString().length() - 1));

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString().substring(1, numbers.toString().length() - 1));

    }
}
