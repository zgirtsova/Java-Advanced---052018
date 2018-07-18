package trying;

import java.util.List;

public class AnimalList<T extends Animal> {

    private List<T> animals;

    public void add(T animal) {

        this.animals.add(animal);
    }

    public void putAnimalsToSleep() {
        for (T animal : animals) {
            animal.sleep();
        }
    }
}
