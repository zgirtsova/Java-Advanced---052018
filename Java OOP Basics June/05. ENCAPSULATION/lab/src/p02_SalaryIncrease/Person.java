package p02_SalaryIncrease;

import java.text.DecimalFormat;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat format;

    public Person() {
        this.format = new DecimalFormat("#.0######");
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void increaseSalary(double bonus) {
        if (this.getAge() <= 30) {
            this.setSalary(this.getSalary() * (1 + bonus / 200));
        } else {
            this.setSalary(this.getSalary() * (1 + bonus / 100));
        }
    }



    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(),
                this.getLastName(),
                this.format.format(this.getSalary()));
    }
}
