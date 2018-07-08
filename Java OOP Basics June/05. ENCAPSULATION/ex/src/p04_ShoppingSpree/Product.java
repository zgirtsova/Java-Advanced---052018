package p04_ShoppingSpree;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
