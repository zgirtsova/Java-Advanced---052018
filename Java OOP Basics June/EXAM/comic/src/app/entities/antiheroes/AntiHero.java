package app.entities.antiheroes;

import app.constants.Constants;
import app.entities.ComicCharacterImpl;

public abstract class AntiHero extends ComicCharacterImpl {

    private double evilness;

    public AntiHero(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence);
        this.setEvilness(evilness);
    }

    public double getEvilness() {
        return this.evilness;
    }

    public void setEvilness(double evilness) {
        if (evilness < 0) {
            throw new IllegalArgumentException(Constants.ANTIHERO_EVILNESS_ERR);
        }
        this.evilness = evilness;
    }

    @Override
    public double getSpecial() {
        return this.evilness;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
