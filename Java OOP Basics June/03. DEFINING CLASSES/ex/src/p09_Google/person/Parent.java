package p09_Google.person;

public class Parent {
    private String Name;
    private String Birthday;

    public Parent(String name, String birthday) {
        Name = name;
        Birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n"
                , this.Name
                , this.Birthday);
    }
}
