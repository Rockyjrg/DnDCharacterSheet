package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Character implements Serializable {

    private String name;
    private String race;
    private String charClass;
    private Statistics statistics;
    private ArrayList<Wepons> weapons;
    private ArrayList<Spells> spells;

    public Character(String name, String race, String charClass, Statistics statistics) {
        this.name = name;
        this.race = race;
        this.charClass = charClass;
        this.statistics = statistics;
        this.weapons = new ArrayList<Wepons>();
        this.spells = new ArrayList<Spells>();
        callArray();
    }

    public void callArray(){
        for(int i = 0; i<3; i++){
            weapons.add(new Wepons("NEW WEAPON",0,"NILL"));
        }
        for(int i = 0; i<3; i++){
            spells.add(new Spells("NEW SPELL","EMPTY",0));
        }
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

  /*  public List<Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Statistics> statistics) {
        this.statistics = statistics;
    }
*/
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
}
