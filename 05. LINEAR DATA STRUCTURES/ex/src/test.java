import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] allRobots = scanner.nextLine().split("[-;]");
        for (String allRobot : allRobots) {
            System.out.println(allRobot);

        }


    }
}
