package p08_MilitaryElite.model.Impl.soldiers;

import p08_MilitaryElite.model.api.IPrivate;

public class Private extends BaseISoldier implements IPrivate, Comparable<IPrivate> {
    private double salary;

    public Private(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f", super.toString(), this.salary);
    }

    @Override
    public int compareTo(IPrivate otherPrivate) {
        return otherPrivate.getId().compareTo(this.getId());
    }
}
