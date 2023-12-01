package edu.utsa.cs3443.dndcharactersheet.Model;

import java.io.Serializable;

public class Wepons implements Serializable {
    String name;
    int attackBonus;
    String DamageType;

    public Wepons(String name, int attackBonus, String damageType) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.DamageType = damageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public String getDamageType() {
        return DamageType;
    }

    public void setDamageType(String damageType) {
        DamageType = damageType;
    }
}
