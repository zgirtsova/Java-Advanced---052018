package p03_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int age;
    private DecimalFormat df;

    public Chicken(String name, int age) {
        this.df = new DecimalFormat("#.##");
        this.setName(name);
        this.setAge(age);
    }

    public double getEggsPerDay() {
        return calculateProductPerDay(this.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.matches("\\s+")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay(int age) {
        if(age <= 5) {
            return 2;
        } else if(age <= 11){
            return 1;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.", this.getName(), this.getAge(), this.df
                .format(getEggsPerDay()));
    }
}
