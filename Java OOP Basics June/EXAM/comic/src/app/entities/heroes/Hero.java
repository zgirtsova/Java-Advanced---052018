package app.entities.heroes;

import app.constants.Constants;
import app.entities.ComicCharacterImpl;

public abstract class Hero extends ComicCharacterImpl {

    private double heroism;

    public Hero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence);
        this.setHeroism(heroism);
    }

    public double getHeroism() {
        return heroism;
    }

    public void setHeroism(double heroism) {
        if (heroism < 0) {
            throw new IllegalArgumentException(Constants.HERO_HEROISM_ERR);
        }
        this.heroism = heroism;
    }

    @Override
    public double getSpecial() {
        return this.heroism;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
