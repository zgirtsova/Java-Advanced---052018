import java.util.*;

public class P03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();

        fillCards(scanner, firstPlayer, secondPlayer);


        for (int i = 0; i < 50 ; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                System.out.println(firstPlayer.isEmpty() ? "Second player win!" : "First player win!");
                return;
            }

            int firstNum = firstPlayer.iterator().next();
            firstPlayer.remove(firstNum);
            int secondNum = secondPlayer.iterator().next();
            secondPlayer.remove(secondNum);


            if (firstNum > secondNum) {
                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);
            } else if (firstNum < secondNum){
                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);
            }

        }

        printResult(firstPlayer, secondPlayer);
    }

    private static void printResult(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (firstPlayer.size() < secondPlayer.size()) {
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }

    private static void fillCards(Scanner scanner, Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        String[] firstPlayerNumbers = scanner.nextLine().split(" ");
        String[] secondPlayerNumbers = scanner.nextLine().split(" ");

        for (String card : firstPlayerNumbers) {
            firstPlayer.add(Integer.parseInt(card));
        }

        for (String card : secondPlayerNumbers) {
            secondPlayer.add(Integer.parseInt(card));
        }
    }
}
