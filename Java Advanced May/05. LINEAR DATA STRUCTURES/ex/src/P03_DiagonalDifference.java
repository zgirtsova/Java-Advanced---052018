import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P03_DiagonalDifference {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int squareSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = initializeMatrix(squareSize);

        int difference = getDiagonalDifference(matrix);

        System.out.println(difference);
    }

    private static int getDiagonalDifference(int[][] matrix) {

        int leftToRightSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            leftToRightSum += matrix[i][i];
        }

        int rightToLeftSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            rightToLeftSum += matrix[i][matrix.length - i - 1];
        }

        return Math.abs(leftToRightSum - rightToLeftSum);
    }

    private static int[][] initializeMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {

            int[] inputLineNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = inputLineNumbers[col];
            }
        }
        return matrix;
    }
}
