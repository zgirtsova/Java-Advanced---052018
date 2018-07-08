import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P05_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, tokens);

        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());

            if(operation.equals("+")){
                stack.push(String.valueOf(first + second));
            }
            if(operation.equals("-")){
                stack.push(String.valueOf(first - second));
            }
        }

        System.out.println(stack.pop());
    }
}
