package p03_WildFarm.factories;

import p03_WildFarm.abstractions.Animal;
import p03_WildFarm.implclasses.animals.Cat;
import p03_WildFarm.implclasses.animals.Mouse;
import p03_WildFarm.implclasses.animals.Tiger;
import p03_WildFarm.implclasses.animals.Zebra;

public class AnimalFactory {

    public Animal getAnimalType(String[] animalInfo){
        String type = animalInfo[0];
        String name = animalInfo[1];
        double weight = Double.parseDouble(animalInfo[2]);
        String livingRegion = animalInfo[3];
        switch (type){
            case "Tiger":
              return new Tiger(name, type, weight, 0, livingRegion);
            case "Mouse":
               return new Mouse(name, type, weight,0, livingRegion);
            case "Zebra":
               return new Zebra(name, type, weight, 0, livingRegion);
            case "Cat":
                String breed = animalInfo[4];
               return new Cat(name, type, weight, 0, livingRegion, breed);
               default:return null;
        }
    }
}
