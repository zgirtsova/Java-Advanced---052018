package p09_Google.person;

public class Car {
    private String Model;
    private int Speed;

    public Car(String model, int speed) {
        Model = model;
        Speed = speed;
    }

    @Override
    public String toString() {
        return String.format("Car:%n%s %d%n"
                , this.Model
                , this.Speed);
    }
}
