package app.entities;

import app.constants.Constants;
import app.contracts.ComicCharacter;
import app.contracts.SuperPower;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ComicCharacterImpl implements ComicCharacter {

    private String name;
    private int energy;
    private double health;
    private double intelligence;
    private Map<String, SuperPower> powers;

    public ComicCharacterImpl(String name, int energy, double health, double intelligence) {
        this.setName(name);
        this.setEnergy(energy);
        this.setHealth(health);
        this.setIntelligence(intelligence);
        //assuring valid state for List<SuperPower>
        this.powers = new HashMap<>();
    }

    public void setName(String name) {
        Pattern pattern = Pattern.compile("[A-Za-z_]{2,12}");
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException(Constants.COMIC_CHARACTER_NAME_ERR);
        }
    }

    public void setEnergy(int energy) {
        if (energy >= 0 && energy <= 300) {
            this.energy = energy;
        } else {
            throw new IllegalArgumentException(Constants.COMIC_CHARACTER_ENERGY_ERR);
        }
    }

    public void setHealth(double health) {
        if (health >= 0) {
            this.health = health;
        } else {
            throw new IllegalArgumentException(Constants.COMIC_CHARACTER_HEALTH_ERR);
        }

    }

    public void setIntelligence(double intelligence) {
        if (intelligence <= 200) {
            this.intelligence = intelligence;
        } else {
            throw new IllegalArgumentException(Constants.COMIC_CHARACTER_INTELLIGENCE_ERR);
        }
    }

    public Map<String, SuperPower> getPowers() {
        return this.powers;
    }

    @Override
    public void takeDamage(double damage) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void boostCharacter(int energy, double health, double intelligence) {
        try {
            this.setEnergy(energy);
            this.setHealth(health);
            this.setIntelligence(intelligence);
            System.out.println(String.format("%s evolved!", this.getName()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getIntelligence() {
        return this.intelligence;
    }

    @Override
    public String useSuperPowers() {
        if (this.powers.size() == 0) {
            return String.format("%s has no super powers!", this.getName());
        } else {
            return String.format("%s used his super powers!", this.getName());
        }
    }

    @Override
    public void addSuperPower(SuperPower superPower) {
        this.powers.put(superPower.getName(), superPower);
    }

}
