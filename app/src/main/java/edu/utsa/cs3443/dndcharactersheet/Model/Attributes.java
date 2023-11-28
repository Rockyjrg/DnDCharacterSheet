package edu.utsa.cs3443.dndcharactersheet.Model;

/**
 * @author Gael Sifuentes  11/14
 */

public class Attributes {
    //Initializes the Name field, as well as the Armor Class and Speed statistics

    //changed variables declared from "public String name; public String role;" -> what it is now

    public int ac, spd, hp, initBonus;


    //------------------------------------------------------------------------------------------------------------

    //Constructors
    public Attributes( int ac, int spd, int hp, int initBonus)
    {
        this.ac = ac;
        this.spd = spd;
        this.hp = hp;
    }


    //------------------------------------------------------------------------------------------------------------
    //Values getters and setters


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

}
