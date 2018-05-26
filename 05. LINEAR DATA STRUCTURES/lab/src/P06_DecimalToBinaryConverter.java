import java.util.*;

public class P06_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (number > 0) {
            int reminder = number % 2;
            stack.push(reminder);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
