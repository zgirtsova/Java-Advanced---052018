import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> test = new LinkedList<>();
        test.add("ggg");
        test.add("fff");
        test.add("vvv");
        test.add("aaa");
        test.add("www");
        test.add("ddd");

        for (String s : test) {
            System.out.println(s);
        }

        List<String> anotherTest = new ArrayList<>();
        anotherTest.add("ggg");
        anotherTest.add("fff");
        anotherTest.add("vvv");
        anotherTest.add("aaa");
        anotherTest.add("www");
        anotherTest.add("ddd");

        for (String s : anotherTest) {
            System.out.println(s);
        }
    }
}
