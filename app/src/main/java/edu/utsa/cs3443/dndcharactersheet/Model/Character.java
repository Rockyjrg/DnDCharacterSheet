package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

import java.util.List;

import edu.utsa.cs3443.dndcharactersheet.Model.Attributes;

import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

public class Character {

    private String name;
    private String race;

    private String charClass;
    private List<Statistics> statistics;
    private List<Attributes> attributes;


    public Character(String name, String race, String charClass, List<Statistics> statistics, List<Attributes> attributes) {
        this.name = name;
        this.race = race;
        this.charClass = charClass;
        this.statistics = statistics;
        this.attributes = attributes;

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

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }
}
