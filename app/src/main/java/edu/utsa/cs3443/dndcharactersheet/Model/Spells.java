package edu.utsa.cs3443.dndcharactersheet.Model;

import java.io.Serializable;
/**
 * @author Gael Sifuentes  11/05
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class Spells implements Serializable {
    //The spells class is a data structure to hold information regarding spell, will be implemented into character class
    //String of spell names and descritions
    String spellName, spellDescrpition;
    //Spells have varying degrees of power based on their level, therefore its important to denote such information
    int level;
    //Spell Constructor
    public Spells(String spellName, String spellDescrpition, int level) {
        this.spellName = spellName;
        this.spellDescrpition = spellDescrpition;
        this.level = level;
    }

    //Level Getters and setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    //Spell Name Getters and Setters
    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    //Description Getters and setters
    public String getSpellDescrpition() {
        return spellDescrpition;
    }

    public void setSpellDescrpition(String spellDescrpition) {
        this.spellDescrpition = spellDescrpition;
    }

    //Class toString
    @Override
    public String toString() {
        return "Spells{" +
                "spellName='" + spellName + '\'' +
                ", spellDescrpition='" + spellDescrpition + '\'' +
                ", level=" + level +
                '}';
    }
}
