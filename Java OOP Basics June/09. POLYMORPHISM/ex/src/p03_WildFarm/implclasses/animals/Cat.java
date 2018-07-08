package p03_WildFarm.implclasses.animals;

import p03_WildFarm.abstractions.Felime;
import p03_WildFarm.abstractions.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.setBreed(breed);
    }

    public final String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getAnimalType())
                .append("[")
                .append(super.getAnimalName())
                .append(", ")
                .append(this.getBreed())
                .append(", ")
                .append(String.format("%s", new DecimalFormat("#.##").format(super.getAnimalWeight())))
                .append(", ")
                .append(super.getLivingRegion())
                .append(", ")
                .append(super.getFoodEaten())
                .append("]")
                .append(System.lineSeparator());

        return sb.toString();
    }
}
