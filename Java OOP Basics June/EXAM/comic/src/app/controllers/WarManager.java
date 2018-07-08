package app.controllers;

import app.contracts.Arena;
import app.contracts.ComicCharacter;
import app.contracts.Manager;
import app.contracts.SuperPower;
import app.entities.ArenaImpl;
import app.entities.heroes.Hero;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WarManager implements Manager {

    private Map<String, ComicCharacter> characters;
    private Map<String, Arena> arenas;
    private Map<String, SuperPower> powers;

    public WarManager() {
        this.characters = new LinkedHashMap<>();
    }

    @Override
    public String checkComicCharacter(String characterName) {
        ComicCharacter character = this.characters.get(characterName);
        if (!this.characters.containsKey(characterName)) {
            return String.format("Sorry, fans! %s doesn't exist in our comics!", characterName);
        } else if (characters.get(characterName).getHealth() <= 0) {
            return String.format("%s has fallen in battle!", characterName);
        } else
            return String.format("#Name: %s", characterName);
    }

    @Override
    public String addHero(ComicCharacter hero) {

        if (this.characters.containsKey(hero)) {
            ComicCharacter currHero = this.characters.get(hero.getName());

            currHero.boostCharacter(hero.getEnergy(), hero.getHealth(), hero.getIntelligence());

        } else {
            this.characters.put(hero.getName(), hero);
        }
        return String.format("%s is ready for battle", hero.getName());
    }

    @Override
    public String addAntiHero(ComicCharacter antiHero) {
        if (this.characters.containsKey(antiHero)) {
            ComicCharacter currAntiHero = this.characters.get(antiHero.getName());

            currAntiHero.boostCharacter(antiHero.getEnergy(), antiHero.getHealth(), antiHero.getIntelligence());
        } else {
            this.characters.put(antiHero.getName(), antiHero);
        }
        return String.format("%s is ready for destruction!", antiHero.getName());
    }

    @Override
    public String addArena(Arena arena) {

        if (arenas.containsKey(arena.getArenaName())) {
            return "A battle is about to start there!";

        } else {
            this.arenas.put(arena.getArenaName(), arena);
            return String.format("%s is becoming a fighting ground!", arena.getArenaName());
        }
    }

    @Override
    public String addHeroToArena(String arena, String hero) {
        Arena currArena = this.arenas.get(arena);
        ComicCharacter currHero = this.characters.get(hero);

        if (isHeroHere(hero)) {
            System.out.println(String.format("%s is fighting!", hero));
        }
        if (isDead(arena, hero)) {
            return String.format("%s is dead", hero);
        }
        if (currArena.isArenaFull()) {
            return "Arena is full!";
        }
        currArena.addHero(currHero);
        return String.format("%s is fighting for your freedom in %s!", hero, arena);
    }


    @Override
    public String addAntiHeroToArena(String arena, String antiHero) {

        Arena currArena = this.arenas.get(arena);
        ComicCharacter currAntiHero = this.characters.get(antiHero);

        if (isAntiHeroHere(antiHero)) {
            return(String.format("%s is fighting!", antiHero));
        }
        if (isAntiHeroDead(arena, antiHero)) {
            return String.format("%s is dead", antiHero);
        }
        if (currArena.isArenaFull()) {
            return "Arena is full!";
        }
        currArena.addHero(currAntiHero);
        return String.format("%s and his colleagues are trying to take over %s!", antiHero, arena);
    }


    @Override
    public String loadSuperPowerToPool(SuperPower superPower) {
        if (this.powers.containsKey(superPower.getName())) {
            return "This super power already exists!";
        } else {
            this.powers.put(superPower.getName(), superPower);
            return String.format("%s added to pool", superPower.getName());
        }
    }

    @Override
    public String assignSuperPowerToComicCharacter(String comicCharacter, String superPower) {
        boolean isPowerAssigned = this.powers.values()
                .stream()
                .map(x -> x.getName())
                .filter(x -> x.equals(superPower))
                .count() > 0;
        if (isPowerAssigned) {
            return String.format("%s already assigned!", superPower);
        }
        this.characters.get(comicCharacter).addSuperPower(this.powers.get(superPower));
        return String.format("%s has a new super power!", comicCharacter);
    }

    @Override
    public String usePowers(String characterName) {
        ComicCharacter character = this.characters.get(characterName);
        return character.useSuperPowers();
    }

    @Override
    public String startBattle(String arena) {

        // TODO********************
        return null;
    }

    @Override
    public String endWar() {
        //TODO*******************
        return null;
    }

    private boolean isAntiHeroHere(String antiHero) {
        for (Arena ar : this.arenas.values()) {
            ArenaImpl currentArena = (ArenaImpl)ar;
            if (currentArena.getAntiHeroes().containsKey(antiHero)) {
                return true;
            }
        }
        return false;
    }

    private boolean isHeroHere(String hero) {
        for (Arena ar : this.arenas.values()) {
            ArenaImpl currentArena = (ArenaImpl)ar;
            if (currentArena.getHeroes().containsKey(hero)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDead(String arena, String hero) {
        ArenaImpl currArena = (ArenaImpl) this.arenas.get(arena);
        if (currArena.getHeroes().get(hero).getHealth() <= 0) {
            return true;
        } else {
            return false;
        }
    }
    private boolean isAntiHeroDead(String arena, String antiHero) {
        ArenaImpl currArena = (ArenaImpl) this.arenas.get(arena);
        if (currArena.getAntiHeroes().get(antiHero).getHealth() <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
