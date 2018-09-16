package p06_strategyPattern.comparators;

import p06_strategyPattern.Person;

import java.util.Comparator;

public class ComparatorByNameLength implements Comparator<Person> {

    /*
    The first comparator should compare people based on the length of their name
    as a first parameter, if 2 people have a name with the same length,
    perform a case-insensitive compare based on the first letter of their name instead
    */
    @Override
    public int compare(Person p1, Person p2) {

        int comp = Integer.compare(p1.getName().length(), p2.getName().length());
        if (comp == 0) {
            char p1NameFirstLetter = Character.toLowerCase(p1.getName().charAt(0));
            char p2NameFirstLetter = Character.toLowerCase(p2.getName().charAt(0));
            comp = Character.compare(p1NameFirstLetter, p2NameFirstLetter);
        }
        return comp;
    }
}
