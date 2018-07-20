package p06_GenericFlatMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1,2,3);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.0, 2.0, 3.0, 5.0, 6.5554);

//        {{add(1.2); add(3.2);}};

        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged, integers, doubles);

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest, jagged);
        System.out.println(dest);
    }
}
