import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P10_BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int numsToAdd = Integer.parseInt(input[0]);
        int numsToRemove = Integer.parseInt(input[1]);
        int numToCheck = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] nums = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        addElements(queue, nums, numsToAdd);
        removeElements(queue, numsToRemove);

        //------------------------------
        if (queue.isEmpty()) {
            System.out.println("0");
            return;
        }
        int min = Integer.MAX_VALUE;

        for (Integer num : queue) {
            if (num == numToCheck) {
                System.out.println("true");
                return;
            } else if (num <= min) {
                min = queue.poll();
            } else {
                queue.poll();
            }
        }
        System.out.println(min);

    }
    private static void removeElements(ArrayDeque<Integer> queue, int numsToRemove) {
        for (int i = 0; i < numsToRemove; i++) {
            queue.poll();
        }
    }

    private static void addElements(ArrayDeque<Integer> queue, int[] nums, int numsToAdd) {
        for (int i = 0; i < numsToAdd; i++) {
            queue.offer(nums[i]);
        }
    }
}
