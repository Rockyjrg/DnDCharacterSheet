package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

import edu.utsa.cs3443.dndcharactersheet.Model.Attributes;

import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

public class Character {

    private String name;
    private String race;
    private String characterClass;
    private String statistics;
    private String attributes;
//    public Statistics stats;
//    public Attributes atts;

    public Character(String name, String race, String characterClass, String statistics, String attributes) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.statistics = statistics;
        this.attributes = attributes;
    }

//    @Override
//    public String toString() {
//        return atts.toString() + stats.toString();
//    }
//


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

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}
