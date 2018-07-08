package app.entities.antiheroes;

import app.contracts.ComicCharacter;

public class Villain extends AntiHero implements ComicCharacter {

    public Villain(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }

    //TODO ********************
    @Override
    public double attack() {
        return 0;
    }
}
