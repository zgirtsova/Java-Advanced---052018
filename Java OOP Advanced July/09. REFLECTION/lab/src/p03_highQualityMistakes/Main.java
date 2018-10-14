package p03_highQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Field> fields = new TreeSet<>(Comparator.comparing(Field::getName));

        //Ivo Hristov's solution BEST EVER MADE:
//        fields.addAll(Arrays.asList(Reflection.class.getDeclaredFields()));
//
//        getters.addAll(Arrays.stream(Reflection.class.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("get")
//                        && !void.class.equals(m.getReturnType()))
//                .filter(m -> !Modifier.isPublic(m.getModifiers()))
//                .collect(Collectors.toList()));
//
//        setters.addAll(Arrays.stream(Reflection.class.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("set")
//                        && !void.class.equals(m.getReturnType()))
//                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
//                .collect(Collectors.toList()));

        Class<?> refClass = Reflection.class;

        Field[] refFields = refClass.getDeclaredFields();
        for (Field field : refFields) {
            if (!Modifier.isPrivate(field.getModifiers())) {
                fields.add(field);
            }
        }

        Method[] refMethods = refClass.getDeclaredMethods();
        for (Method method : refMethods) {
            if (isGetter(method)) {
               if (!Modifier.isPublic(method.getModifiers())) {
                   getters.add(method);
                }
            } else if (isSetter(method)) {
                if (!Modifier.isPrivate(method.getModifiers())) {
                    setters.add(method);
                }
            }
        }

        printAllMistakesResult(getters, setters, fields);
    }

    private static void printAllMistakesResult(Set<Method> mistakesGetters, Set<Method> mistakesSetters, Set<Field> mistakesFields) {
        mistakesFields.forEach(field -> {
            System.out.println(String.format("%s must be private!", field.getName()));
        });

        mistakesGetters.forEach(method -> {
            System.out.println(String.format("%s have to be public!", method.getName()));
        });

        mistakesSetters.forEach(method -> {
            System.out.println(String.format("%s have to be private!", method.getName()));
        });
    }

    private static boolean isSetter(Method method) {
        return method.getName().startsWith("set") &&
                    method.getReturnType().equals(void.class) &&
                        method.getParameterCount() == 1;
    }

    private static boolean isGetter(Method method) {
        return method.getName().startsWith("get") &&
                !method.getReturnType().equals(void.class) &&
                    method.getParameterCount() == 0;
    }
}
