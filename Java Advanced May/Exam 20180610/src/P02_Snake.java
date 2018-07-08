import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class P02_Snake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int matrixSize = Integer.parseInt(reader.readLine());
        String[] commands = reader.readLine().split(", ");


        String[][] matrix = new String[matrixSize][matrixSize];
        int startRow = 0;
        int startCol = 0;
        int snakeLength = 1;
        int foodCount = 0;

        for (int row = 0; row < matrix.length; row++) {
            String input = reader.readLine();
            int replaceAll = input.replaceAll("[^f]+", "").length();
            foodCount += replaceAll;

            if (input.contains("s")) {
                startRow = row;
                startCol = input.indexOf("s");
                String array[] = input.split(" ");
                matrix[row] = array;
                break;
            }
            String array[] = input.split(" ");
            matrix[row] = array;

        }
        for (int row = startRow + 1; row < matrix.length ; row++) {
            String input = reader.readLine();
            int replaceAll = input.replaceAll("[^f]+", "").length();
            foodCount += replaceAll;

            String array[] = input.split(" ");
            matrix[row] = array;
        }

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("up")) {

                if (startRow == 0) {
                    startRow = matrixSize - 1;
                } else {
                    startRow = startRow - 1;
                }
                if (matrix[startRow][startCol].equals("f")) {
                    foodCount --;
                    snakeLength++;
                    matrix[startRow][startCol] = "*";
                    if (foodCount == 0) {
                        System.out.println("You win! Final snake length is " + snakeLength);
                        return;
                    }
                }  else if (matrix[startRow][startCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }
                // DOWN
            } else if (commands[i].equals("down")) {
                if (startRow == matrixSize - 1) {
                    startRow = 0;
                } else {
                    startRow = startRow + 1;
                }
                if (matrix[startRow][startCol].equals("f")) {
                    foodCount --;
                    snakeLength++;
                    matrix[startRow][startCol] = "*";
                    if (foodCount == 0) {
                        System.out.println("You win! Final snake length is " + snakeLength);
                        return;
                    }
                }  else if (matrix[startRow][startCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }

            } else if (commands[i].equals("left")) {
                if (startCol == 0) {
                    startCol = matrixSize - 1;
                } else {
                    startCol = startCol - 1;
                }
                if (matrix[startRow][startCol].equals("f")) {
                    foodCount --;
                    snakeLength++;
                    matrix[startRow][startCol] = "*";
                    if (foodCount == 0) {
                        System.out.println("You win! Final snake length is " + snakeLength);
                        return;
                    }
                }  else if (matrix[startRow][startCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }

            } else if (commands[i].equals("right")){
                if (startCol == matrixSize - 1) {
                    startCol = 0;
                } else {
                    startCol = startCol + 1;
                }
                if (matrix[startRow][startCol].equals("f")) {
                    foodCount --;
                    snakeLength++;
                    matrix[startRow][startCol] = "*";
                    if (foodCount == 0) {
                        System.out.println("You win! Final snake length is " + snakeLength);
                        return;
                    }
                }  else if (matrix[startRow][startCol].equals("e")) {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }

            }
        }






        System.out.printf("You lose! There is still %d food to be eaten.", foodCount);
        //printMatrix(matrix);
    }
    private static void doChecks(String [][]matrix, int startRow, int startCol,int foodCount, int snakeLength) {
        if (matrix[startRow][startCol].equals("f")) {
            foodCount --;
            snakeLength++;
            matrix[startRow][startCol] = "*";
            if (foodCount == 0) {
                System.out.println("You win! Final snake length is " + snakeLength);
            }
        }  else if (matrix[startRow][startCol].equals("e")) {
            System.out.println("You lose! Killed by an enemy!");
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}

