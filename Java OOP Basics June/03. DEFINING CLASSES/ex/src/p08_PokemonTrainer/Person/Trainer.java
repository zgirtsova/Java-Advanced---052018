package p08_PokemonTrainer.Person;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Trainer {
    private static final int LOST_HEALTH = 10;

    private String Name;
    private int Badges;
    private List<Pokemon> Pokemons;

    public Trainer() {
    }

    public Trainer(String name, int badges) {
        if (this.Pokemons == null) {
            this.Pokemons = new ArrayList<>();
        }

        this.Name = name;
        this.Badges = badges;
    }

    public int getBadges() {
        return this.Badges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.Pokemons.add(pokemon);
    }

    public void analize(String element) {
        // For every command you must check if a trainer has atleast 1 pokemon with the given element
        boolean trainerHasSuchPokemon = this.Pokemons.stream()
                .filter(p -> p.getElement().equals(element))
                .collect(Collectors.toList())
                .size() > 0;

        if (trainerHasSuchPokemon) {
            this.Badges++;
        } else {
            for (Pokemon pokemon : Pokemons) {
                pokemon.setHealth(pokemon.getHealth() - LOST_HEALTH);
            }
            //if a pokemon falls to 0 or less health he dies and must be deleted from the trainer’s collection
            Pokemons = this.Pokemons.stream().filter(p -> p.getHealth() > 0).collect(Collectors.toList());
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d%n", this.Name, this.Badges, this.Pokemons.size());
    }
}