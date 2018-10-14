package test;

import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet myset = new TreeSet((o1, o2) -> o1.getClass().getName().compareTo(" ffd0000"));
    }
}
