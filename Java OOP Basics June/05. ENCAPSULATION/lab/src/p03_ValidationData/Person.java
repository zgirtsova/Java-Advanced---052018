package p03_ValidationData;

import java.text.DecimalFormat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat format = new DecimalFormat("0.0#################");

    public Person() {
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
//        this.salary = this.age >= 30 ? (this.salary * bonus / 100) : (this.salary * (bonus / 2) / 100);
        double personalBonus = this.age >= 30 ? bonus : bonus / 2;
        this.salary += this.salary * personalBonus / 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), format.format(this
                .getSalary
                ()));
    }
}
