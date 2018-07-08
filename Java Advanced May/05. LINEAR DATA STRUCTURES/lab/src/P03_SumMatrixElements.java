import java.util.Scanner;

public class P03_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(firstLine[0]);
        int cols = Integer.parseInt(firstLine[1]);

        int[][] matrix = new int[rows][cols];

        for(int row = 0; row < matrix.length; row++){
            String[] reminder = scanner.nextLine().split(", ");
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }

        int sum = 0;

        for (int[] row : matrix) {
            for (int col : row) {
                sum += col;
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
