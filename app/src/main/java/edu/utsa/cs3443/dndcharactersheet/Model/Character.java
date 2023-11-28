package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

import java.util.List;

public class Character {

    private String name;
    private String race;
    private String charClass;
    private List<Statistics> statistics;
    private List<Wepons> weapons;
    private List<Spells> spells;

    public Character(String name, String race, String charClass, List<Statistics> statistics, List<Wepons> weapons, List<Spells> spells) {
        this.name = name;
        this.race = race;
        this.charClass = charClass;
        this.statistics = statistics;
        this.weapons = weapons;
        this.spells = spells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public List<Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Statistics> statistics) {
        this.statistics = statistics;
    }

    public List<Wepons> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Wepons> weapons) {
        this.weapons = weapons;
    }

    public List<Spells> getSpells() {
        return spells;
    }

    public void setSpells(List<Spells> spells) {
        this.spells = spells;
    }
}
