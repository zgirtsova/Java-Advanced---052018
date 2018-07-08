package app.entities.antiheroes;

import app.contracts.ComicCharacter;

public class Titan extends AntiHero implements ComicCharacter {
    public Titan(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }

    //TODO ********************
    @Override
    public double attack() {
        return 0;
    }
}
