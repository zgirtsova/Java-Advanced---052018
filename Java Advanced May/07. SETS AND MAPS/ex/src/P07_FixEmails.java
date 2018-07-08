import java.io.*;
import java.util.*;

public class P07_FixEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> emails = new LinkedHashMap<>();
        for (String name = reader.readLine(); !name.equals("stop"); name = reader.readLine()) {
            String email = reader.readLine();
            String domain = email.substring(email.length() - 3, email.length());
            if (!domain.equals(".us") && !domain.equals(".uk") && !domain.equals("com")) {
                emails.put(name, email);
            }
        }
        for (Map.Entry<String, String> pair : emails.entrySet()) {
            System.out.printf("%s -> %s%n", pair.getKey(), pair.getValue());
        }
    }
}
