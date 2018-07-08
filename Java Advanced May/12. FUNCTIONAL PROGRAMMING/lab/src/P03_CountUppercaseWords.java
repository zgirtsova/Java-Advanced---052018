import java.util.*;
import java.util.function.Predicate;

public class P03_CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");
        ArrayList<String> valid = new ArrayList<>();

        Predicate<String> isUppercase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        int count = 0;

        for(String word : text){
            if(isUppercase.test(word)){
                count++;
                valid.add(word);
            }
        }

        System.out.println(count);
        for(String v : valid){
            System.out.println(v);
        }
    }
}
