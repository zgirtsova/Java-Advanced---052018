package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

public class Test implements Comparator<String> {

    int Fibonacci(int number)
    {
        if (number <= 1) return number;

        return Fibonacci(number - 2) + Fibonacci(number - 1);
    }

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
