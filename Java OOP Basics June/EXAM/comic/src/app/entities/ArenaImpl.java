package app.entities;

import app.contracts.Arena;
import app.contracts.ComicCharacter;

import java.util.*;

public class ArenaImpl implements Arena {

    private String arenaName;
    private Map<String, ComicCharacter> heroes;
    private Map<String, ComicCharacter> antiHeroes;
    private int capacity;

    public ArenaImpl(String arenaName, int capacity) {
        this.setArenaName(arenaName);
        this.setCapacity(capacity);
        this.antiHeroes = new HashMap<>();
        this.heroes = new HashMap<>();
    }

    public void setArenaName(String arenaName) {
        this.arenaName = arenaName;
    }

    public Map<String, ComicCharacter> getHeroes() {
        return this.heroes;
    }

    public Map<String, ComicCharacter> getAntiHeroes() {
        return this.antiHeroes;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getArenaName() {
        return this.arenaName;
    }

    @Override
    public boolean isArenaFull() {
        int fightersOnTheGround = this.getHeroes().size() + this.getAntiHeroes().size();
        return this.capacity <= fightersOnTheGround;
    }

    @Override
    public void addHero(ComicCharacter hero) {
        this.heroes.put(hero.getName(), hero);
    }

    @Override
    public void addAntiHero(ComicCharacter antiHero) {
        this.antiHeroes.put(antiHero.getName(), antiHero);
    }

    @Override
    public boolean fightHeroes() {
        return false;
    }
}
