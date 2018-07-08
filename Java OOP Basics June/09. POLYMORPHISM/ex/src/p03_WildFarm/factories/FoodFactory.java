package p03_WildFarm.factories;

import p03_WildFarm.abstractions.Food;
import p03_WildFarm.implclasses.food.Meat;
import p03_WildFarm.implclasses.food.Vegetable;

public class FoodFactory {

    public Food getFoodType(String[] foodInfo) {
        switch (foodInfo[0]) {
            case "Vegetable":
                return new Vegetable(Integer.parseInt(foodInfo[1]), foodInfo[0]);
            case "Meat":
                return new Meat(Integer.parseInt(foodInfo[1]), foodInfo[0]);
            default:
                return null;
        }
    }
}
