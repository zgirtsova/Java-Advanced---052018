import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Internships {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long countProblems = Integer.parseInt(reader.readLine());
        long countCandidates = Integer.parseInt(reader.readLine());

        ArrayDeque<String> stackProblems = new ArrayDeque<>();
        ArrayDeque<String> queuePeople = new ArrayDeque<>();


        for (int i = 0; i < countProblems; i++) {
            String problem = reader.readLine();
            stackProblems.push(problem);
        }

        for (int i = 0; i < countCandidates; i++) {
            String candidate = reader.readLine();
            if (isValidName(candidate)) {
                queuePeople.offer(candidate);
            }
        }

        while (stackProblems.size() > 0 && queuePeople.size() > 1) {
            String cand = queuePeople.peek();
            String probl = stackProblems.peek();

            if (sumLetters(cand) > sumLetters(probl)) {
                System.out.printf("%s solved %s.%n", cand,probl);
                stackProblems.pop();
                queuePeople.pop();
                queuePeople.offer(cand);
            } else {
                System.out.printf("%s failed %s.%n", cand,probl);
                stackProblems.pop();
                stackProblems.add(probl);
                queuePeople.pop();

            }
        }

        if (queuePeople.size() == 1) {
            System.out.printf("%s gets the job!", queuePeople.pop());
        } else if (stackProblems.size() == 0){
            printResult(queuePeople);
        }

    }

    private static int sumLetters(String word) {
        int sum = 0;
        for (char ch : word.toCharArray()) {
            sum += ch;
        }
        return sum;
    }

    private static boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]++ [A-Z][a-z]+");
        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    }

    private static void printResult (ArrayDeque<String> people) {
        StringBuilder sb = new StringBuilder();

        for (String person : people) {
            sb.append(person).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
    }
}
