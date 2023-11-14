package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

public class Attributes {
    //Initializes the Name field, as well as the Armor Class and Speed statistics
    public String name; public String role;
    public int ac; public int spd;
    public int hp; public int initBonus;

    //------------------------------------------------------------------------------------------------------------

    //Constructors
    public Attributes(String name, String role,
                      int ac, int spd, int hp, int initBonus)
    {
        this.name = name; this.role = role;
        this.ac = ac; this.spd = spd;
        this.hp = hp; this.initBonus = initBonus;
    }


    //------------------------------------------------------------------------------------------------------------
    //Values getters and setters


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }


    public int getHp() {
        return hp;
    }


    public void setHp(int hp) {
        this.hp = hp;
    }


    public int getInitBonus() {
        return initBonus;
    }


    public void setInitBonus(int initBonus) {
        this.initBonus = initBonus;
    }


    @Override
    public String toString() {
        String g = "Name: " + getName();
        g += "\n Role: " + getRole();
        g += "\n Hp: " + getHp();
        g += "\n Ac: " + getAc();
        g += "\n Speed: " + getSpd();
        g += "\n Initiative: +" + getInitBonus() + "\n";
        return g;
    }
}
