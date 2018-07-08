package p04_ShoppingSpree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private int money;
    private List<Product> shoppingBag;

    public Person(String name, int money) {
        this.setName(name);
        this.setMoney(money);
        this.setProductList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 1 || name.equals(" ")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private List<Product> getShoppingBag() {
        return shoppingBag;
    }

    private void setProductList() {
        this.shoppingBag = new ArrayList<>();
    }

    public void addProduct(Product product){
        if(product.getCost() > this.getMoney()){
            System.out.println(String.format("%s can't afford %s", getName(), product.getName()));
        } else {
            this.getShoppingBag().add(product);
            this.spentMoney(product.getCost());
        }
    }

    private void spentMoney(int cost){
        this.money -= cost;
    }


    @Override
    public String toString() {
        if(getShoppingBag().size() > 0) {
            return this.getName() + " - " + String.join(", ", this.getShoppingBag().toString()
                    .replaceAll("[]\\[]",""));
        } else {
            return  this.getName() + " - Nothing bought";
        }
    }
}
