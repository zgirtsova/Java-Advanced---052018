import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P08_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int numbersToPush = input[0];
        int numbersToPop = input[1];
        int numberToCheck = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        fillStack(stack, numbers, numbersToPush);
        removeFromStack(stack, numbersToPop);

        //find if numberToCheck is present or print the smallest num
        System.out.println(printResult(stack, numberToCheck));
    }

    private static String printResult(ArrayDeque<Integer> stack, int numberToCheck) {

        int smallest = Integer.MAX_VALUE;
        boolean result = false;
        if (stack.isEmpty()) {
            return "0";
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == numberToCheck) {
                return "true";
            } else if (stack.peek() < smallest) {
                smallest = stack.pop();
            } else {
                stack.pop();
            }
        }
        return smallest + "";

    }


    private static void removeFromStack(ArrayDeque<Integer> stack, int numbersToPop) {
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
    }

    private static void fillStack(ArrayDeque<Integer> stack, int[] numbers, int numbersToPush) {
        for (int i = 0; i < numbersToPush; i++) {
            stack.push(numbers[i]);
        }
    }

}
