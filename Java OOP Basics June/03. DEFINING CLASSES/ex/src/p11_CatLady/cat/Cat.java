package p11_CatLady.cat;

public abstract class Cat {
    private String name;
    private String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return this.name + " " + this.breed + " ";
    }
}
