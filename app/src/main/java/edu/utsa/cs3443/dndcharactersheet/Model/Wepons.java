package edu.utsa.cs3443.dndcharactersheet.Model;

import java.io.Serializable;

/**
 * @author Gael Sifuentes  11/05
 * UTSA CS 3443 - Team Project
 * Fall 2023
 */
public class Wepons implements Serializable {
    /**
     * Yes I'm aware I misspelled weapon, it was an accident
     */

    //weapon name
    String name;

    //Bonus to weapon damages
    int attackBonus;

    //Types of damage a weapon gives can be tantamount for strategy
    String damageType;

    //Weapon class getters and setters
    public Wepons(String name, int attackBonus, String damageType) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.damageType = damageType;
    }

    //Weapon name getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Attack bonus getters and setters
    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    //Damage type Getters and Setters
    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        damageType = damageType;
    }

    //Class to string
    @Override
    public String toString() {
        return "Wepons{" +
                "name='" + name + '\'' +
                ", attackBonus=" + attackBonus +
                ", damageType='" + damageType + '\'' +
                '}';
    }
}
