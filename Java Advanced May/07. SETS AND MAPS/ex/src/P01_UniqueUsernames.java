import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> usernames = new LinkedHashSet<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String username = reader.readLine();
            usernames.add(username);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
