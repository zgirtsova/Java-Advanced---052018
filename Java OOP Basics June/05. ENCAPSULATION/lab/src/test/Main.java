package test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Pesho", 20, "adad@faf.bg", true, "Sofia");
        Person person2 = new Person("Miro", 10, "adad@faf.bg", true, "Sofia");
        Person person3 = new Person("Tesi", 20, "adad@faf.bg", true, "Sofia");
        Person person4 = new Person("Poli", 20, "adad@faf.bg", false, "Sofia");
        Person person5 = new Person("Monika", 30, "adad@faf.bg", false, "Sofia");

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, person1);
        map.put(2, person2);
        map.put(3, person3);
        map.put(4, person4);
        map.put(5, person5);

        map.get(1).setAddress("Plovdiv");
        System.out.println(person1);
        Person nowPer = person2;
        nowPer.setAddress("Mirkovo");
        System.out.println(person2);


    }

}
