package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/03
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Character implements Serializable {

    //Character name
    private String name;

    //Character Race
    private String race;

    //Character class
    private String charClass;

    //Creates a Statistics class which hold numerical statistics
    private Statistics statistics;

    //Create an array list to hold a maximum of 3 weapons per character
    private ArrayList<Wepons> weapons;
    //Creates an array list to hold a maximum of 8 spells per character
    private ArrayList<Spells> spells;

    //Constructor for Character class
    public Character(String name, String race, String charClass, Statistics statistics) {
        this.name = name;
        this.race = race;
        this.charClass = charClass;
        this.statistics = statistics;

        //Declare the array lists for Character weapons and spells
        this.weapons = new ArrayList<Wepons>();
        this.spells = new ArrayList<Spells>();
        callArray();
    }

    public void callArray(){
        //Defults the information in both array, so the user can manually put them in later
        for(int i = 0; i<3; i++){
            weapons.add(new Wepons("NEW WEAPON",0,"NILL"));
        }
        for(int i = 0; i<3; i++){
            spells.add(new Spells("NEW SPELL","EMPTY",0));
        }
    }

    //Names getters and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Race getters and setters
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    //Character Class getters and setters
    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    //Array list getters and setters

    public ArrayList<Wepons> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Wepons> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Spells> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spells> spells) {
        this.spells = spells;
    }

    //Class toString
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", charClass='" + charClass + '\'' +
                ", statistics=" + statistics +
                ", weapons=" + weapons +
                ", spells=" + spells +
                '}';
    }
}
