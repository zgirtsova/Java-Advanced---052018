package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //System.out.println(fibonacci(6));

        ArrayList<Integer> numbers = new ArrayList<Integer>(){{
            add(5);
            add(12);
            add(546);
            add(788);

        }};
        Map<String, Integer> map = new HashMap<>();

        numbers.forEach(System.out::println);
        numbers.remove(2);
        numbers.forEach(System.out::println);



        Integer test = numbers.iterator().next();
        numbers.iterator().remove();
        System.out.println("DONE");


    }
    private static int fibonacci(int number) {
        if (number <= 1) return number;

        return fibonacci(number - 2) + fibonacci(number - 1);
    }
}
