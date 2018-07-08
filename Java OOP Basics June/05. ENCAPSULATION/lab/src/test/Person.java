package test;

public class Person {

    String name;
    int age;
    String mail;
    boolean isMale;
    String address;

    public Person() {
    }

    public Person(String name, int age, String mail, boolean isMale, String address) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.isMale = isMale;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", isMale=" + isMale +
                ", address='" + address + '\'' +
                '}';
    }
}
