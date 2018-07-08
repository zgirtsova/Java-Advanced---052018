package p04_FragileBaseClass;

public class Predator extends Animal {

    private int health;

    public void feed(Food food) {
        this.health++;
        super.eat(food);
    }
}
