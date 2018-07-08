package app.entities.heroes;

import app.contracts.ComicCharacter;

public class DCHero extends Hero implements ComicCharacter {

    public DCHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }

    //TODO ********************
    @Override
    public double attack() {
        return 0;
    }
}
