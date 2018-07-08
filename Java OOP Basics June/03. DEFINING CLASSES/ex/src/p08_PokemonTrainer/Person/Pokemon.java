package p08_PokemonTrainer.Person;

public class Pokemon {
    private String Name;
    private String Element;
    private Integer Health;

    public Pokemon(String name, String element, Integer health) {
        Name = name;
        Element = element;
        Health = health;
    }

    public String getElement() {
        return Element;
    }

    public Integer getHealth() {
        return Health;
    }

    public void setHealth(Integer health) {
        Health = health;
    }
}