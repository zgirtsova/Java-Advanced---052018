package p06_Animals_II;

public class Dog extends Animal {

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "BauBau";
    }



}
