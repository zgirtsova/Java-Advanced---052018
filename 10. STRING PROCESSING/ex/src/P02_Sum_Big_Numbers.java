import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_Sum_Big_Numbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String smaller = "";
        String bigger = "";
        if (s1.length() != s2.length()) {
            smaller = (s1.length() < s2.length()) ? s1 : s2;
            bigger = (s1.length() > s2.length()) ? s1 : s2;
            smaller = FillWithZeros(smaller, bigger);
        } else {
            smaller = s1;
            bigger = s2;
        }


        boolean carry = false;
        String result = "";

        for (int i = smaller.length() - 1; i >= 0; i--) {
            int augend = Integer.parseInt(smaller.charAt(i) + "");
            int addend = Integer.parseInt(bigger.charAt(i) + "");
            int sum = augend + addend;
            sum += (carry ? 1 : 0);
            carry = false;
            if (sum > 9) {
                carry = true;
                sum -= 10;
            }

            result = sum + result;
        }

        if (carry) {
            result = "1" + result;
        }

        System.out.println(result);
    }

    private static String FillWithZeros(String smaller, String bigger) {
        return String.format("%1$" + bigger.length() + "s", smaller).replace(" ", "0");
    }
}

