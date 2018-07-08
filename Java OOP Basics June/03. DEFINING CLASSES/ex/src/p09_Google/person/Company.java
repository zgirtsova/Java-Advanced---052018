package p09_Google.person;

public class Company {
    private String Name;
    private String Department;
    private double Salary;

    public Company(String name, String department, double salary) {
        Name = name;
        Department = department;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Company:%n%s %s %.2f%n"
                ,this.Name
                ,this.Department
                ,this.Salary);
    }
}
