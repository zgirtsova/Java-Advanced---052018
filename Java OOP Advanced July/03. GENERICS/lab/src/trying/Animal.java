package trying;

public class Animal {

    private String type;

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public Animal(String type) {
        this.type = type;
    }

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
